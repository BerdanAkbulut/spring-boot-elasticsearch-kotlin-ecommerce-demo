package com.berdanakbulut.kotlinecommercedemo.repository.impl

import EcommerceOrder
import Product
import co.elastic.clients.elasticsearch.ElasticsearchClient
import co.elastic.clients.elasticsearch.core.GetRequest
import co.elastic.clients.elasticsearch.core.SearchRequest
import co.elastic.clients.elasticsearch.core.SearchResponse
import com.berdanakbulut.kotlinecommercedemo.config.elasticsearch.AppConfig.ELASTICSEARCH_ECOMMERCE_INDEX_NAME
import com.berdanakbulut.kotlinecommercedemo.repository.ElasticSearchRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Repository
import org.springframework.util.StringUtils
import java.lang.IllegalStateException

@Repository
class ElasticSearchRepositoryImpl: ElasticSearchRepository {

    @Autowired lateinit var client: ElasticsearchClient

    override fun getOrderById(id: String): EcommerceOrder {
        var getRequest: GetRequest = GetRequest.of {q -> q.index(ELASTICSEARCH_ECOMMERCE_INDEX_NAME).id(id)}
        val getResponse = client.get(getRequest, EcommerceOrder::class.java)

        if(!getResponse.found() || getResponse.source() == null) throw IllegalStateException("Order not found with by id $id")
        return getResponse.source()!!
    }

}