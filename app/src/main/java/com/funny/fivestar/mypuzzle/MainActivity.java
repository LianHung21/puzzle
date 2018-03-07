package com.funny.fivestar.mypuzzle;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import org.worldsproject.puzzle.PuzzleSelectActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        int[] mImageIds = { R.drawable.image1, R.drawable.image2, R.drawable.image3, };

        Intent intent = new Intent(this, PuzzleSelectActivity.class);
        intent.putExtra("images", mImageIds);

        this.startActivity(intent);
    }
}
