package com.example.diaryapp.ui.fragments
import android.graphics.Typeface
import android.os.Bundle
import android.text.SpannableStringBuilder
import android.text.style.StyleSpan

import android.view.*
import android.widget.TextView
import androidx.fragment.app.Fragment
import android.widget.Toast
import androidx.fragment.app.viewModels
import androidx.navigation.Navigation
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs
import com.example.diaryapp.R
import com.example.diaryapp.databinding.FragmentEditfragmentBinding

import com.google.android.material.bottomsheet.BottomSheetDialog
import com.google.android.material.floatingactionbutton.FloatingActionButton
import roommvvm.ViewModel.NotesViewModel
import roommvvm.model.Notes
import java.text.SimpleDateFormat
import java.util.*


class EditFragment : Fragment() {
    val oldnotes by navArgs<EditFragmentArgs>()
    lateinit var binding: FragmentEditfragmentBinding
    val viewModel: NotesViewModel by viewModels()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding= FragmentEditfragmentBinding.inflate(layoutInflater,container,false)
        setHasOptionsMenu(true)

        binding.editTitle.setText(oldnotes.data.title)
        binding.editNotes.setText(oldnotes.data.notes)

        binding.colorButton.setOnClickListener {
            val view:View= layoutInflater.inflate(R.layout.background_colour,null)
            val bottomSheet: BottomSheetDialog = BottomSheetDialog(requireContext())
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

        binding.btnEditSaveNotes.setOnClickListener {
            updateNotes(it)
        }
        return binding.root
    }

    private fun updateNotes(it: View?) {
        val title=binding.editTitle.text.toString()
        val notes=binding.editNotes.text.toString()


        val dateNow = Calendar.getInstance().time
        val formatter = SimpleDateFormat.getDateTimeInstance() //or use getDateInstance()
        val date = formatter.format(dateNow)
        //val img = binding.imgNote.setImageResource(R.drawable.logo)
        val data = Notes(oldnotes.data.id,title=title,notes=notes,date=date.toString())
        viewModel.updateNotes(data)

        Toast.makeText(requireContext(),"your page updated successfully",
            Toast.LENGTH_SHORT).show()
        Navigation.findNavController(it!!).navigate(R.id.action_editfragment2_to_homefragment)

    }

    @Deprecated("Deprecated in Java")
    override fun onCreateOptionsMenu(menu: Menu, inflater: MenuInflater) {
        inflater.inflate(R.menu.del_menu,menu)
        super.onCreateOptionsMenu(menu, inflater)
    }


    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        if (item.itemId == R.id.menu_del)
        {

            val bottomSheet: BottomSheetDialog = BottomSheetDialog(requireContext())
            bottomSheet.setContentView(R.layout.dialogue)

            val textviewyes= bottomSheet.findViewById<TextView>(R.id.dialog_yes)
            val textviewno= bottomSheet.findViewById<TextView>(R.id.dialog_no)

            textviewyes?.setOnClickListener {
                viewModel.deleteNotes(oldnotes.data.id!!)
                bottomSheet.dismiss()
                findNavController().navigate(R.id.action_editfragment2_to_homefragment)
            }
            textviewno?.setOnClickListener {
                bottomSheet.dismiss()
            }
            bottomSheet.show()
        }
        return super.onOptionsItemSelected(item)
    }
}