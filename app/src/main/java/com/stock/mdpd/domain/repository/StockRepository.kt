package com.stock.mdpd.domain.repository

import com.stock.mdpd.domain.model.CompanyInfo
import com.stock.mdpd.domain.model.CompanyListing
import com.stock.mdpd.domain.model.IntradayInfo
import com.stock.mdpd.util.Resource
import kotlinx.coroutines.flow.Flow

interface StockRepository {

    suspend fun getCompanyListings(
        fetchFromRemote: Boolean,
        query: String
    ): Flow<Resource<List<CompanyListing>>>

    suspend fun getIntradayInfo(
        symbol: String
    ): Resource<List<IntradayInfo>>

    suspend fun getCompanyInfo(
        symbol: String
    ): Resource<CompanyInfo>
}