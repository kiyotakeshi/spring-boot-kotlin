package com.kiyotakeshi.springboot.kotlin.datasource.mock

import com.kiyotakeshi.springboot.kotlin.datasource.BankDataSource
import com.kiyotakeshi.springboot.kotlin.model.Bank
import org.springframework.stereotype.Repository

// repository class is responsible for retrieving data storing data
@Repository
class MockBankDataSource : BankDataSource {

    val banks = listOf(
            Bank("1234", 1.0, 1),
            Bank("1000", 10.0, 0),
            Bank("1111", 1.1, 100)
    )

    override fun retrieveBanks(): Collection<Bank> = banks

//    override fun getBanks(): Collection<Bank> {
//
//        // return emptyList() // in TDD method first step
//        // return listOf(Bank("", 0.0, 1)) // second
//        return banks
//    }
}