package com.example.diaryapp.ui.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.example.diaryapp.R
import com.example.diaryapp.databinding.FragmentHomefragmentBinding

class HomeFragment : Fragment() {

    lateinit var binding: FragmentHomefragmentBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding= FragmentHomefragmentBinding.inflate(layoutInflater,container,false)

        binding.btnAddNotes.setOnClickListener {
            Navigation.findNavController(it).navigate(R.id.action_homefragment_to_createNotesFragment)
        }

        return binding.root
    }

}