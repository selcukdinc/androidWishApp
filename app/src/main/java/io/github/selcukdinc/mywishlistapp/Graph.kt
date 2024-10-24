package io.github.selcukdinc.mywishlistapp

import android.content.Context
import androidx.room.Room
import io.github.selcukdinc.mywishlistapp.data.WishDatabase
import io.github.selcukdinc.mywishlistapp.data.WishRepository

object Graph {
    lateinit var database: WishDatabase

    val wishRepository by lazy {
        WishRepository(wishDao = database.wishDao())
    }

    fun provide(context: Context){
        database = Room.databaseBuilder(context = context, klass = WishDatabase::class.java, name = "wishlist.db").build()
    }

}