package com.proprog.androidme;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import java.util.ArrayList;
import java.util.List;

public class BodyPartFragment extends Fragment {

    private int partIndex;
    private List<Integer> partList;
    private final String PART_INDEX = "PART_INDEX";
    private final String PART_LIST = "PART_LIST";

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        if (savedInstanceState != null) {
            partIndex = savedInstanceState.getInt(PART_INDEX);
            partList = savedInstanceState.getIntegerArrayList(PART_LIST);
        }
        View view = inflater.inflate(R.layout.fragment_body_part, container, false);
        final ImageView imageView = view.findViewById(R.id.body_part_image_view);
        if (partList != null) {
            imageView.setImageResource(partList.get(partIndex));
            imageView.setOnClickListener(v -> {
                if (partIndex < partList.size() - 1) {
                    partIndex++;
                } else {
                    partIndex = 0;
                }
                imageView.setImageResource(partList.get(partIndex));
            });
        }

        return view;
    }

    @Override
    public void onSaveInstanceState(@NonNull Bundle outState) {
        outState.putInt(PART_INDEX, partIndex);
        outState.putIntegerArrayList(PART_LIST, (ArrayList<Integer>) partList);
    }

    public void setPartIndex(int partIndex) {
        this.partIndex = partIndex;
    }

    public void setPartList(List<Integer> partList) {
        this.partList = partList;
    }
}
