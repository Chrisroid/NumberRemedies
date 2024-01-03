package com.mindorks.framework.numberremedies

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.mindorks.framework.numberremedies.databinding.FragmentNumberRemediesFourBinding


class NumberRemediesFourFragment : Fragment() {

    private lateinit var binding: FragmentNumberRemediesFourBinding


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        binding = FragmentNumberRemediesFourBinding.inflate(inflater, container, false)
        return binding.root
    }


}