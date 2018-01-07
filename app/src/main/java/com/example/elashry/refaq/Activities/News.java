package com.example.elashry.refaq.Activities;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.daimajia.slider.library.Animations.DescriptionAnimation;
import com.daimajia.slider.library.SliderLayout;
import com.daimajia.slider.library.SliderTypes.BaseSliderView;
import com.daimajia.slider.library.SliderTypes.TextSliderView;
import com.daimajia.slider.library.Tricks.ViewPagerEx;
import com.example.elashry.refaq.Adapters.News_Adapter;
import com.example.elashry.refaq.R;

import java.util.HashMap;

public class News extends AppCompatActivity implements  BaseSliderView.OnSliderClickListener, ViewPagerEx.OnPageChangeListener{
    private SliderLayout mDemoSlider;
    String [] programsNames = {String.valueOf(R.string.tit),String.valueOf(R.string.tit),String.valueOf(R.string.tit),"البرنامج الرابع","البرنامج الثالث","البرنامج الثانى","البرنامج الاول "};
    int [] programsImg = {R.drawable.program5,R.drawable.program2,R.drawable.program3,R.drawable.program7,R.drawable.program5,R.drawable.program6,R.drawable.program7};
    RecyclerView programRecyclerView;
    News_Adapter programRecyclerAdapter;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_news);
        init_View();

        programRecyclerView = (RecyclerView) findViewById(R.id.recyclerview_new);
        programRecyclerAdapter = new News_Adapter(News.this,programsNames,programsImg);
        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        programRecyclerView.setLayoutManager(layoutManager);
        programRecyclerView.setHasFixedSize(true);


        programRecyclerView.setAdapter(programRecyclerAdapter);
    }
    public void init_View() {
        mDemoSlider = (SliderLayout) findViewById(R.id.slider);

        HashMap<String, Integer> file_maps = new HashMap<String, Integer>();
        file_maps.put("اكفل يتيم", R.drawable.profile);
        file_maps.put("الصدقه تبقي ", R.drawable.image1);
        file_maps.put("سبحان الله", R.drawable.profile);
        file_maps.put("لا اله الا الله", R.drawable.profile);
        file_maps.put("انا وكافل اليتيم كهاتين فى الجنه", R.drawable.prson);
        file_maps.put("صلى على محمد", R.drawable.profile);



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
