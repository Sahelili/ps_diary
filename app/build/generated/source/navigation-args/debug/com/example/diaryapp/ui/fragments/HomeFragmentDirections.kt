package com.example.diaryapp.ui.fragments

import android.os.Bundle
import android.os.Parcelable
import androidx.navigation.ActionOnlyNavDirections
import androidx.navigation.NavDirections
import com.example.diaryapp.R
import java.io.Serializable
import java.lang.UnsupportedOperationException
import kotlin.Int
import kotlin.Suppress
import roommvvm.model.Notes

public class HomeFragmentDirections private constructor() {
  private data class ActionHomefragmentToEditfragment2(
    public val `data`: Notes
  ) : NavDirections {
    public override val actionId: Int = R.id.action_homefragment_to_editfragment2

    public override val arguments: Bundle
      @Suppress("CAST_NEVER_SUCCEEDS")
      get() {
        val result = Bundle()
        if (Parcelable::class.java.isAssignableFrom(Notes::class.java)) {
          result.putParcelable("data", this.data as Parcelable)
        } else if (Serializable::class.java.isAssignableFrom(Notes::class.java)) {
          result.putSerializable("data", this.data as Serializable)
        } else {
          throw UnsupportedOperationException(Notes::class.java.name +
              " must implement Parcelable or Serializable or must be an Enum.")
        }
        return result
      }
  }

  public companion object {
    public fun actionHomefragmentToEditfragment2(`data`: Notes): NavDirections =
        ActionHomefragmentToEditfragment2(data)

    public fun actionHomefragmentToCreateNotesfragment(): NavDirections =
        ActionOnlyNavDirections(R.id.action_homefragment_to_createNotesfragment)
  }
}
