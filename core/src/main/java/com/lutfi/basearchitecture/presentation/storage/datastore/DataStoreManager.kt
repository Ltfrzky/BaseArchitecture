package com.lutfi.basearchitecture.presentation.storage.datastore

import android.content.Context
import androidx.datastore.preferences.preferencesDataStore
import dagger.hilt.android.qualifiers.ApplicationContext
import javax.inject.Inject

private val Context.dataStore by preferencesDataStore("settings")

/**
 * @author Lutfi Rizky Ramadhan (lutfirizkyramadhan@gmail.com)
 * @version DataStoreManager, v 0.1 01/06/2022 18:35 by Lutfi Rizky Ramadhan
 */
class DataStoreManager @Inject constructor(@ApplicationContext context: Context) {

    private val settingDataStore = context.dataStore
}