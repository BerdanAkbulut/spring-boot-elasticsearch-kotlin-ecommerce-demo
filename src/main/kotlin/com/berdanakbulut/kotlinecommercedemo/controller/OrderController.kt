package com.berdanakbulut.kotlinecommercedemo.controller

import EcommerceOrder
import com.berdanakbulut.kotlinecommercedemo.service.OrderService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api/order/")
class OrderController {

    @Autowired lateinit var orderService: OrderService

    @GetMapping("{id}")
    fun getOrderById(@PathVariable("id") id: String): ResponseEntity<EcommerceOrder> {
        return ResponseEntity.ok(orderService.getOrderById(id))
    }
}