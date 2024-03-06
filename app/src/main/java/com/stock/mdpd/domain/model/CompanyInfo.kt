package com.stock.mdpd.domain.model

import androidx.room.ColumnInfo

data class CompanyInfo(
    @ColumnInfo(name = "symbol")
    private val _symbol: String,
    @ColumnInfo(name = "description")
    private val _description: String,
    @ColumnInfo(name = "name")
    private val _name: String,
    @ColumnInfo(name = "country")
    private val _country: String,
    @ColumnInfo(name = "industry")
    private val _industry: String,
) {
    val symbol: String
        get() {
            return _symbol
        }
    val description: String
        get() {
            return _description
        }
    val name: String
        get() {
            return _name
        }
    val country: String
        get() {
            return _country
        }
    val industry: String
        get() {
            return _industry
        }
}