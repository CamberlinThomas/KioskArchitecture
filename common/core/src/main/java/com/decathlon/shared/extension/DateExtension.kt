package com.decathlon.shared.extension

import java.text.SimpleDateFormat
import java.util.*

fun Date.toSimpleDateFormatUTC(format: String): String =
    SimpleDateFormat(format)
        .apply { timeZone = TimeZone.getTimeZone("UTC") }
        .let { it.format(this) }