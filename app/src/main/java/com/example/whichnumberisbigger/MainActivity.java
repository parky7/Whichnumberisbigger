package com.example.whichnumberisbigger;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button buttonLeft;
    private Button buttonRight;
    private TextView textViewScore;
    private BiggerNumberGame game;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        wireWidgets();
        setListeners();

        game = new BiggerNumberGame(0, 100 );
        updateGameDisplay();
    }

    private void updateGameDisplay() {
        buttonRight.setText(String.valueOf(game.getNumber2()));
        buttonLeft.setText(String.valueOf(game.getNumber1()));

        textViewScore.setText(String.valueOf(game.getScore()));

    }

    private void setListeners() {
        //creating an anonymous inner classs that implements view.OnClickListener
        // overriding the one abstract method onClick
        buttonLeft.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "Left Clicked!",
                        Toast.LENGTH_SHORT).show();

                Toast.makeText(MainActivity.this, game.checkAnswer(game.getNumber1()),
                        Toast.LENGTH_SHORT).show();
                game.generateRandom();
                updateGameDisplay();
            }
        });
        buttonRight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "Right Clicked!",
                        Toast.LENGTH_SHORT).show();
                Toast.makeText(MainActivity.this, game.checkAnswer(game.getNumber2()),
                        Toast.LENGTH_SHORT).show();
                game.generateRandom();
                updateGameDisplay();
            }
        });
    }


    private void wireWidgets() {
        buttonLeft = findViewById(R.id.button_main_left);
        buttonRight = findViewById(R.id.button_main_right);
        textViewScore = findViewById(R.id.textView_main_score);
    }

}
