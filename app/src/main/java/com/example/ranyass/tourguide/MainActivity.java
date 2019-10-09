package com.example.ranyass.tourguide;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;


public class MainActivity extends AppCompatActivity {

    private Toolbar toolbar;
    private TabLayout tabLayout;
    private ViewPager viewPager;
    private int[] tabIcons = {
            R.drawable.baseline_phone_black_18dp,
            R.drawable.baseline_stars_white_18dp,
            R.drawable.baseline_room_service_white_18dp,
            R.drawable.baseline_videogame_asset_white_18dp
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        toolbar =  findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        getSupportActionBar().setDisplayHomeAsUpEnabled(false);

        viewPager = findViewById(R.id.viewpager);
        setupViewPager(viewPager);

        tabLayout =  findViewById(R.id.tabs);
        tabLayout.setupWithViewPager(viewPager);

        setupTabIcons();
    }
    private void setupViewPager(ViewPager viewPager) {
        ViewPagerAdapter adapter = new ViewPagerAdapter(getSupportFragmentManager());
        adapter.addFragment(new OneFragment(), "ONE");
        adapter.addFragment(new TwoFragment(), "Two");
        adapter.addFragment(new ThreeFragment(), "Three");
        adapter.addFragment(new FourFragment(), "Four");
        viewPager.setAdapter(adapter);
    }
    class ViewPagerAdapter extends FragmentPagerAdapter {
        private final List<Fragment> mFragmentList = new ArrayList<>();
        private final List<String> mFragmentTitleList = new ArrayList<>();

        public ViewPagerAdapter(FragmentManager manager) {
            super(manager);
        }

        @Override
        public Fragment getItem(int position) {
            return mFragmentList.get(position);
        }

        @Override
        public int getCount() {
            return mFragmentList.size();
        }

        public void addFragment(Fragment fragment, String title) {
            mFragmentList.add(fragment);
            mFragmentTitleList.add(title);
        }

        @Override
        public CharSequence getPageTitle(int position) {
            return mFragmentTitleList.get(position);
        }
    }
    private void setupTabIcons() {

        TextView tabThird = (TextView) LayoutInflater.from(this).inflate(R.layout.tab_style, null);
        tabThird.setText(R.string.Sightseeing);
        tabThird.setCompoundDrawablesWithIntrinsicBounds( R.drawable.baseline_stars_white_18dp,0, 0, 0);
        tabLayout.getTabAt(0).setCustomView(tabThird);

        TextView tabFirst = (TextView) LayoutInflater.from(this).inflate(R.layout.tab_style, null);
        tabFirst.setText(R.string.Restaurants);
        tabFirst.setCompoundDrawablesWithIntrinsicBounds( R.drawable.baseline_room_service_white_18dp,0, 0, 0);
        tabLayout.getTabAt(1).setCustomView(tabFirst);

        TextView tabSecond = (TextView) LayoutInflater.from(this).inflate(R.layout.tab_style, null);
        tabSecond.setText(R.string.Kids);
        tabSecond.setCompoundDrawablesWithIntrinsicBounds( R.drawable.baseline_videogame_asset_white_18dp,0, 0, 0);
        tabLayout.getTabAt(2).setCustomView(tabSecond);

        TextView tabForth = (TextView) LayoutInflater.from(this).inflate(R.layout.tab_style, null);
        tabForth.setText(R.string.Malls);
        //tabForth.setCompoundDrawablesWithIntrinsicBounds( R.drawable.baseline_videogame_asset_white_18dp,0, 0, 0);
        tabLayout.getTabAt(3).setCustomView(tabForth);
    }
}
