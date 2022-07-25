package com.example.diaryapp.ui.fragments

import androidx.navigation.ActionOnlyNavDirections
import androidx.navigation.NavDirections
import com.example.diaryapp.R

public class CreateNotesFragmentDirections private constructor() {
  public companion object {
    public fun actionCreateNotesfragmentToHomefragment(): NavDirections =
        ActionOnlyNavDirections(R.id.action_createNotesfragment_to_Homefragment)
  }
}
