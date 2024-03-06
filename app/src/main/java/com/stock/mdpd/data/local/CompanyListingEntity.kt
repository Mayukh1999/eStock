package com.stock.mdpd.data.local

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class CompanyListingEntity(
    @ColumnInfo(name = "name")
    private val _name: String,
    @ColumnInfo(name = "symbol")
    private val _symbol: String,
    @ColumnInfo(name = "exchange")
    private val _exchange: String,
    @PrimaryKey
    val id: Int? = null
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
