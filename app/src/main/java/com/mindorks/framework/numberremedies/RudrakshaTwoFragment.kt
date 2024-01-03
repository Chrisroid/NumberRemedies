package com.mindorks.framework.numberremedies

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.mindorks.framework.numberremedies.databinding.FragmentRudrakshaTwoBinding


class RudrakshaTwoFragment : Fragment() {

    private lateinit var binding : FragmentRudrakshaTwoBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        binding = FragmentRudrakshaTwoBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.mr1.setOnClickListener{
            findNavController().navigate(R.id.action_rudrakshaTwoFragment_to_mukhiRudrakshaFragment)
        }

        binding.mr2.setOnClickListener{
            findNavController().navigate(R.id.action_rudrakshaTwoFragment_to_mukhiRudrakshaFragment)
        }

        binding.mr3.setOnClickListener{
            findNavController().navigate(R.id.action_rudrakshaTwoFragment_to_mukhiRudrakshaFragment)
        }

        binding.mr4.setOnClickListener{
            findNavController().navigate(R.id.action_rudrakshaTwoFragment_to_mukhiRudrakshaFragment)
        }

        binding.mr5.setOnClickListener{
            findNavController().navigate(R.id.action_rudrakshaTwoFragment_to_mukhiRudrakshaFragment)
        }

        binding.mr6.setOnClickListener{
            findNavController().navigate(R.id.action_rudrakshaTwoFragment_to_mukhiRudrakshaFragment)
        }

        binding.mr7.setOnClickListener{
            findNavController().navigate(R.id.action_rudrakshaTwoFragment_to_mukhiRudrakshaFragment)
        }

        binding.mr8.setOnClickListener{
            findNavController().navigate(R.id.action_rudrakshaTwoFragment_to_mukhiRudrakshaFragment)
        }

        binding.mr9.setOnClickListener{
            findNavController().navigate(R.id.action_rudrakshaTwoFragment_to_mukhiRudrakshaFragment)
        }

        binding.mr10.setOnClickListener{
            findNavController().navigate(R.id.action_rudrakshaTwoFragment_to_mukhiRudrakshaFragment)
        }

        binding.mr11.setOnClickListener{
            findNavController().navigate(R.id.action_rudrakshaTwoFragment_to_mukhiRudrakshaFragment)
        }

        binding.mr12.setOnClickListener{
            findNavController().navigate(R.id.action_rudrakshaTwoFragment_to_mukhiRudrakshaFragment)
        }
    }

}