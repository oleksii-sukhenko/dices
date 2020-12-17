package com.example.dices;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends Activity {
    private ImageView iv_dice;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        iv_dice = findViewById(R.id.iv_dice);
    }
    private void rollDice(){
        int random = new Random().nextInt(6) + 1;
        switch (random){
            case 1:
                iv_dice.setImageResource(R.drawable.dice1);
                break;
            case 2:
                iv_dice.setImageResource(R.drawable.dice2);
                break;
            case 3:
                iv_dice.setImageResource(R.drawable.dice3);
                break;
            case 4:
                iv_dice.setImageResource(R.drawable.dice4);
                break;
            case 5:
                iv_dice.setImageResource(R.drawable.dice5);
                break;
            case 6:
                iv_dice.setImageResource(R.drawable.dice6);
                break;
        }
    }

    public void onClickRoll(View view) {
        rollDice();
    }
}