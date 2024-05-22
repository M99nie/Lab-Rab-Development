package com.example.lab_rab_3;

import android.os.Bundle;
import android.widget.ImageButton;
import android.widget.ImageView;

import android.view.View;
import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class COPYbara extends AppCompatActivity {

    private ImageView pic1;
    private ImageButton imageButton;
    private final int[] images = {R.drawable.q, R.drawable.w, R.drawable.e, R.drawable.r,
            R.drawable.t, R.drawable.y, R.drawable.u, R.drawable.i,
            R.drawable.o, R.drawable.p, R.drawable.a, R.drawable.s,
            R.drawable.d, R.drawable.f, R.drawable.g, R.drawable.h, R.drawable.j};
    private int current_image = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_copybara);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);

            ImageButton next_image_btn = (ImageButton) findViewById(R.id.imageButton);
            ImageView image_view = (ImageView) findViewById(R.id.pic1);
            next_image_btn.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (current_image < images.length - 1) {
                        current_image++;
                    }
                    else {
                        current_image = 0;
                    }
                    image_view.setImageResource(images[current_image]);
                }
            });


            return insets;
        });
    }
}