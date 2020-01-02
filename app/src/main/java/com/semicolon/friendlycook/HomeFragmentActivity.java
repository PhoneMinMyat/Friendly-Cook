package com.semicolon.friendlycook;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;


import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.semicolon.friendlycook.Adapter.HomeRecyclerAdapter;
import com.semicolon.friendlycook.Adapter.TodaySpecialAdapter;

public class HomeFragmentActivity extends Fragment {
    public HomeFragmentActivity(){

    }

    private RecyclerView mCategoriesRecyclerView;
    private RecyclerView.Adapter mCategoriesAdapter;
    private RecyclerView.LayoutManager mCategorieslayoutManager;

    private RecyclerView mTodaySpecialRecyclerView;
    private RecyclerView.Adapter mTodaySpecialAdapter;
    private RecyclerView.LayoutManager mTodaySpecialLayoutManager;


    private String[] categories={"chicken","duck","cheese","pork","dessert","fish","crab", "prawn"};

    private Integer[] todaySpecialImage={R.drawable.roast_chicken,R.drawable.beef};
    private String[] todaySpecialTitle={"Roasted Chicken","Roasted Beef"};


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view= inflater.inflate(R.layout.activity_home_fragment,container,false);


        mCategoriesRecyclerView=(RecyclerView) view.findViewById(R.id.categoriesRecyclerView);
        mCategoriesRecyclerView.setHasFixedSize(true);
        mCategorieslayoutManager=new LinearLayoutManager(getContext(), LinearLayoutManager.HORIZONTAL,false);
        mCategoriesRecyclerView.setLayoutManager(mCategorieslayoutManager);
        mCategoriesAdapter=new HomeRecyclerAdapter(categories);
        mCategoriesRecyclerView.setAdapter(mCategoriesAdapter);


        mTodaySpecialRecyclerView=(RecyclerView) view.findViewById(R.id.RecyclerViewTodaySpecial);
        mTodaySpecialRecyclerView.setHasFixedSize(true);
        mTodaySpecialLayoutManager=new LinearLayoutManager(getContext(), LinearLayoutManager.HORIZONTAL,false);
        mTodaySpecialRecyclerView.setLayoutManager(mTodaySpecialLayoutManager);
        mTodaySpecialAdapter=new TodaySpecialAdapter(todaySpecialImage,todaySpecialTitle);
        mTodaySpecialRecyclerView.setAdapter(mTodaySpecialAdapter);


        return view;
    }

    
}
