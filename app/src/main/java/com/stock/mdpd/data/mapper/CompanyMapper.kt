package com.stock.mdpd.data.mapper

import com.stock.mdpd.data.local.CompanyListingEntity
import com.stock.mdpd.data.remote.dto.CompanyInfoDto
import com.stock.mdpd.domain.model.CompanyInfo
import com.stock.mdpd.domain.model.CompanyListing

fun CompanyListingEntity.toCompanyListing(): CompanyListing {
    return CompanyListing(
        _name = name,
        _symbol = symbol,
        _exchange = exchange
    )
}

fun CompanyListing.toCompanyListingEntity(): CompanyListingEntity {
    return CompanyListingEntity(
        _name = name,
        _symbol = symbol,
        _exchange = exchange
    )
}

fun CompanyInfoDto.toCompanyInfo(): CompanyInfo {
    return CompanyInfo(
        _symbol = symbol ?: "",
        _description = description ?: "",
        _name = name ?: "",
        _country = country ?: "",
        _industry = industry ?: ""
    )
}