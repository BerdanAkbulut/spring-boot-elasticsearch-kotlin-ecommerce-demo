package com.berdanakbulut.kotlinecommercedemo.repository

import EcommerceOrder
import org.springframework.stereotype.Repository

@Repository
interface ElasticSearchRepository {
    fun getOrderById(id: String): EcommerceOrder
}