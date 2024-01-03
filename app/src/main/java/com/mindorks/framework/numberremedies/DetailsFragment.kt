package com.mindorks.framework.numberremedies

import android.content.res.ColorStateList
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.content.ContextCompat
import androidx.core.widget.addTextChangedListener
import androidx.navigation.fragment.findNavController
import com.mindorks.framework.numberremedies.databinding.FragmentDetailsBinding

class DetailsFragment : Fragment() {

    private lateinit var binding: FragmentDetailsBinding
    private var selectedGender: String? = null


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentDetailsBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        // Gender selection click listeners
        binding.maleLL.setOnClickListener {
            // Handle click for male selection
            selectedGender = getString(R.string.male)
            // Update UI, such as changing the border color, and update button state
            // Example: binding.imageViewMale.setBackgroundResource(R.drawable.border_white)
            updateGenderSelectionUI()
            checkSubmitButtonState()
        }

        binding.femaleLL.setOnClickListener {
            // Handle click for female selection
            selectedGender = getString(R.string.female)
            // Update UI, such as changing the border color, and update button state
            // Example: binding.imageViewFemale.setBackgroundResource(R.drawable.border_white)
            updateGenderSelectionUI()
            checkSubmitButtonState()
        }

        binding.otherLL.setOnClickListener {
            // Handle click for other selection
            selectedGender = getString(R.string.other)
            // Update UI, such as changing the border color, and update button state
            // Example: binding.imageViewOther.setBackgroundResource(R.drawable.border_white)
            updateGenderSelectionUI()
            checkSubmitButtonState()
        }

        // Text change listeners for TextInputLayouts
        binding.textInputFirstName.editText?.addTextChangedListener {
            checkSubmitButtonState()
        }

        binding.textInputLastName.editText?.addTextChangedListener {
            checkSubmitButtonState()
        }

        binding.textInputDOB.editText?.addTextChangedListener {
            checkSubmitButtonState()
        }

        binding.submitButton.setOnClickListener {
            findNavController().navigate(R.id.action_detailsFragment_to_remediesFragment)
        }
    }

    private fun checkSubmitButtonState() {
        val isFirstNameFilled = binding.textInputFirstName.editText?.text?.isNotBlank() ?: false
        val isLastNameFilled = binding.textInputLastName.editText?.text?.isNotBlank() ?: false
        val isDOBFilled = binding.textInputDOB.editText?.text?.isNotBlank() ?: false
        val isGenderSelected = !selectedGender.isNullOrEmpty()
        val isSubmitEnabled = isFirstNameFilled && isLastNameFilled && isDOBFilled && isGenderSelected

        binding.submitButton.isEnabled = isSubmitEnabled

        // Fetching color resources
        val whiteColor = ContextCompat.getColor(requireContext(), R.color.white)
        val blackColor = ContextCompat.getColor(requireContext(), R.color.black)

        if (isSubmitEnabled) {
            binding.submitButton.strokeColor = ColorStateList.valueOf(whiteColor)
        } else {
            binding.submitButton.strokeColor = ColorStateList.valueOf(blackColor)
        }
    }

    private fun updateGenderSelectionUI() {
        // Reset all backgrounds to default state
        binding.maleLL.setBackgroundResource(R.drawable.border_grey)
        binding.imageViewMale.setImageResource(R.drawable.ic_male_2)
        binding.maleTv.setTextColor(ContextCompat.getColor(requireContext(), R.color.grey))

        binding.femaleLL.setBackgroundResource(R.drawable.border_grey)
        binding.imageViewFemale.setImageResource(R.drawable.ic_female_2)
        binding.femaleTv.setTextColor(ContextCompat.getColor(requireContext(), R.color.grey))

        binding.otherLL.setBackgroundResource(R.drawable.border_grey)
        binding.imageViewOther.setImageResource(R.drawable.ic_other_2)
        binding.otherTV.setTextColor(ContextCompat.getColor(requireContext(), R.color.grey))

        // Apply selected state to the chosen gender LinearLayout
        val selectedDrawable = ContextCompat.getDrawable(requireContext(), R.drawable.border_white)
        when (selectedGender) {
            "Male" -> {
                binding.maleLL.background = selectedDrawable
                binding.imageViewMale.setImageResource(R.drawable.ic_male) // Change to selected male drawable
                binding.maleTv.setTextColor(ContextCompat.getColor(requireContext(), R.color.white))
            }
            "Female" -> {
                binding.femaleLL.background = selectedDrawable
                binding.imageViewFemale.setImageResource(R.drawable.ic_female)
                binding.femaleTv.setTextColor(ContextCompat.getColor(requireContext(), R.color.white))
            }
            "Other" -> {
                binding.otherLL.background = selectedDrawable
                binding.imageViewOther.setImageResource(R.drawable.ic_other)
                binding.otherTV.setTextColor(ContextCompat.getColor(requireContext(), R.color.white))
            }
        }
    }



}