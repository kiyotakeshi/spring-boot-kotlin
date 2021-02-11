package com.kiyotakeshi.springboot.kotlin.service

import com.kiyotakeshi.springboot.kotlin.datasource.BankDataSource
import io.mockk.every
import io.mockk.mockk
import io.mockk.verify
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

internal class BankServiceTest {

    // relaxed means whenever a method is called, it will return some kind of default value
    private val dataSource: BankDataSource = mockk(relaxed = true)

    private val bankService = BankService(dataSource);

    @Test
    fun `should call its data source to retrieve banks`() {

        // if you want to specify explicitly, you should use the every
        // every { dataSource.retrieveBanks() } returns emptyList()

        bankService.getBanks()

        verify(exactly = 1) { dataSource.retrieveBanks() }
    }
}