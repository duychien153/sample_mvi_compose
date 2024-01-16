package com.chien.sample_mvi_todolist.ui.todo.model

import com.chien.sample_mvi_todolist.data.source.local.model.TodoItem

sealed class ToDoIntent {
    data object LoadTodoList : ToDoIntent()
    data class AddTask(val newTask: TodoItem) : ToDoIntent()
    data class UpdateTask(val updatedTask: TodoItem) : ToDoIntent()
    data class MarkTaskCompleted(val id: Int, val status: Boolean) : ToDoIntent()
    data class DeleteTask(val id: Int) : ToDoIntent()
}
