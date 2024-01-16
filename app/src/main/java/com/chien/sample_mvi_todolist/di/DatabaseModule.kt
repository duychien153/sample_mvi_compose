package com.chien.sample_mvi_todolist.di

import android.content.Context
import androidx.room.Room
import com.chien.sample_mvi_todolist.data.source.local.dao.TodoDao
import com.chien.sample_mvi_todolist.data.source.local.dao.TodoDatabase
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object DatabaseModule {

    @Singleton
    @Provides
    fun provideTodoDao(todoDatabase: TodoDatabase): TodoDao =
        todoDatabase.todoDao

    @Provides
    fun provideTodoDatabase(
        @ApplicationContext context: Context
    ): TodoDatabase {
        return Room.databaseBuilder(
            context,
            TodoDatabase::class.java,
            "todo_database"
        ).fallbackToDestructiveMigration().build()
    }
}