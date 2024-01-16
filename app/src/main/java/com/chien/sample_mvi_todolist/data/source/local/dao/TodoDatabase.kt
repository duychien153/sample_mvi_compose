package com.chien.sample_mvi_todolist.data.source.local.dao

import androidx.room.Database
import androidx.room.RoomDatabase
import com.chien.sample_mvi_todolist.data.source.local.model.TodoItem

@Database(entities = [TodoItem::class], version = 1, exportSchema = false)
abstract class TodoDatabase : RoomDatabase() {
    abstract val todoDao: TodoDao
}