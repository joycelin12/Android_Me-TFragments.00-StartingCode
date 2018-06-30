package com.example.android.android_me.ui;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.example.android.android_me.R;
import com.example.android.android_me.data.AndroidImageAssets;

/**
 * Created by joycelin12 on 6/28/18.
 */

public class BodyPartFragment extends Fragment {

    public BodyPartFragment(){

    }

    //inflate the fragment layout and sets any image resource
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {

        //inflate the android me fragment layout
        View rootView = inflater.inflate(R.layout.fragment_body_part, container, false);

        //get a reference to ImageView in the fragment layout
        ImageView imageView = (ImageView) rootView.findViewById(R.id.body_part_image_view);

        //set the image resource    to display
        imageView.setImageResource(AndroidImageAssets.getHeads().get(0));

        return rootView;
    }
}
