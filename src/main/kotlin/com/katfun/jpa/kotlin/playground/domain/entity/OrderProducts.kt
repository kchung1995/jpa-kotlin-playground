package com.katfun.jpa.kotlin.playground.domain.entity

import jakarta.persistence.Column
import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id

@Entity
class OrderProducts(
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "order_products_id")
    @Id
    val id: Long?,

    @Column(name = "order_id")
    val orderId: Long,

    @Column(name = "product_id")
    val productId: Long,

    @Column(name = "price")
    var price: Long,

    @Column(name = "count")
    var count: Int
)
