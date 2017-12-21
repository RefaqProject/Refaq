package com.example.elashry.refaq;

import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.daimajia.slider.library.Animations.DescriptionAnimation;
import com.daimajia.slider.library.SliderLayout;
import com.daimajia.slider.library.SliderTypes.BaseSliderView;
import com.daimajia.slider.library.SliderTypes.TextSliderView;
import com.daimajia.slider.library.Tricks.ViewPagerEx;

import java.util.HashMap;

public class News extends AppCompatActivity implements  BaseSliderView.OnSliderClickListener, ViewPagerEx.OnPageChangeListener{
    private SliderLayout mDemoSlider;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_news);
        init_View();
    }
    public void init_View() {
        mDemoSlider = (SliderLayout) findViewById(R.id.slider);

        HashMap<String, Integer> file_maps = new HashMap<String, Integer>();
        file_maps.put("اكفل يتيم", R.drawable.cover);
        file_maps.put("الصدقه تبقي ", R.drawable.image1);
        file_maps.put("سبحان الله", R.drawable.profile);
        file_maps.put("لا اله الا الله", R.drawable.cover);
        file_maps.put("انا وكافل اليتيم كهاتين فى الجنه", R.drawable.prson);
        file_maps.put("صلى على محمد", R.drawable.cover);



        for (String name : file_maps.keySet()) {
            TextSliderView textSliderView = new TextSliderView(this);
            // initialize a SliderLayout
            textSliderView.description(name)
                    .image(file_maps.get(name))
                    .setScaleType(BaseSliderView.ScaleType.Fit)
                    .setOnSliderClickListener(this);

            //add your extra information
            textSliderView.bundle(new Bundle());
            textSliderView.getBundle().putString("extra", name);
            mDemoSlider.addSlider(textSliderView);
        }
        mDemoSlider.setPresetTransformer(SliderLayout.Transformer.Accordion);
        mDemoSlider.setPresetIndicator(SliderLayout.PresetIndicators.Center_Bottom);
        mDemoSlider.setCustomAnimation(new DescriptionAnimation());
        mDemoSlider.setDuration(2000);
        mDemoSlider.addOnPageChangeListener(this);


    }

    @Override
    public void onSliderClick(BaseSliderView slider) {

    }

    @Override
    public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

    }

    @Override
    public void onPageSelected(int position) {

    }

    @Override
    public void onPageScrollStateChanged(int state) {

    }
}
