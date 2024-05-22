package com.example.lab_rab_2;

import android.content.Context;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class Tekast extends Fragment {

    public Tekast() {
        // Required empty public constructor
    }


    public EditText editText;

    public interface OnTextEnteredListener {
        void onTextEntered(String text);
    }

    public OnTextEnteredListener textEnteredListener;

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        try {
            textEnteredListener = (OnTextEnteredListener) context;
        } catch (ClassCastException e) {
            throw new ClassCastException(context.toString());
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_tekast, container, false);
        editText = view.findViewById(R.id.editTextText);

        Button button = view.findViewById(R.id.button3);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String enteredText = editText.getText().toString();
                //if (textEnteredListener != null) {
                textEnteredListener.onTextEntered(enteredText);
                // }
            }
        });

        return view;
    }
}