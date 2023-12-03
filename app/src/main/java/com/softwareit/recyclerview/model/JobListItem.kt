package com.softwareit.recyclerview.model

import androidx.annotation.DrawableRes

sealed class JobListItem(open val id: Int) {
    data class Job(
        override val id: Int,
        val name: String,
        val company: String,
        @DrawableRes val image: Int,
        val salaryPerYearRangeInK: Pair<Int, Int>,
    ) : JobListItem(id)

    data class Category(
        override val id: Int,
        val name: String,
    ) : JobListItem(id)
}
