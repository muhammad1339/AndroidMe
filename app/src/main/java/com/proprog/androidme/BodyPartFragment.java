package com.proprog.androidme;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import java.util.List;

public class BodyPartFragment extends Fragment {

    private int partIndex;
    private List<Integer> partList;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_body_part, container, false);
        ImageView imageView = view.findViewById(R.id.body_part_image_view);
        if (partList != null)
            imageView.setImageResource(partList.get(partIndex));
        return view;
    }

    public void setPartIndex(int partIndex) {
        this.partIndex = partIndex;
    }

    public void setPartList(List<Integer> partList) {
        this.partList = partList;
    }
}
