package com.stock.mdpd.di

import com.stock.mdpd.data.csv.CSVParser
import com.stock.mdpd.data.csv.CompanyListingsParser
import com.stock.mdpd.data.csv.IntradayInfoParser
import com.stock.mdpd.data.repository.StockRepositoryImpl
import com.stock.mdpd.domain.model.CompanyListing
import com.stock.mdpd.domain.model.IntradayInfo
import com.stock.mdpd.domain.repository.StockRepository
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
abstract class RepositoryModule {

    @Binds
    @Singleton
    abstract fun bindCompanyListingsParser(
        companyListingsParser: CompanyListingsParser
    ): CSVParser<CompanyListing>

    @Binds
    @Singleton
    abstract fun bindIntradayInfoParser(
        intradayInfoParser: IntradayInfoParser
    ): CSVParser<IntradayInfo>

    @Binds
    @Singleton
    abstract fun bindStockRepository(
        stockRepositoryImpl: StockRepositoryImpl
    ): StockRepository
}