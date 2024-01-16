package com.chien.sample_mvi_todolist.ui.todo.model

import com.chien.sample_mvi_todolist.data.source.local.model.TodoItem

data class ToDoList(
    val todoList: List<TodoItem> = emptyList(),
    val todoItem: TodoItem = TodoItem(0, false, "", "")
)