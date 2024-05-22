package com.example.lab_rab_2;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.example.lab_rab_2.Result;
import com.example.lab_rab_2.Tekast;

public class Fragment_View extends AppCompatActivity implements Tekast.OnTextEnteredListener{

    //public Tekast.FirstFragment firstFragment;
    //private Result.SecondFragment secondFragment;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_fragment_view);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);

            //firstFragment = new FirstFragment();
            //secondFragment = new SecondFragment();

            //getSupportFragmentManager().beginTransaction()
            //        .add(R.id.fragmentContainerView2, firstFragment)
            //        .add(R.id.fragmentContainerView, secondFragment)
            //        .commit();

            //firstFragment.setOnTextEnteredListener(this);
            //Button button2 = findViewById(R.id.button2);


            return insets;
        });
    }

    @Override
    public void onTextEntered(String text) {
        Result secondFragment = (Result)getSupportFragmentManager()
                .findFragmentById(R.id.fragmentContainerView);
        if (secondFragment != null)
            secondFragment.displayText(text);
    }
}