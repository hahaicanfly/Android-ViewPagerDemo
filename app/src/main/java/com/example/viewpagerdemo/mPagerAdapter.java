package com.example.viewpagerdemo;

import android.content.Context;
import android.support.v4.view.PagerAdapter;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;

/**
 * Created by akira on 2016/8/30.
 */
public class mPagerAdapter extends PagerAdapter{

    private ArrayList<View> mViewList;
    private Context context;

    /**
     * you can auto generate these methods below
     * by  (code -> Generate : Constructor,Override,implement)
     *  **/

    //Constructor
    public mPagerAdapter(Context context,ArrayList<View> mViewList) {
        this.mViewList = mViewList;
        this.context = context;
    }

    //let object(page1~3) as your view
    @Override
    public boolean isViewFromObject(View view, Object object) {
        return view == object;
    }

    //how many pages you have
    @Override
    public int getCount() {
        return mViewList.size();
    }

    @Override
    public int getItemPosition(Object object) {
        return super.getItemPosition(object);
    }

    @Override
    public Object instantiateItem(ViewGroup container, int position) {
        container.addView(mViewList.get(position));
        return mViewList.get(position);
    }

    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {
        container.removeView(mViewList.get(position));
    }
}
