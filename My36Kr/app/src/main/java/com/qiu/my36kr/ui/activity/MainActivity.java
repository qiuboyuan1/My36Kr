package com.qiu.my36kr.ui.activity;

import android.graphics.Color;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.qiu.my36kr.R;
import com.qiu.my36kr.ui.adapter.MyMainAdapter;
import com.qiu.my36kr.ui.fragment.FindFragment;
import com.qiu.my36kr.ui.fragment.MessageFragment;
import com.qiu.my36kr.ui.fragment.MineFragment;
import com.qiu.my36kr.ui.fragment.NewspaperFragment;
import com.qiu.my36kr.ui.fragment.RecruiteFragment;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends MyBaseActivity {
    private ViewPager viewPager;
    private MyMainAdapter adapter;
    private TabLayout tabLayout;
    private List<Fragment> fragments;

    @Override
    protected int setLayout() {
        return R.layout.activity_main;
    }

    @Override
    protected void initView() {
        viewPager=byView(R.id.activity_main_vp);
        tabLayout=byView(R.id.activity_main_tab);

    }

    @Override
    protected void initData() {
        adapter=new MyMainAdapter(getSupportFragmentManager());
        fragments=new ArrayList<>();
        fragments.add(new NewspaperFragment());
        fragments.add(new RecruiteFragment());
        fragments.add(new FindFragment());
        fragments.add(new MessageFragment());
        fragments.add(new MineFragment());
        adapter.setFragments(fragments);
        viewPager.setAdapter(adapter);
        tabLayout.setupWithViewPager(viewPager);
        tabLayout.getTabAt(0).setIcon(R.drawable.tabbar_news);
        tabLayout.getTabAt(1).setIcon(R.drawable.tabbar_equity);
        tabLayout.getTabAt(2).setIcon(R.drawable.tabbar_discovery);
        tabLayout.getTabAt(3).setIcon(R.drawable.tabbar_message);
        tabLayout.getTabAt(4).setIcon(R.drawable.tabbar_mine);
        tabLayout.setSelectedTabIndicatorColor(Color.BLUE);
        tabLayout.setTabTextColors(Color.rgb(36, 36, 36), Color.rgb(56, 115, 246));
    }
}
