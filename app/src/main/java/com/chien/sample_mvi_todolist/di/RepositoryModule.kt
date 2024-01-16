package com.chien.sample_mvi_todolist.di

import com.chien.sample_mvi_todolist.data.repository.TodoRepositoryImp
import com.chien.sample_mvi_todolist.domain.repository.TodoRepository
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
abstract class RepositoryModule {

    @Singleton
    @Binds
    abstract fun bindTodoRepository(repository: TodoRepositoryImp): TodoRepository

}