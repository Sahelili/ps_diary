package com.example.diaryapp.ui.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.navigation.Navigation
import androidx.recyclerview.widget.RecyclerView
import com.example.diaryapp.databinding.ItemDiaryBinding
import com.example.diaryapp.ui.fragments.HomeFragmentDirections
import roommvvm.model.Notes

class NotesAdapter(val requireContext: Context,var notesList: List<Notes>) :
    RecyclerView.Adapter<NotesAdapter.notesViewHolder>(){

    fun filtering(newFilteredList: ArrayList<Notes>) {
        notesList= newFilteredList
        notifyDataSetChanged()
    }
    class notesViewHolder(val binding: ItemDiaryBinding) : RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): notesViewHolder {
        return notesViewHolder(ItemDiaryBinding.inflate(
            LayoutInflater.from(parent.context),parent,false))
    }

    override fun onBindViewHolder(holder: notesViewHolder, position: Int) {
        val data =notesList[position]
        holder.binding.date.text=data.date
        holder.binding.titleNotes.text=data.title

        holder.binding.root.setOnClickListener {
            val action= HomeFragmentDirections.actionHomefragmentToEditfragment2(data)
            Navigation.findNavController(it).navigate(action)
        }

    }

    override fun getItemCount()= notesList.size
}