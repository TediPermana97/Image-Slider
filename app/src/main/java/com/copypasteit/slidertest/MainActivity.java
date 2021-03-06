package com.copypasteit.slidertest;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.denzcoskun.imageslider.ImageSlider;
import com.denzcoskun.imageslider.models.SlideModel;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    ImageSlider imageSlider;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imageSlider = findViewById(R.id.imege_slider);

        List<SlideModel> imageList = new ArrayList<>();

        //ArrayList imageList = ArrayList<SlideModel>() // Create image list

// imageList.add(SlideModel("String Url" or R.drawable)
// imageList.add(SlideModel("String Url" or R.drawable, "title") You can add title

        imageList.add(new SlideModel("https://bit.ly/2YoJ77H", "Test Gambar."));
        imageList.add(new SlideModel("https://bit.ly/2BteuF2", "Test Gambar."));
        imageList.add(new SlideModel("https://bit.ly/3fLJf72", "Test Gambar."));

        imageSlider.setImageList(imageList, true);
    }
}
