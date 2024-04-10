package com.example.labrab1;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.view.View.OnClickListener;
import android.widget.Toast;

public class Imya extends Fragment {
    TextView textView2;
    Button button4;

    public Imya() {
        // Required empty public constructor
        super(R.layout.fragment_imya);
    }



    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        TextView textView2 = view.findViewById(R.id.textView2);
        Button button4= view.findViewById (R.id.button4);
        Button button1= view.findViewById (R.id.button1);

        OnClickListener ocl = new OnClickListener() {
            @Override
            public void onClick(View v) {
                textView2.setText("Button was pressed...");
                Toast.makeText(button4.getContext(),"ЗАЧЕМ НАЖАЛ?!",Toast.LENGTH_LONG).show();
            }
        };
        button4.setOnClickListener(ocl);

    }
}