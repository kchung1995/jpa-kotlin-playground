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

    @Column
    val orderId: Long,

    @Column
    val productId: Long,

    @Column
    var price: Long,

    @Column
    var count: Int
)
