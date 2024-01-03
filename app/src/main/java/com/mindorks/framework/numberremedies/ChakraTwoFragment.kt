package com.mindorks.framework.numberremedies

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.mindorks.framework.numberremedies.databinding.FragmentChakraTwoBinding


class ChakraTwoFragment : Fragment() {

    private lateinit var binding : FragmentChakraTwoBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        binding = FragmentChakraTwoBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.rcm.setOnClickListener{
            findNavController().navigate(R.id.action_chakraTwoFragment_to_muladharaFragment)
        }
    }

}