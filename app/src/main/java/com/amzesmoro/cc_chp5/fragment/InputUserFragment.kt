package com.amzesmoro.cc_chp5.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.amzesmoro.cc_chp5.FragmentListener
import com.amzesmoro.cc_chp5.databinding.FragmentUserBinding

class InputUserFragment : Fragment(), FragmentListener {

    private var binding: FragmentUserBinding? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentUserBinding.inflate(inflater)
        return binding?.root
    }

    override fun getTextValue(): String {
        val name = binding?.etUsername?.text.toString()
        return name
    }
}