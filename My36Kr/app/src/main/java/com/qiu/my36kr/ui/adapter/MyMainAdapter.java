package com.qiu.my36kr.ui.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.List;

/**
 * Created by dllo on 16/7/11.
 */
public class MyMainAdapter extends FragmentPagerAdapter {
    private List<Fragment> fragments;
    private String titles[] = {"新闻", "股权投资", "发现", "消息", "我的"};

    public void setFragments(List<Fragment> fragments) {
        this.fragments = fragments;
    }

    public MyMainAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        return fragments.get(position);
    }

    @Override
    public int getCount() {
        return fragments == null ? 0 : fragments.size();
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return titles[position];
    }
}
