// Generated by view binder compiler. Do not edit!
package com.example.favouriteplaces.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.favouriteplaces.R;
import com.google.android.material.card.MaterialCardView;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ItemPlaceBinding implements ViewBinding {
  @NonNull
  private final MaterialCardView rootView;

  @NonNull
  public final TextView placeDescription;

  @NonNull
  public final ImageView placeImage;

  @NonNull
  public final TextView placeName;

  @NonNull
  public final RatingBar ratingBar;

  private ItemPlaceBinding(@NonNull MaterialCardView rootView, @NonNull TextView placeDescription,
      @NonNull ImageView placeImage, @NonNull TextView placeName, @NonNull RatingBar ratingBar) {
    this.rootView = rootView;
    this.placeDescription = placeDescription;
    this.placeImage = placeImage;
    this.placeName = placeName;
    this.ratingBar = ratingBar;
  }

  @Override
  @NonNull
  public MaterialCardView getRoot() {
    return rootView;
  }

  @NonNull
  public static ItemPlaceBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ItemPlaceBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.item_place, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ItemPlaceBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.placeDescription;
      TextView placeDescription = ViewBindings.findChildViewById(rootView, id);
      if (placeDescription == null) {
        break missingId;
      }

      id = R.id.placeImage;
      ImageView placeImage = ViewBindings.findChildViewById(rootView, id);
      if (placeImage == null) {
        break missingId;
      }

      id = R.id.placeName;
      TextView placeName = ViewBindings.findChildViewById(rootView, id);
      if (placeName == null) {
        break missingId;
      }

      id = R.id.ratingBar;
      RatingBar ratingBar = ViewBindings.findChildViewById(rootView, id);
      if (ratingBar == null) {
        break missingId;
      }

      return new ItemPlaceBinding((MaterialCardView) rootView, placeDescription, placeImage,
          placeName, ratingBar);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
