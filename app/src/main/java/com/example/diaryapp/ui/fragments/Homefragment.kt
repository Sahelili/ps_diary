package com.example.diaryapp.ui .fragments

import android.os.Bundle
import android.view.*
import androidx.appcompat.widget.SearchView
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import androidx.navigation.Navigation
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.StaggeredGridLayoutManager
import com.example.diaryapp.R
import com.example.diaryapp.databinding.FragmentHomefragmentBinding
import com.example.diaryapp.ui.adaptor.NotesAdaptor
import roommvvm.ViewModel.NotesViewModel
import roommvvm.model.Notes

class HomeFragment : Fragment() {

    lateinit var binding: FragmentHomefragmentBinding
    val viewModel: NotesViewModel by viewModels()
    var oldMyNotes= arrayListOf<Notes>()
    lateinit var adaptor: NotesAdaptor
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding= FragmentHomefragmentBinding.inflate(layoutInflater,container,false)
        setHasOptionsMenu(true)

        val staggeredGridLayoutManager=
            StaggeredGridLayoutManager(2,LinearLayoutManager.VERTICAL)
        binding.rcvAllNotes.layoutManager=staggeredGridLayoutManager

          //get all notes
        viewModel.getNOtes().observe(viewLifecycleOwner,{ notesList->
            oldMyNotes = notesList as ArrayList<Notes> /* = java.util.ArrayList<roommvvm.model.Notes> */
            adaptor= NotesAdaptor(requireContext(),notesList)
            binding.rcvAllNotes.adapter=adaptor
        })

        binding.btnAddNotes.setOnClickListener {
            Navigation.findNavController(it).navigate(R.id.action_homefragment_to_createNotesfragment)
        }

        return binding.root
    }
    override fun onCreateOptionsMenu(menu: Menu, inflater: MenuInflater) {
        inflater.inflate(R.menu.search_menu,menu)

        val item= menu.findItem(R.id.app_bar_search)
        val searchView= item.actionView as SearchView
        searchView.queryHint = "Enter Page here..."
        searchView.setOnQueryTextListener(object : SearchView.OnQueryTextListener{
            override fun onQueryTextSubmit(query: String?): Boolean {
                return false
            }

            override fun onQueryTextChange(newText: String?): Boolean {
                NotesFiltering(newText)
                return true
            }
        })

        super.onCreateOptionsMenu(menu, inflater)
    }

    private fun NotesFiltering(newText: String?) {
        val newFilteredList= arrayListOf<Notes>()
        for (i in oldMyNotes){
            if (i.title!!.contains(newText!!)|| i.notes!!.contains(newText!!)){
                newFilteredList.add(i)
            }
        }
        adaptor.filtering(newFilteredList)
    }

}