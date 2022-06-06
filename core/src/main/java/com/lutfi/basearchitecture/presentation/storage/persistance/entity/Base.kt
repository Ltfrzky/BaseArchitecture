package com.lutfi.basearchitecture.presentation.storage.persistance.entity

import androidx.room.Entity
import androidx.room.PrimaryKey

/**
 * @author Lutfi Rizky Ramadhan (lutfirizkyramadhan@gmail.com)
 * @version Base, v 0.1 01/06/2022 18:45 by Lutfi Rizky Ramadhan
 */
@Entity
class Base(
    @PrimaryKey val index: Int,
    val base: String
)