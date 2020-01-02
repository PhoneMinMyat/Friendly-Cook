package com.semicolon.friendlycook;

import android.os.Bundle;

import com.google.android.material.tabs.TabLayout;
import com.semicolon.friendlycook.Adapter.MyAdapter;

import androidx.viewpager.widget.ViewPager;
import androidx.appcompat.app.AppCompatActivity;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final TabLayout tabs = findViewById(R.id.tabs);
        final ViewPager viewPager=findViewById(R.id.view_pager);
        tabs.addTab(tabs.newTab().setIcon(R.drawable.ic_home_icon_silhouette));
        tabs.addTab(tabs.newTab().setIcon(R.drawable.ic_shopping_cart_black_shape));
        tabs.addTab(tabs.newTab().setIcon(R.drawable.ic_favorite_heart_button));
        tabs.addTab(tabs.newTab().setIcon(R.drawable.ic_user));
        tabs.setTabGravity(TabLayout.GRAVITY_FILL);

        final MyAdapter myAdapter=new MyAdapter(this,getSupportFragmentManager(),tabs.getTabCount());
        viewPager.setAdapter(myAdapter);
        viewPager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tabs));
        tabs.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                viewPager.setCurrentItem(tabs.getSelectedTabPosition());
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });



    }
}