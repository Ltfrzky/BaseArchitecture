package com.lutfi.basearchitecture.presentation.utils

import kotlinx.coroutines.CoroutineDispatcher
import kotlinx.coroutines.Dispatchers

/**
 * @author Lutfi Rizky Ramadhan (lutfi.ramadhan@dana.id)
 * @version CoroutineDispatcherUtils, v 0.1 01/06/2022 18:50 by Lutfi Rizky Ramadhan
 */

interface DispatcherProvider {

    fun main(): CoroutineDispatcher = Dispatchers.Main
    fun default(): CoroutineDispatcher = Dispatchers.Default
    fun io(): CoroutineDispatcher = Dispatchers.IO
    fun unconfined(): CoroutineDispatcher = Dispatchers.Unconfined

}

class DefaultDispatcherProvider : DispatcherProvider
