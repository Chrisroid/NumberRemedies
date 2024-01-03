package com.mindorks.framework.numberremedies

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.mindorks.framework.numberremedies.databinding.FragmentChakraBinding

class ChakraFragment : Fragment() {

    private lateinit var binding: FragmentChakraBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        binding = FragmentChakraBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.readMoreBtn.setOnClickListener {
            findNavController().navigate(R.id.action_chakraFragment_to_chakraTwoFragment)
        }
    }

}