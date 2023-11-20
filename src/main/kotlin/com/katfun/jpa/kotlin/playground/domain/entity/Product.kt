package com.katfun.jpa.kotlin.playground.domain.entity

import jakarta.persistence.Column
import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id

@Entity
class Product(
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "product_id")
    @Id
    val id: Long?,

    @Column
    var name: String,

    @Column
    var price: Long,

    @Column
    var stockQuantity: Long?
)
