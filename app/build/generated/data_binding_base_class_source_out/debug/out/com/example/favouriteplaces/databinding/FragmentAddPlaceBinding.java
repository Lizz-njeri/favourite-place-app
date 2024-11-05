// Generated by view binder compiler. Do not edit!
package com.example.favouriteplaces.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.favouriteplaces.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class FragmentAddPlaceBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final Button buttonCancel;

  @NonNull
  public final EditText editTextPlaceRating;

  @NonNull
  public final EditText placeDescriptionEditText;

  @NonNull
  public final EditText placeNameEditText;

  @NonNull
  public final Button saveButton;

  private FragmentAddPlaceBinding(@NonNull LinearLayout rootView, @NonNull Button buttonCancel,
      @NonNull EditText editTextPlaceRating, @NonNull EditText placeDescriptionEditText,
      @NonNull EditText placeNameEditText, @NonNull Button saveButton) {
    this.rootView = rootView;
    this.buttonCancel = buttonCancel;
    this.editTextPlaceRating = editTextPlaceRating;
    this.placeDescriptionEditText = placeDescriptionEditText;
    this.placeNameEditText = placeNameEditText;
    this.saveButton = saveButton;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static FragmentAddPlaceBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static FragmentAddPlaceBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.fragment_add_place, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static FragmentAddPlaceBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.buttonCancel;
      Button buttonCancel = ViewBindings.findChildViewById(rootView, id);
      if (buttonCancel == null) {
        break missingId;
      }

      id = R.id.editTextPlaceRating;
      EditText editTextPlaceRating = ViewBindings.findChildViewById(rootView, id);
      if (editTextPlaceRating == null) {
        break missingId;
      }

      id = R.id.placeDescriptionEditText;
      EditText placeDescriptionEditText = ViewBindings.findChildViewById(rootView, id);
      if (placeDescriptionEditText == null) {
        break missingId;
      }

      id = R.id.placeNameEditText;
      EditText placeNameEditText = ViewBindings.findChildViewById(rootView, id);
      if (placeNameEditText == null) {
        break missingId;
      }

      id = R.id.saveButton;
      Button saveButton = ViewBindings.findChildViewById(rootView, id);
      if (saveButton == null) {
        break missingId;
      }

      return new FragmentAddPlaceBinding((LinearLayout) rootView, buttonCancel, editTextPlaceRating,
          placeDescriptionEditText, placeNameEditText, saveButton);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
