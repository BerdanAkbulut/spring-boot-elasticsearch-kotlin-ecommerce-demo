package com.berdanakbulut.kotlinecommercedemo.config.elasticsearch

import co.elastic.clients.elasticsearch.ElasticsearchClient
import co.elastic.clients.json.jackson.JacksonJsonpMapper
import co.elastic.clients.transport.ElasticsearchTransport
import co.elastic.clients.transport.rest_client.RestClientTransport
import com.berdanakbulut.kotlinecommercedemo.config.elasticsearch.AppConfig.ELASTICSEARCH_HOST
import com.berdanakbulut.kotlinecommercedemo.config.elasticsearch.AppConfig.ELASTICSEARCH_PORT
import org.apache.http.HttpHost
import org.elasticsearch.client.RestClient
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

@Configuration
class ElasticSearchConfig {
    @Bean fun restClient(): RestClient = RestClient.builder(HttpHost(ELASTICSEARCH_HOST, ELASTICSEARCH_PORT)).build()
    @Bean fun elasticsearchTransport(): ElasticsearchTransport = RestClientTransport(restClient(), JacksonJsonpMapper())
    @Bean fun elasticsearchClient(): ElasticsearchClient = ElasticsearchClient(elasticsearchTransport())
}