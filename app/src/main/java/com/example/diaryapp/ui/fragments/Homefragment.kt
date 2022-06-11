package com.example.diaryapp.ui.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import androidx.navigation.Navigation
import androidx.recyclerview.widget.GridLayoutManager
import com.example.diaryapp.R
import com.example.diaryapp.databinding.FragmentHomefragmentBinding
import com.example.diaryapp.ui.adaptor.NotesAdaptor
import roommvvm.ViewModel.NotesViewModel

class HomeFragment : Fragment() {

    lateinit var binding: FragmentHomefragmentBinding
    val viewModel: NotesViewModel by viewModels()
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding= FragmentHomefragmentBinding.inflate(layoutInflater,container,false)

        viewModel.getNOtes().observe(viewLifecycleOwner,{ notesList->
            binding.rcvAllNotes.layoutManager= GridLayoutManager(requireContext(),2)
            binding.rcvAllNotes.adapter=NotesAdaptor(requireContext(),notesList)
        })

        binding.btnAddNotes.setOnClickListener {
            Navigation.findNavController(it).navigate(R.id.action_homefragment_to_createNotesFragment)
        }

        return binding.root
    }

}