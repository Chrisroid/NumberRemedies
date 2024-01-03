package com.mindorks.framework.numberremedies

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.mindorks.framework.numberremedies.databinding.FragmentNumberRemediesThreeBinding


class NumberRemediesThreeFragment : Fragment() {

    private lateinit var binding: FragmentNumberRemediesThreeBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentNumberRemediesThreeBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.bodyLL.setOnClickListener {
            findNavController().navigate(R.id.action_numberRemediesThreeFragment_to_numberRemediesFourFragment)
        }

        binding.mindLL.setOnClickListener {
            findNavController().navigate(R.id.action_numberRemediesThreeFragment_to_numberRemediesFourFragment)
        }

        binding.soulLL.setOnClickListener {
            findNavController().navigate(R.id.action_numberRemediesThreeFragment_to_numberRemediesFourFragment)
        }

        binding.gemstoneLL.setOnClickListener {
            findNavController().navigate(R.id.action_numberRemediesThreeFragment_to_numberRemediesFourFragment)
        }

        binding.crystalLL.setOnClickListener {
            findNavController().navigate(R.id.action_numberRemediesThreeFragment_to_numberRemediesFourFragment)
        }

    }


}