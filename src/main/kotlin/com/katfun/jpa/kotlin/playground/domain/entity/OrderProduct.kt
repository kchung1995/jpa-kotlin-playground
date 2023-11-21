package com.katfun.jpa.kotlin.playground.domain.entity

import jakarta.persistence.Column
import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id
import jakarta.persistence.JoinColumn
import jakarta.persistence.ManyToOne

@Entity
class OrderProduct(
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "order_products_id")
    @Id
    val id: Long?,

    @ManyToOne
    @JoinColumn(name = "order_master_id")
    var order: OrderMaster?,

    @ManyToOne
    @JoinColumn(name = "product_id")
    var product: Product?,

    @Column(name = "price")
    var price: Long,

    @Column(name = "count")
    var count: Int
)
