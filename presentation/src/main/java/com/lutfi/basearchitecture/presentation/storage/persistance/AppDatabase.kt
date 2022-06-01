package com.lutfi.basearchitecture.presentation.storage.persistance

import androidx.room.Database
import androidx.room.RoomDatabase
import com.lutfi.basearchitecture.presentation.storage.persistance.entity.Base

/**
 * @author Lutfi Rizky Ramadhan (lutfi.ramadhan@dana.id)
 * @version AppDatabase, v 0.1 01/06/2022 18:13 by Lutfi Rizky Ramadhan
 */
@Database(entities = [Base::class], version = 1)
abstract class AppDatabase : RoomDatabase()