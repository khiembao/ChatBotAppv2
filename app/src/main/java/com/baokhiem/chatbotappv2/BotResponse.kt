package com.baokhiem.chatbotappv2

import android.widget.Button

class BotResponse(
    var recipient: String,
    var text:String,
    var buttons: List<Buttons>)
{
    inner class Buttons(var payload: String, var title:String)
}