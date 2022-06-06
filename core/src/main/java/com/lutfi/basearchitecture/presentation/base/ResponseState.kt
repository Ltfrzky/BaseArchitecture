package com.lutfi.basearchitecture.presentation.base

/**
 * @author Lutfi Rizky Ramadhan (lutfi.ramadhan@dana.id)
 * @version ResponseState, v 0.1 06/06/2022 14:46 by Lutfi Rizky Ramadhan
 */
sealed class ResponseState<out T> {

    class Success<out T>(val data: T) : ResponseState<T>()
    class Error(val error: Throwable) : ResponseState<Nothing>()
    object Loading : ResponseState<Nothing>()
}
