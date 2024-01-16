package com.chien.sample_mvi_todolist.data.repository

import com.chien.sample_mvi_todolist.data.source.local.dao.TodoDao
import com.chien.sample_mvi_todolist.data.source.local.model.TodoItem
import com.chien.sample_mvi_todolist.domain.repository.TodoRepository
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class TodoRepositoryImp @Inject constructor(
    private val todoDao: TodoDao
) : TodoRepository {

    override fun getAllTodoTasks(): Flow<List<TodoItem>> =
        todoDao.getAllTodoTasks()

    override suspend fun addTask(newTask: TodoItem) =
        todoDao.insertTask(newTask.copy(id = 0, status = false))

    override suspend fun updateTask(updatedTask: TodoItem) =
        todoDao.updateTask(updatedTask)

    override suspend fun deleteTask(id: Int) =
        todoDao.deleteTask(id)

    override suspend fun markTaskCompleted(id: Int, status: Boolean) =
        todoDao.markTaskCompleted(id, status)
}