package com.toharifqi.mysimplecleanarchitecture.data

import com.toharifqi.mysimplecleanarchitecture.domain.MessageEntity

interface IMessageDataSource {
    fun getMessageFromSource(name: String): MessageEntity
}