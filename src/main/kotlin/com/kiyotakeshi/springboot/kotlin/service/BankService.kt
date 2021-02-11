package com.kiyotakeshi.springboot.kotlin.service

import com.kiyotakeshi.springboot.kotlin.datasource.BankDataSource
import com.kiyotakeshi.springboot.kotlin.model.Bank
import org.springframework.stereotype.Service

@Service
class BankService (private val dataSource: BankDataSource) {

//    fun getBanks(): Collection<Bank> {
//        return this.dataSource.retrieveBanks()
//    }
    fun getBanks(): Collection<Bank> = this.dataSource.retrieveBanks()
}