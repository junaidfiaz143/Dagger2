package com.example.firstkotlin

import android.util.Log
import javax.inject.Inject

interface UserRepository {
    fun saveUser(email: String, password: String) {
        Log.d(TAG, "User saved $email $password")
    }
}

class SQLUserRepository @Inject constructor() : UserRepository {
    override fun saveUser(email: String, password: String) {
        Log.d(TAG, "User saved in SQL")
    }
}

class FirebaseUserRepository @Inject constructor() : UserRepository {
    override fun saveUser(email: String, password: String) {
        Log.d(TAG, "User saved in Firebase")
    }
}