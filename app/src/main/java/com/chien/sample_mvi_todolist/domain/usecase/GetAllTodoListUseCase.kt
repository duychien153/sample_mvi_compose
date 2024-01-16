package com.chien.sample_mvi_todolist.domain.usecase

import com.chien.sample_mvi_todolist.data.source.local.model.TodoItem
import com.chien.sample_mvi_todolist.domain.repository.TodoRepository
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class GetAllTodoListUseCase @Inject constructor(
    private val todoRepository: TodoRepository
) {
    operator fun invoke(): Flow<List<TodoItem>> =
        todoRepository.getAllTodoTasks()
}