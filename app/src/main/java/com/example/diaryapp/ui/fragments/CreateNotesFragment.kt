package com.example.diaryapp.ui.fragments

import android.graphics.Typeface
import android.media.Image
import android.os.Bundle
import android.text.Spannable
import android.text.SpannableString
import android.text.SpannableStringBuilder
import android.text.style.RelativeSizeSpan
import android.text.style.StyleSpan
import android.text.style.TypefaceSpan

import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.Toast
import androidx.fragment.app.viewModels
import androidx.navigation.Navigation
import com.example.diaryapp.R
import com.example.diaryapp.databinding.FragmentCreateNotesBinding
import com.google.android.material.bottomsheet.BottomSheetDialog
import com.google.android.material.floatingactionbutton.FloatingActionButton
import roommvvm.ViewModel.NotesViewModel
import roommvvm.model.Notes
import java.text.SimpleDateFormat

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
        binding.colorButton.setOnClickListener {
            layoutInflater.inflate(R.layout.background_colour,null)
            val bottomSheet= BottomSheetDialog(requireContext())
            bottomSheet.setContentView(R.layout.background_colour)
            val purple=bottomSheet.findViewById<FloatingActionButton>(R.id.purple)
            purple?.setOnClickListener {
                binding.editNotes.setBackgroundResource(R.color.purple)
                binding.editTitle.setBackgroundResource(R.color.purple)
                binding.dateButton.setBackgroundResource(R.color.purple)
                bottomSheet.dismiss()
            }
            bottomSheet.show()
        }
        binding.bold.setOnClickListener {
            val SpannableString= SpannableStringBuilder(binding.editNotes.text)
            val SpannableString2= SpannableStringBuilder(binding.editTitle.text)
            val styleSpan= StyleSpan(Typeface.BOLD)
            SpannableString.setSpan(styleSpan,binding.editNotes.selectionStart,
                binding.editNotes.selectionEnd,0)
            SpannableString2.setSpan(styleSpan,binding.editTitle.selectionStart,
                binding.editTitle.selectionEnd,0)
            binding.editNotes.text=SpannableString
            binding.editTitle.text=SpannableString2
        }
        binding.italic.setOnClickListener {
            val SpannableString= SpannableStringBuilder(binding.editNotes.text)
            val SpannableString2= SpannableStringBuilder(binding.editTitle.text)
            val styleSpan= StyleSpan(Typeface.ITALIC)
            SpannableString.setSpan(styleSpan,binding.editNotes.selectionStart,
                binding.editNotes.selectionEnd,0)
            SpannableString2.setSpan(styleSpan,binding.editTitle.selectionStart,
                binding.editTitle.selectionEnd,0)
            binding.editNotes.text=SpannableString
            binding.editTitle.text=SpannableString2
        }


        return binding.root
    }
    private fun createNotes(it: View?){
        val title=binding.editTitle.text.toString()
        val notes=binding.editNotes.text.toString()

        val dateNow = Calendar.getInstance().time
        val formatter = SimpleDateFormat.getDateTimeInstance() //or use getDateInstance()
        val date = formatter.format(dateNow)
        //val img = binding.imgNote.setImageResource(R.drawable.logo)
        val data = Notes(null,title=title,notes=notes,date=date.toString())
        viewModel.addNotes(data)

        Toast.makeText(requireContext(),"your page added successfully",
            Toast.LENGTH_SHORT).show()
        Navigation.findNavController(it!!).navigate(R.id.action_createNotesfragment_to_Homefragment)
    }


}
