package com.example.firstkotlin

import android.util.Log
import javax.inject.Inject

class UserRegistrationService @Inject constructor(
    @FirebaseQualifier private val userRepository: UserRepository,
//    @MessageQualifier private val notificationService: NotificationService
) {
    fun registerUser(email: String, password: String) {
        Log.d(TAG, "trying to register email from service $email $password")
        userRepository.saveUser(email, password)
//        notificationService.send("", "", "")
    }
}