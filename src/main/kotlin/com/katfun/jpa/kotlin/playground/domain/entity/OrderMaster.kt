package com.katfun.jpa.kotlin.playground.domain.entity

import com.katfun.jpa.kotlin.playground.code.OrderStatusType
import jakarta.persistence.Column
import jakarta.persistence.Entity
import jakarta.persistence.EnumType
import jakarta.persistence.Enumerated
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id
import jakarta.persistence.JoinColumn
import jakarta.persistence.ManyToOne
import jakarta.persistence.OneToMany

@Entity
class OrderMaster(
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "order_id")
    @Id
    val id: Long?,

    @ManyToOne
    @JoinColumn(name = "member_id")
    var member: Member?,

    @OneToMany(mappedBy = "order")
    val orderProducts: ArrayList<OrderProduct>,

    @Enumerated(EnumType.STRING)
    val status: OrderStatusType
) {
    fun setMemberConvenience(member: Member) {
        if (this.member != null) this.member?.orders?.remove(this)
        this.member = member
        member.orders.add(this)
    }

    fun addOrderProduct(orderProduct: OrderProduct) {
        orderProducts.add(orderProduct)
        orderProduct.order = this
    }
}
