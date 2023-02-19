package com.example.firstkotlin

import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class NotificationModule() {

    @Singleton
    @MessageQualifier
    @Provides
    fun getMessageService(hmmm: Int): NotificationService {
        return MessageService(4)
    }

    // this has parameters because it is injected and dagger knows
    @Singleton
    @EmailQualifier
    @Provides
    fun getEmailService(emailService: EmailService): NotificationService {
        return emailService
    }
}