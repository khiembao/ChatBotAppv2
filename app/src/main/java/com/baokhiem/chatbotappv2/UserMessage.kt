package com.baokhiem.chatbotappv2

class UserMessage {
    public lateinit var sender: String
    public lateinit var message: String

    fun UserMessage(id: String, response_message: String){
        sender = id
        message = response_message
    }

}