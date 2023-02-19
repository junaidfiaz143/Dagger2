package com.example.firstkotlin

import android.util.Log
import javax.inject.Inject

interface NotificationService {
    fun send(to: String, from: String, body: String)
}

class EmailService @Inject constructor() : NotificationService {
    override fun send(to: String, from: String, body: String) {
        Log.d(TAG, "from email sending service")
    }
}

class MessageService(private val reTryCount: Int) : NotificationService {
    override fun send(to: String, from: String, body: String) {
        Log.d(TAG, "from message sending service - retry $reTryCount")
    }
}