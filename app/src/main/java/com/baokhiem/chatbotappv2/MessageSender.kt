package com.baokhiem.chatbotappv2

import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.POST
import com.baokhiem.chatbotappv2.BotResponse as BotResponse

interface MessageSender {
    @POST("webhook")
    fun sendMessage(@Body userMessage: UserMessage?): Call<List<BotResponse>>
}