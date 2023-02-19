package com.example.firstkotlin

import javax.inject.Qualifier

@Qualifier
@MustBeDocumented
@Retention(AnnotationRetention.RUNTIME)
annotation class MessageQualifier()

@Qualifier
@MustBeDocumented
@Retention(AnnotationRetention.RUNTIME)
annotation class EmailQualifier()

@Qualifier
@MustBeDocumented
@Retention(AnnotationRetention.RUNTIME)
annotation class FirebaseQualifier()

@Qualifier
@MustBeDocumented
@Retention(AnnotationRetention.RUNTIME)
annotation class SQLQualifier()
