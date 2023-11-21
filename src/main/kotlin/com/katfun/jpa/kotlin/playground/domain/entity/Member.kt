package com.katfun.jpa.kotlin.playground.domain.entity

import jakarta.persistence.Column
import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id
import jakarta.persistence.OneToMany

@Entity
class Member(
    @Column(name = "member_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    val id: Long?,

    @Column(name = "name")
    val name: String,

    @Column(name = "city")
    var city: String?,

    @Column(name = "street")
    var street: String?,

    @Column(name = "zipcode")
    var zipcode: String?,

    @OneToMany(mappedBy = "member")
    val orders: ArrayList<OrderMaster>
)
