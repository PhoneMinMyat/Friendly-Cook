package com.semicolon.friendlycook;

import android.content.Context;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class MyAdapter extends FragmentPagerAdapter {
    Context context;
    int totalTabs;

    public MyAdapter(Context c,FragmentManager fm,int totalTabs) {
        super(fm);
        context=c;
        this.totalTabs=totalTabs;
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0:
                HomeFragmentActivity home=new HomeFragmentActivity();
                return home;
            case 1:
                CartFragmentActivity cart=new CartFragmentActivity();
                return cart;
            case 2:
                FavouriteFragmentActivity favourite=new FavouriteFragmentActivity();
                return favourite;
            case 3:
                ProfileFragmentActivity profile=new ProfileFragmentActivity();
                return profile;
                default:
                    return null;
        }

    }

    @Override
    public int getCount() {
        return totalTabs;
    }
}
