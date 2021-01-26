package com.jguedel.lab2_hungryfull;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView HungryView;
    private boolean isHungry;
    private Button EatBtn;
    private ImageView Face;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        HungryView = findViewById(R.id.textView);
        Face = findViewById(R.id.imageView);
        startHunger();
        EatBtn = findViewById(R.id.button);
        EatBtn.setOnClickListener(eatCookie);

    }
    private final View.OnClickListener eatCookie = new View.OnClickListener() {
        public void onClick(View v){
            if(isHungry){
                isHungry = false;
                HungryView.setText(R.string.full);
                EatBtn.setText(R.string.fullBtn);
                Face.setImageResource(R.mipmap.full);
            }else{
                isHungry = true;
                HungryView.setText(R.string.hungry);
                EatBtn.setText(R.string.hungryBtn);
                Face.setImageResource(R.mipmap.hungry2);
            }
        }
    };
    private void startHunger() {
        isHungry = true;
    }
}