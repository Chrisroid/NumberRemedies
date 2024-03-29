package com.mindorks.framework.numberremedies

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.mindorks.framework.numberremedies.databinding.FragmentMuladharaBinding


class MuladharaFragment : Fragment() {

    private lateinit var binding : FragmentMuladharaBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentMuladharaBinding.inflate(inflater, container, false)
        return binding.root
    }

}