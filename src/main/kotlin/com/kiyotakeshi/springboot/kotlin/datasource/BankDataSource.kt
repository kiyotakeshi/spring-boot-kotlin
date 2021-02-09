package com.kiyotakeshi.springboot.kotlin.datasource

import com.kiyotakeshi.springboot.kotlin.model.Bank

interface BankDataSource {

    fun retrieveBanks(): Collection<Bank>
}