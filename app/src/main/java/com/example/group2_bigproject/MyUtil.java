package com.example.group2_bigproject;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.widget.ImageButton;
import android.widget.ImageView;

import androidx.core.content.ContextCompat;

public class MyUtil {
    //this method for displaying the avaUser in the bestway
    //ImageButton uses background, ImageView uses ImageResource
    public static void setImageButtonBackground(Context context, int imageId, ImageView imageBtn) {
        Drawable drawable = ContextCompat.getDrawable(context, imageId);
        if (drawable != null) {
            imageBtn.setImageDrawable(drawable);
        }
    }
}
