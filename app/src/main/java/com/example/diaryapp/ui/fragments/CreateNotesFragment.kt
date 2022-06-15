package com.example.diaryapp.ui.fragments

//import android.content.Intent
import android.os.Bundle

import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.viewModels
import androidx.navigation.Navigation
import com.example.diaryapp.R
import com.example.diaryapp.databinding.FragmentCreateNotesBinding
import roommvvm.ViewModel.NotesViewModel
import roommvvm.model.Notes

import java.util.*

class CreateNotesFragment : Fragment() {

    lateinit var binding: FragmentCreateNotesBinding
    val viewModel: NotesViewModel by viewModels()
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding= FragmentCreateNotesBinding.inflate(layoutInflater,container,false)
        binding.BtnSaveNotes.setOnClickListener {
            createNotes(it)
        }

//        binding.colorButton.setOnClickListener {
//
//        }
//        binding.fontButton.setOnClickListener {
//
//        }
//        binding.imageButton.setOnClickListener {
//            val intent= Intent("bott")
//        }
//        binding.imageButton1.setOnClickListener {
//
//        }
//        binding.imageButton2.setOnClickListener {
//
//        }

        return binding.root
    }
    private fun createNotes(it: View?){
        val title=binding.editTitle.text.toString()
        val notes=binding.editNotes.text.toString()

//        val date = Calendar.getInstance().time
//        val formatter = SimpleDateFormat.getDateTimeInstance() //or use getDateInstance()
//        val formattedDate = formatter.format(date)
        //Log.e("@@@@@@@","createNotes :$formattedDate")

        val dateNow = Calendar.getInstance().time
        val data = Notes(null,title=title,notes=notes,date=dateNow.toString())
        viewModel.addNotes(data)

        Toast.makeText(requireContext(),"your page added successfully",
            Toast.LENGTH_SHORT).show()
        Navigation.findNavController(it!!).navigate(R.id.action_createNotesfragment_to_Homefragment)
    }

}