package com.chien.sample_mvi_todolist.domain.repository

import com.chien.sample_mvi_todolist.data.source.local.model.TodoItem
import kotlinx.coroutines.flow.Flow

interface TodoRepository {

    fun getAllTodoTasks(): Flow<List<TodoItem>>

    suspend fun addTask(newTask: TodoItem)

    suspend fun updateTask(updatedTask: TodoItem)

    suspend fun deleteTask(id: Int)

    suspend fun markTaskCompleted(id: Int, status: Boolean)
}