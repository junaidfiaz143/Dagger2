package com.example.firstkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import javax.inject.Inject

class MainActivity : AppCompatActivity() {

    @Inject
    lateinit var userRegistrationService: UserRegistrationService

    @Inject
    @MessageQualifier
    lateinit var notificationService: NotificationService

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val appComponent = (application as MyApplication).appComponent
        val userRegistrationComponent =
            appComponent.userRegistrationComponentFactory()
                .create(143)

        userRegistrationComponent.inject(this)

        userRegistrationService.registerUser("jd", "123")
    }
}