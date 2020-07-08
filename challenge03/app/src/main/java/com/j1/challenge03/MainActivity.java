package com.j1.challenge03;

import androidx.appcompat.app.AppCompatActivity;

import android.content.res.Resources;
import android.graphics.drawable.BitmapDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.ScrollView;

public class MainActivity extends AppCompatActivity {
    ImageView imageView01;
    ImageView imageView02;
    ScrollView scrollView01;
    ScrollView scrollView02;
    BitmapDrawable bitmapDrawable01;
    BitmapDrawable bitmapDrawable02;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        scrollView01 = findViewById(R.id.scroll01);
        imageView01 = findViewById(R.id.imageView01);
        scrollView01.setHorizontalScrollBarEnabled(true);

        scrollView02 = findViewById(R.id.scroll02);
        imageView02 = findViewById(R.id.imageView02);
        scrollView02.setHorizontalScrollBarEnabled(true);

        Resources res = getResources();
        bitmapDrawable01 = (BitmapDrawable) res.getDrawable(R.drawable.image01);
        bitmapDrawable02 = (BitmapDrawable) res.getDrawable(R.drawable.image02);
        int bitmap01Width = bitmapDrawable01.getIntrinsicWidth();
        int bitmap01Height = bitmapDrawable01.getIntrinsicHeight();
        int bitmap02Width = bitmapDrawable02.getIntrinsicWidth();
        int bitmpa02Height = bitmapDrawable02.getIntrinsicHeight();

        imageView01.setImageDrawable(bitmapDrawable01);
        imageView01.getLayoutParams().width = bitmap01Width;
        imageView01.getLayoutParams().height = bitmap01Height;

        imageView02.setImageDrawable(bitmapDrawable02);
        imageView02.getLayoutParams().width = bitmap02Width;
        imageView02.getLayoutParams().height = bitmpa02Height;

    }

    public void onButton1Clicked(View view) {
        imageUp();
    }

    private void imageUp() {
        Resources res = getResources();
        bitmapDrawable01 = (BitmapDrawable) res.getDrawable(R.drawable.image02);
        bitmapDrawable02 = (BitmapDrawable) res.getDrawable(R.drawable.image01);
        int bitmap01Width = bitmapDrawable01.getIntrinsicWidth();
        int bitmap01Height = bitmapDrawable01.getIntrinsicHeight();
        int bitmap02Width = bitmapDrawable02.getIntrinsicWidth();
        int bitmpa02Height = bitmapDrawable02.getIntrinsicHeight();

        imageView01.setImageDrawable(bitmapDrawable01);
        imageView01.getLayoutParams().width = bitmap01Width;
        imageView01.getLayoutParams().height = bitmap01Height;

        imageView02.setImageDrawable(bitmapDrawable02);
        imageView02.getLayoutParams().width = bitmap02Width;
        imageView02.getLayoutParams().height = bitmpa02Height;
    }

    public void onButton2Clicked(View view) {
        iamgeDown();
    }

    private void iamgeDown() {
        Resources res = getResources();
        bitmapDrawable01 = (BitmapDrawable) res.getDrawable(R.drawable.image01);
        bitmapDrawable02 = (BitmapDrawable) res.getDrawable(R.drawable.image02);
        int bitmap01Width = bitmapDrawable01.getIntrinsicWidth();
        int bitmap01Height = bitmapDrawable01.getIntrinsicHeight();
        int bitmap02Width = bitmapDrawable02.getIntrinsicWidth();
        int bitmpa02Height = bitmapDrawable02.getIntrinsicHeight();

        imageView01.setImageDrawable(bitmapDrawable01);
        imageView01.getLayoutParams().width = bitmap01Width;
        imageView01.getLayoutParams().height = bitmap01Height;

        imageView02.setImageDrawable(bitmapDrawable02);
        imageView02.getLayoutParams().width = bitmap02Width;
        imageView02.getLayoutParams().height = bitmpa02Height;
    }
}