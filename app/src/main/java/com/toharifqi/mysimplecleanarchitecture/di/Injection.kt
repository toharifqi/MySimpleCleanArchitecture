package com.toharifqi.mysimplecleanarchitecture.di

import com.toharifqi.mysimplecleanarchitecture.data.IMessageDataSource
import com.toharifqi.mysimplecleanarchitecture.data.MessageDataSource
import com.toharifqi.mysimplecleanarchitecture.data.MessageRepository
import com.toharifqi.mysimplecleanarchitecture.domain.IMessageRepository
import com.toharifqi.mysimplecleanarchitecture.domain.MessageInteractor
import com.toharifqi.mysimplecleanarchitecture.domain.MessageUseCase

object Injection {
    fun provideUseCase(): MessageUseCase{
        val messageRepository = provideRepository()
        return MessageInteractor(messageRepository)
    }

    private fun provideRepository(): IMessageRepository {
        val messageDataSource = provideDataSource()
        return MessageRepository(messageDataSource)
    }

    private fun provideDataSource(): IMessageDataSource {
        return MessageDataSource()
    }
}