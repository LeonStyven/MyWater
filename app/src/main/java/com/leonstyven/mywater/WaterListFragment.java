package com.leonstyven.mywater;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class WaterListFragment extends Fragment {


    public WaterListFragment() {
        // Required empty public constructor
    }


    public static WaterListFragment newInstance(String param1, String param2) {
        WaterListFragment fragment = new WaterListFragment();
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_water_list, container, false);
    }
}