package com.berdanakbulut.kotlinecommercedemo.service.impl

import EcommerceOrder
import com.berdanakbulut.kotlinecommercedemo.repository.ElasticSearchRepository
import com.berdanakbulut.kotlinecommercedemo.service.OrderService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service
import org.springframework.util.StringUtils

@Service
class OrderServiceImpl: OrderService {

    @Autowired lateinit var elasticSearchRepository: ElasticSearchRepository

    override fun getOrderById(id: String): EcommerceOrder {
        if (!StringUtils.hasLength(id)) throw IllegalArgumentException("Id is missing !")
        return elasticSearchRepository.getOrderById(id)
    }
}