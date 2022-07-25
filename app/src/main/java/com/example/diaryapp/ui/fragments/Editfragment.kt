package com.example.diaryapp.ui.fragments

import android.os.Bundle

import android.view.*
import android.widget.TextView
import androidx.fragment.app.Fragment
import android.widget.Toast
import androidx.fragment.app.viewModels
import androidx.navigation.Navigation
import androidx.navigation.fragment.navArgs
import com.example.diaryapp.R
import com.example.diaryapp.databinding.FragmentEditfragmentBinding

import com.google.android.material.bottomsheet.BottomSheetDialog
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

    @Deprecated("Deprecated in Java")
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
            }
            textviewno?.setOnClickListener {
                bottomSheet.dismiss()
            }
            bottomSheet.show()
        }
        return super.onOptionsItemSelected(item)
    }
}