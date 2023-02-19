package com.example.firstkotlin

import dagger.BindsInstance
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [NotificationModule::class])
interface AppComponent {
    fun userRegistrationComponentFactory(): UserRegistrationComponent.Factory

    @Component.Factory
    interface Factory{
        fun create(@BindsInstance fromAppComponentInt: Int): AppComponent
    }
}