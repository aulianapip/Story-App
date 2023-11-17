package com.aulia.storyapp.di

import android.content.Context
import com.aulia.storyapp.data.UserRepository
import com.aulia.storyapp.data.pref.UserPreference
import com.aulia.storyapp.data.pref.dataStore

object Injection {
    fun provideRepository(context: Context): UserRepository {
        val pref = UserPreference.getInstance(context.dataStore)
        return UserRepository.getInstance(pref)
    }
}