package com.softwareit.recyclerview.data

import com.softwareit.recyclerview.model.JobListItem
import com.softwareit.recyclerview.R

object DataSource {
    val jobItems = listOf(
        JobListItem.Category(
            id = 0,
            name = "Designer"
        ),
        JobListItem.Job(
            id = 1,
            name = "Junior UX Designer",
            company = "Canva",
            image = R.drawable.ic_canva,
            salaryPerYearRangeInK = 40 to 60
        ),
        JobListItem.Job(
            id = 2,
            name = "Middle UX Designer",
            company = "Canva",
            image = R.drawable.ic_canva,
            salaryPerYearRangeInK = 60 to 80
        ),
        JobListItem.Job(
            id = 3,
            name = "Senior UX Designer",
            company = "Canva",
            image = R.drawable.ic_canva,
            salaryPerYearRangeInK = 80 to 100
        ),
        JobListItem.Category(
            id = 4,
            name = "Android Developer"
        ),
        JobListItem.Job(
            id = 5,
            name = "Junior Android Developer",
            company = "Canva",
            image = R.drawable.ic_canva,
            salaryPerYearRangeInK = 40 to 60
        ),
        JobListItem.Job(
            id = 6,
            name = "Middle Android Developer",
            company = "Canva",
            image = R.drawable.ic_canva,
            salaryPerYearRangeInK = 60 to 80
        ),
        JobListItem.Job(
            id = 7,
            name = "Senior Android Developer",
            company = "Canva",
            image = R.drawable.ic_canva,
            salaryPerYearRangeInK = 80 to 100
        ),
        JobListItem.Category(
            id = 8,
            name = "IOS Developer"
        ),
        JobListItem.Job(
            id = 9,
            name = "Junior IOS Developer",
            company = "Canva",
            image = R.drawable.ic_canva,
            salaryPerYearRangeInK = 40 to 60
        ),
        JobListItem.Job(
            id = 10,
            name = "Middle IOS Developer",
            company = "Canva",
            image = R.drawable.ic_canva,
            salaryPerYearRangeInK = 60 to 80
        ),
        JobListItem.Job(
            id = 11,
            name = "Senior IOS Developer",
            company = "Canva",
            image = R.drawable.ic_canva,
            salaryPerYearRangeInK = 80 to 100
        ),
        JobListItem.Category(
            id = 12,
            name = "Backend Developer"
        ),
        JobListItem.Job(
            id = 13,
            name = "Junior Backend Developer",
            company = "Canva",
            image = R.drawable.ic_canva,
            salaryPerYearRangeInK = 40 to 60
        ),
        JobListItem.Job(
            id = 14,
            name = "Middle Backend Developer",
            company = "Canva",
            image = R.drawable.ic_canva,
            salaryPerYearRangeInK = 60 to 80
        ),
        JobListItem.Job(
            id = 15,
            name = "Senior Backend Developer",
            company = "Canva",
            image = R.drawable.ic_canva,
            salaryPerYearRangeInK = 80 to 100
        ),
        JobListItem.Category(
            id = 16,
            name = "QA"
        ),
        JobListItem.Job(
            id = 17,
            name = "Junior QA Developer",
            company = "Canva",
            image = R.drawable.ic_canva,
            salaryPerYearRangeInK = 40 to 60
        ),
        JobListItem.Job(
            id = 18,
            name = "Middle QA Developer",
            company = "Canva",
            image = R.drawable.ic_canva,
            salaryPerYearRangeInK = 60 to 80
        ),
        JobListItem.Job(
            id = 19,
            name = "Senior QA Developer",
            company = "Canva",
            image = R.drawable.ic_canva,
            salaryPerYearRangeInK = 80 to 100
        ),
    )
}