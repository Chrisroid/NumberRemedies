package com.mindorks.framework.numberremedies

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.mindorks.framework.numberremedies.databinding.FragmentNumberRemediesBinding


/**
 * A simple [Fragment] subclass.
 * Use the [NumberRemediesFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class NumberRemediesFragment : Fragment() {

    private lateinit var binding: FragmentNumberRemediesBinding



    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        binding = FragmentNumberRemediesBinding.inflate(inflater,container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.readMoreBtn.setOnClickListener {
            findNavController().navigate(R.id.action_numberRemediesFragment_to_numberRemediesTwoFragment)
        }
    }

}