package com.exercise.viewpager.pager;

import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.viewpager.widget.PagerAdapter;

import org.jetbrains.annotations.NotNull;

import java.util.List;

public class MyAdapter extends PagerAdapter {

    private List<View> mListView;

    public MyAdapter(List<View> mListView) {
        this.mListView = mListView;
    }

    @NonNull
    @NotNull
    @Override
    public Object instantiateItem(@NonNull @NotNull ViewGroup container, int position) {
        container.addView(mListView.get(position),0);
        return mListView.get(position);
    }

    @Override
    public int getCount() {
//        how many pagers viewpager has
        return mListView.size();
    }

    @Override
    public boolean isViewFromObject(@NonNull @org.jetbrains.annotations.NotNull View view, @NonNull @org.jetbrains.annotations.NotNull Object object) {
        return view == object;
    }

    @Override
    public void destroyItem(@NonNull @NotNull ViewGroup container, int position, @NonNull @NotNull Object object) {
        container.removeView(mListView.get(position));
    }
}
