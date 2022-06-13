package com.example.diaryapp.ui.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.navArgs
import com.example.diaryapp.R
import com.example.diaryapp.databinding.FragmentEditfragmentBinding
import com.example.diaryapp.databinding.ItemDiaryBinding

class EditFragment : Fragment() {
    val notes by navArgs<EditFragmentArgs>()
    lateinit var binding: FragmentEditfragmentBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding= FragmentEditfragmentBinding.inflate(layoutInflater,container,false)


        return binding.root
    }
}