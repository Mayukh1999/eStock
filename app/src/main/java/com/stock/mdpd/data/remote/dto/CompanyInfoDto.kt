package com.stock.mdpd.data.remote.dto

import com.squareup.moshi.Json

data class CompanyInfoDto(
    @field:Json(name = "Symbol")
    private val _symbol: String?,
    @field:Json(name = "Description")
    private val _description: String?,
    @field:Json(name = "Name")
    private val _name: String?,
    @field:Json(name = "Country")
    private val _country: String?,
    @field:Json(name = "Industry")
    private val _industry: String?,
)
{
    val symbol: String?
        get() {
            return _symbol
        }
    val description: String?
        get() {
            return _description
        }
    val name: String?
        get() {
            return _name
        }
    val country: String?
        get() {
            return _country
        }
    val industry: String?
        get() {
            return _industry
        }
}
