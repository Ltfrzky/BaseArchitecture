package com.lutfi.basearchitecture

import androidx.multidex.MultiDexApplication
import com.lutfi.basearchitecture.presentation.storage.datastore.DataStoreManager
import dagger.hilt.android.HiltAndroidApp
import timber.log.Timber
import javax.inject.Inject

/**
 * @author Lutfi Rizky Ramadhan (lutfi.ramadhan@dana.id)
 * @version BaseApplication, v 0.1 01/06/2022 18:00 by Lutfi Rizky Ramadhan
 */
@HiltAndroidApp
class BaseApplication : MultiDexApplication() {

    @Inject
    lateinit var dataStoreManager: DataStoreManager

    override fun onCreate() {
        super.onCreate()
        if (BuildConfig.DEBUG) {
            Timber.plant(Timber.DebugTree())
        }
    }
}