package com.example.lab_rab_2;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

public class Result extends Fragment {

    public Result() {

    }

    private TextView textView;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_result, container, false);
        textView = view.findViewById(R.id.textView2);

        return view;
    }

    public void displayText(String text) {
        textView.setText(text);
    }
}