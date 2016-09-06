package com.example.viewpagerdemo;

import android.content.Context;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;

import com.viewpagerindicator.CirclePageIndicator;
import com.viewpagerindicator.TitlePageIndicator;

import java.util.ArrayList;

public class PagerActivity extends AppCompatActivity {

    private Context context;
    private ViewPager mViewPager;
    private mPagerAdapter adapter;
    private View view1, view2, view3;
    private ArrayList<View> mViewList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        context = this;

        init();
    }

    private void init() {
        //init UI component & adapter
        mViewPager = (ViewPager) findViewById(R.id.mViewPager);
        adapter = new mPagerAdapter(context, loadPages());/** ArrayList<View> as param into your adapter**/

        mViewPager.setAdapter(adapter);

        // PageIndicator
        CirclePageIndicator indicator = (CirclePageIndicator) findViewById(R.id.indicator);
        indicator.setViewPager(mViewPager);
    }

    // form page & add to arraylist as your content view
    private ArrayList<View> loadPages() {

        LayoutInflater mInflater = getLayoutInflater().from(context);

        view1 = mInflater.inflate(R.layout.layout_page1, null);
        view2 = mInflater.inflate(R.layout.layout_page2, null);
        view3 = mInflater.inflate(R.layout.layout_page3, null);

        mViewList = new ArrayList<View>();

        mViewList.add(view1);
        mViewList.add(view2);
        mViewList.add(view3);

        return mViewList;
    }
}
