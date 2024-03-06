package com.stock.mdpd.domain.model

import androidx.room.ColumnInfo

data class CompanyListing(
    @ColumnInfo(name = "name")
    private val _name: String,
    @ColumnInfo(name = "symbol")
    private val _symbol: String,
    @ColumnInfo(name = "exchange")
    private val _exchange: String,
) {
    val name: String
        get() {
            return _name
        }
    val symbol: String
        get() {
            return _symbol
        }
    val exchange: String
        get() {
            return _exchange
        }
}
