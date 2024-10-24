package io.github.selcukdinc.mywishlistapp.data

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "wish-table")
data class Wish(
    @PrimaryKey(autoGenerate = true)
    val id: Long = 0L,
    @ColumnInfo(name = "wish-title")
    val title: String = "",
    @ColumnInfo(name = "wish-desc")
    val description: String = ""
)

object DummyWish{
    val wishList = listOf(
        Wish(title = "Google Watch 2",
            description = "An Android Watch"),
        Wish(title = "RTX 5090",
            description = "Super speed graphics card"),
        Wish(title = "Time",
            description = "Extra time for everything"),
        Wish(title = "Humor",
            description = "Absolute should be a any person on it"),
        Wish(title = "Money",
            description = "Much more Money Money Money!")
    )
}
