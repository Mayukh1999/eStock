package com.stock.mdpd.data.remote.dto

data class IntradayInfoDto(
    private val _timestamp: String,
    private val _close: Double
) {
    val timestamp: String?
        get() {
            return _timestamp
        }
    val close: Double
        get() {
            return _close
        }
}
