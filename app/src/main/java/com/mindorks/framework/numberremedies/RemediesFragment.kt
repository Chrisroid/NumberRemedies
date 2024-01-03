package com.mindorks.framework.numberremedies

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.mindorks.framework.numberremedies.databinding.FragmentRemediesBinding


class RemediesFragment : Fragment() {

    private lateinit var binding: FragmentRemediesBinding


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentRemediesBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.numOfRemediesCv.setOnClickListener {
            findNavController().navigate(R.id.action_remediesFragment_to_numberRemediesFragment)
        }

        binding.rudrakshaCv.setOnClickListener {
            findNavController().navigate(R.id.action_remediesFragment_to_rudrakshaFragment)
        }

        binding.chakraCv.setOnClickListener {
            findNavController().navigate(R.id.action_remediesFragment_to_chakraFragment)
        }

        binding.gremediesCv.setOnClickListener {
            findNavController().navigate(R.id.action_remediesFragment_to_generalRemediesFragment)
        }

        binding.vedicMantraCv.setOnClickListener {
            findNavController().navigate(R.id.action_remediesFragment_to_vedicMantraFragment)
        }
    }

}