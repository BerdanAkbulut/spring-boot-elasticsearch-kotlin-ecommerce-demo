package com.berdanakbulut.kotlinecommercedemo.service

import EcommerceOrder
import org.springframework.stereotype.Service

@Service
interface OrderService {
    fun getOrderById(id: String): EcommerceOrder
}