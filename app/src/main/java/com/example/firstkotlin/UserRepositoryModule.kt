package com.example.firstkotlin

import dagger.Module
import dagger.Provides

@Module
class UserRepositoryModule {

    @ActivityScope
    @FirebaseQualifier
    @Provides
    fun getFirebaseRepository(firebaseRepo: FirebaseUserRepository): UserRepository {
        return firebaseRepo
    }

    @ActivityScope
    @SQLQualifier
    @Provides
    fun getSQLRepository(sqlRepo: SQLUserRepository): UserRepository {
        return sqlRepo
    }
//    @Binds
//    abstract fun getSQLRepository(sqlRepo: SQLUserRepository): UserRepository
}