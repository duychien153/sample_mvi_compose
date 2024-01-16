package com.chien.sample_mvi_todolist.domain.usecase

import com.chien.sample_mvi_todolist.data.source.local.model.TodoItem
import com.chien.sample_mvi_todolist.domain.repository.TodoRepository
import javax.inject.Inject

class MarkTaskCompletedUseCase @Inject constructor(
    private val todoRepository: TodoRepository
) {
    suspend operator fun invoke(tasks: List<TodoItem>, id: Int, status: Boolean): List<TodoItem> {
        todoRepository.markTaskCompleted(id, status)
        return tasks.map {
            if (it.id == id) {
                it.copy(status = status)
            } else it
        }
    }
}