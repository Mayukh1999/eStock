package com.stock.mdpd.domain.model

import androidx.room.ColumnInfo
import java.time.LocalDateTime

data class IntradayInfo(
    @ColumnInfo(name = "date")
    private val _date: LocalDateTime,
    @ColumnInfo(name = "close")
    private val _close: Double
) {
    val date: LocalDateTime
        get() {
            return _date
        }
    val close: Double
        get() {
            return _close
        }
}
