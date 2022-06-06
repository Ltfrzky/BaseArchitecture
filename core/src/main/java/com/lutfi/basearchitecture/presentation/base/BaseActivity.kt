package com.lutfi.basearchitecture.presentation.base

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.viewbinding.ViewBinding
import com.lutfi.basearchitecture.presentation.utils.getBinding

/**
 * @author Lutfi Rizky Ramadhan (lutfirizkyramadhan@gmail.com)
 * @version BaseActivity, v 0.1 05/06/2022 20:56 by Lutfi Rizky Ramadhan
 */
abstract class BaseActivity<V : ViewBinding> : AppCompatActivity() {

    lateinit var binding: V

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = getBinding()
        setContentView(binding.root)

        init(savedInstanceState)
    }

    protected abstract fun init(savedInstanceState: Bundle?)
}