package com.mindorks.framework.numberremedies

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.mindorks.framework.numberremedies.databinding.FragmentNumberRemediesTwoBinding


class NumberRemediesTwoFragment : Fragment() {

    private lateinit var binding : FragmentNumberRemediesTwoBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        binding = FragmentNumberRemediesTwoBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.oneCv.setOnClickListener {
            findNavController().navigate(R.id.action_numberRemediesTwoFragment_to_numberRemediesThreeFragment)
        }

        binding.twoCv.setOnClickListener {
            findNavController().navigate(R.id.action_numberRemediesTwoFragment_to_numberRemediesThreeFragment)
        }

        binding.threeCv.setOnClickListener {
            findNavController().navigate(R.id.action_numberRemediesTwoFragment_to_numberRemediesThreeFragment)
        }
        binding.fourCv.setOnClickListener {
            findNavController().navigate(R.id.action_numberRemediesTwoFragment_to_numberRemediesThreeFragment)
        }

        binding.sixCv.setOnClickListener {
            findNavController().navigate(R.id.action_numberRemediesTwoFragment_to_numberRemediesThreeFragment)
        }

        binding.sevenCv.setOnClickListener {
            findNavController().navigate(R.id.action_numberRemediesTwoFragment_to_numberRemediesThreeFragment)
        }
        binding.eightCv.setOnClickListener {
            findNavController().navigate(R.id.action_numberRemediesTwoFragment_to_numberRemediesThreeFragment)
        }
        binding.nineCv.setOnClickListener {
            findNavController().navigate(R.id.action_numberRemediesTwoFragment_to_numberRemediesThreeFragment)
        }
    }

}