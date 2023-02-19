package com.example.firstkotlin

import dagger.BindsInstance
import dagger.Subcomponent

@ActivityScope
@Subcomponent(modules = [UserRepositoryModule::class])
interface UserRegistrationComponent {
    fun inject(mainActivity: MainActivity)

    @Subcomponent.Factory
    interface Factory {
        fun create(@BindsInstance reTryCount: Int): UserRegistrationComponent
    }
}