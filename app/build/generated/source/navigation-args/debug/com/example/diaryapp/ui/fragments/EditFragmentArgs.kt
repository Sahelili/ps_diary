package com.example.diaryapp.ui.fragments

import android.os.Bundle
import android.os.Parcelable
import androidx.lifecycle.SavedStateHandle
import androidx.navigation.NavArgs
import java.io.Serializable
import java.lang.IllegalArgumentException
import java.lang.UnsupportedOperationException
import kotlin.Suppress
import kotlin.jvm.JvmStatic
import roommvvm.model.Notes

public data class EditFragmentArgs(
  public val `data`: Notes
) : NavArgs {
  @Suppress("CAST_NEVER_SUCCEEDS")
  public fun toBundle(): Bundle {
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

  @Suppress("CAST_NEVER_SUCCEEDS")
  public fun toSavedStateHandle(): SavedStateHandle {
    val result = SavedStateHandle()
    if (Parcelable::class.java.isAssignableFrom(Notes::class.java)) {
      result.set("data", this.data as Parcelable)
    } else if (Serializable::class.java.isAssignableFrom(Notes::class.java)) {
      result.set("data", this.data as Serializable)
    } else {
      throw UnsupportedOperationException(Notes::class.java.name +
          " must implement Parcelable or Serializable or must be an Enum.")
    }
    return result
  }

  public companion object {
    @JvmStatic
    public fun fromBundle(bundle: Bundle): EditFragmentArgs {
      bundle.setClassLoader(EditFragmentArgs::class.java.classLoader)
      val __data : Notes?
      if (bundle.containsKey("data")) {
        if (Parcelable::class.java.isAssignableFrom(Notes::class.java) ||
            Serializable::class.java.isAssignableFrom(Notes::class.java)) {
          __data = bundle.get("data") as Notes?
        } else {
          throw UnsupportedOperationException(Notes::class.java.name +
              " must implement Parcelable or Serializable or must be an Enum.")
        }
        if (__data == null) {
          throw IllegalArgumentException("Argument \"data\" is marked as non-null but was passed a null value.")
        }
      } else {
        throw IllegalArgumentException("Required argument \"data\" is missing and does not have an android:defaultValue")
      }
      return EditFragmentArgs(__data)
    }

    @JvmStatic
    public fun fromSavedStateHandle(savedStateHandle: SavedStateHandle): EditFragmentArgs {
      val __data : Notes?
      if (savedStateHandle.contains("data")) {
        if (Parcelable::class.java.isAssignableFrom(Notes::class.java) ||
            Serializable::class.java.isAssignableFrom(Notes::class.java)) {
          __data = savedStateHandle.get<Notes?>("data")
        } else {
          throw UnsupportedOperationException(Notes::class.java.name +
              " must implement Parcelable or Serializable or must be an Enum.")
        }
        if (__data == null) {
          throw IllegalArgumentException("Argument \"data\" is marked as non-null but was passed a null value")
        }
      } else {
        throw IllegalArgumentException("Required argument \"data\" is missing and does not have an android:defaultValue")
      }
      return EditFragmentArgs(__data)
    }
  }
}
