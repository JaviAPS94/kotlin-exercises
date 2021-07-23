package com.javiaps94.workingwithclasses.kotlin

data class Customer (
        val name: String,
        val address: String,
        var age: Int
        ) {
    constructor(name: String, age: Int) : this(name, "", age) {
        println("secondary constructor")
    }

    init {
        println("init block")
    }
}

class AlternativeCustomer (val name: String, val age: Int) {
    var address: String = ""
    constructor(name: String, address: String, age: Int): this(name, age) {
        this.address = address
    }
}

class AnotherAlternativeCustomer (val name: String, var age: Int, val address: String = "") {
    var approved: Boolean = false
    set(value) {
        if (age >= 21) {
            field = value
        } else {
            println("You cant approve a customer under 21 years old")
        }
    }

    val nextAge
    get() = age +1

    operator fun component1() = name
    operator fun component2() = age

    fun uppercaseName() = name.toUpperCase()

    override fun toString() = "$name $address $age"

    companion object {
        fun getInstance() = AnotherAlternativeCustomer("Nicky", 21, "Some address")
    }
}

fun main(args: Array<String>) {
    val customer = AnotherAlternativeCustomer("Alex", 20, "Quito")
    customer.age = 19
    customer.approved = true
    val customer2 = AnotherAlternativeCustomer("Javier", 31)
    customer2.approved = true
    println("$customer is ${customer.age} years old and is ${customer.approved}")
    println("${customer2.name} is ${customer2.age} years old and is ${customer2.approved}")
    println("Next year ${customer.uppercaseName()} will be ${customer.nextAge}")

    val customer3 = AnotherAlternativeCustomer.getInstance()
    println(customer3)

    val customer4 = Customer("Maria", 23)
    println(customer4)
    val customer5 = customer4.copy(name="Dayana")
    println(customer5)

    val (name, address, age) = customer5
    println(address)
}