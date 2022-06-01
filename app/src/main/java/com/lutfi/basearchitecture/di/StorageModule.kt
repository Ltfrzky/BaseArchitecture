package com.lutfi.basearchitecture.di

import android.content.Context
import android.content.SharedPreferences
import androidx.preference.PreferenceManager
import androidx.room.Room
import androidx.room.RoomDatabase
import com.lutfi.basearchitecture.presentation.storage.datastore.DataStoreManager
import com.lutfi.basearchitecture.presentation.storage.persistance.AppDatabase
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

/**
 * @author Lutfi Rizky Ramadhan (lutfi.ramadhan@dana.id)
 * @version StorageModule, v 0.1 01/06/2022 18:13 by Lutfi Rizky Ramadhan
 */
@InstallIn(SingletonComponent::class)
@Module
class StorageModule {

    @Provides
    @Singleton
    fun providesSharedPreferences(@ApplicationContext context: Context): SharedPreferences {
        return PreferenceManager.getDefaultSharedPreferences(context)
    }

    @Provides
    @Singleton
    fun providesDataStore(@ApplicationContext context: Context): DataStoreManager {
        return DataStoreManager(context)
    }

    @Provides
    @Singleton
    fun providesRoomDB(@ApplicationContext context: Context): RoomDatabase {
        return Room.databaseBuilder(context, AppDatabase::class.java, "base_db").build()
    }
}