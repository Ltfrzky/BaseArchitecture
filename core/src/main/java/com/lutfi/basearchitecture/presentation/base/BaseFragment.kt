package com.lutfi.basearchitecture.presentation.base

import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.viewbinding.ViewBinding
import com.lutfi.basearchitecture.presentation.utils.getBinding

/**
 * @author Lutfi Rizky Ramadhan (lutfirizkyramadhan@gmail.com)
 * @version BaseFragment, v 0.1 05/06/2022 21:01 by Lutfi Rizky Ramadhan
 */
abstract class BaseFragment<Binding : ViewBinding> : Fragment() {

    private var _binding: Binding? = null
    private var viewRoot: View? = null
    protected var baseContext: Context? = null

    private val layoutBinding: Binding
        get() = _binding
            ?: throw RuntimeException("Should only use binding after onCreateView and before onDestroyView")

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = getBinding(inflater, container)
        if (viewRoot == null) {
            viewRoot = layoutBinding.root
        } else {
            val parent = viewRoot?.parent as ViewGroup?
            parent?.removeView(viewRoot)
        }
        return viewRoot
    }

    override fun onAttach(context: Context) {
        super.onAttach(context)
        baseContext = context
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        init(savedInstanceState)
    }

    protected abstract fun init(savedInstanceState: Bundle?)
}