package com.example.funnybirds;
import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    private ConstraintLayout layout;
    private float clickX;
    private float clickY;
    @SuppressLint("ResourceType")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_main);
        setContentView(new GameView(this));
        layout = findViewById(R.layout.activity_main);


        layout.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                if (event.getAction() == MotionEvent.ACTION_DOWN) {
                    // Получаем координаты клика относительно родительского View
                    clickX = event.getX();
                    clickY = event.getY();
                }
                return true;
            }
        });
    }

    public float getClickX(){
        return clickX;
    }

    public float getClickY(){
        return clickY;
    }

}