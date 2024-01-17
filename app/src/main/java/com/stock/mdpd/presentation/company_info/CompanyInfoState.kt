package com.stock.mdpd.presentation.company_info

import com.stock.mdpd.domain.model.CompanyInfo
import com.stock.mdpd.domain.model.IntradayInfo

data class CompanyInfoState(
    val stockInfos: List<IntradayInfo> = emptyList(),
    val company: CompanyInfo? = null,
    val isLoading: Boolean = false,
    val error: String? = null
)
