package com.lutfi.basearchitecture.di

import com.lutfi.basearchitecture.presentation.utils.DefaultDispatcherProvider
import com.lutfi.basearchitecture.presentation.utils.DispatcherProvider
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

/**
 * @author Lutfi Rizky Ramadhan (lutfirizkyramadhan@gmail.com)
 * @version DispatcherModule, v 0.1 01/06/2022 18:12 by Lutfi Rizky Ramadhan
 */
@InstallIn(SingletonComponent::class)
@Module
class DispatcherModule {

    @Provides
    @Singleton
    fun provideCoroutineDispatcher(): DispatcherProvider = DefaultDispatcherProvider()
}