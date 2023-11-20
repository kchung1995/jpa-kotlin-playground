package com.katfun.jpa.kotlin.playground.domain.entity

import jakarta.persistence.Column
import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id

@Entity
class Member(
    @Column(name = "member_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    val id: Long?,

    @Column
    val name: String,

    @Column
    var city: String?,

    @Column
    var street: String?,

    @Column
    var zipcode: String?
)
