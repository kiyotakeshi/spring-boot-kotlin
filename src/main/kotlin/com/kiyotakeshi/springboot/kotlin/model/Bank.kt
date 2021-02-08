package com.kiyotakeshi.springboot.kotlin.model

// data class has features,some of them include that it automatically create a standard implementation of
// equals, hashcode and toString method
// in java 14 preview feature, "records" are basically the same thing
// java is also catching up improving some of those boilerplate
data class Bank(
        // class and its properties are public
        // you don't need to have the modifier(redundant)
        // public val accountNumber: String,
        val accountNumber: String,
        val trust: Double,
        val transactionFee: Int
)

// finally, you don't need following code :)
//{

// val content will already generate the default getter
// only if you want to perform some custom logic then you can overwrite the get and set methods
// get() = field

// this type definition is for the secondary constructor
//    constructor(accountNumber: String, trust: Double, transactionFee: Int) {
//        this.accountNumber = accountNumber
//        this.trust = trust
//        this.transactionFee = transactionFee
//    }

//    override fun equals(other: Any?): Boolean {
//        if (this === other) return true
//        if (javaClass != other?.javaClass) return false
//
//        other as Bank
//
//        if (accountNumber != other.accountNumber) return false
//        if (trust != other.trust) return false
//        if (transactionFee != other.transactionFee) return false
//
//        return true
//    }
//
//    override fun hashCode(): Int {
//        var result = accountNumber.hashCode()
//        result = 31 * result + trust.hashCode()
//        result = 31 * result + transactionFee
//        return result
//    }
//
//    override fun toString(): String {
//        return "Bank(accountNumber='$accountNumber', trust=$trust, transactionFee=$transactionFee)"
//    }
//}