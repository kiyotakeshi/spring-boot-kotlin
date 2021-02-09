package com.kiyotakeshi.springboot.kotlin.datasource.mock

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class MockBankDataSourceTest {

    // kotlin the type is inferred automatically, you don't have to have the type there
    // private val mockDataSource: MockBankDataSource = MockBankDataSource()
    private val mockDataSource = MockBankDataSource()

    @Test
    fun `should provide a collection of banks`() {
        val banks = mockDataSource.retrieveBanks()

        // assertj dependency comes with spring boot starter test
        assertThat(banks).isNotEmpty;
        assertThat(banks.size).isGreaterThanOrEqualTo(3)
    }

    @Test
    fun `should provide some mock data`() {
        val banks = mockDataSource.retrieveBanks()
        assertThat(banks).allMatch{ it.accountNumber.isNotBlank()}
        assertThat(banks).anyMatch{ it.trust != 0.0}
        assertThat(banks).anyMatch{ it.transactionFee != 0}
    }
}