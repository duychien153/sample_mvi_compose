package com.chien.sample_mvi_todolist.domain.usecase

import com.chien.sample_mvi_todolist.data.source.local.model.TodoItem
import com.chien.sample_mvi_todolist.domain.repository.TodoRepository
import javax.inject.Inject

class UpdateTaskUseCase @Inject constructor(
    private val todoRepository: TodoRepository
) {
    suspend operator fun invoke(tasks: List<TodoItem>, todoItem: TodoItem): List<TodoItem> {
        todoRepository.updateTask(todoItem)
        return tasks.map {
            if (it.id == todoItem.id) {
                todoItem
            } else it
        }
    }
}