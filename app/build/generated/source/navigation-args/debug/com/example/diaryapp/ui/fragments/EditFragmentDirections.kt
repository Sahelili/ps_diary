package com.example.diaryapp.ui.fragments

import androidx.navigation.ActionOnlyNavDirections
import androidx.navigation.NavDirections
import com.example.diaryapp.R

public class EditFragmentDirections private constructor() {
  public companion object {
    public fun actionEditfragment2ToHomefragment(): NavDirections =
        ActionOnlyNavDirections(R.id.action_editfragment2_to_homefragment)
  }
}
