package com.katfun.jpa.kotlin.playground.domain.entity

import com.katfun.jpa.kotlin.playground.code.OrderStatusType
import jakarta.persistence.Column
import jakarta.persistence.Entity
import jakarta.persistence.EnumType
import jakarta.persistence.Enumerated
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id

@Entity
class Order(
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "order_id")
    @Id
    val id: Long?,

    @Column(name = "member_id")
    val memberId: Long,

    @Enumerated(EnumType.STRING)
    val status: OrderStatusType
)
