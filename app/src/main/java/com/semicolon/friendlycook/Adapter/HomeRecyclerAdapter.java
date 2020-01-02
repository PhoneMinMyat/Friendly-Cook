package com.semicolon.friendlycook.Adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.semicolon.friendlycook.R;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class HomeRecyclerAdapter extends RecyclerView.Adapter<HomeRecyclerAdapter.MyViewHolder> {

    private String[] categories;

    public HomeRecyclerAdapter(String[] categories) {
        this.categories=categories;
    }

    @NonNull
    @Override
    public HomeRecyclerAdapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.home_top_categories, parent, false);

        MyViewHolder vh = new MyViewHolder(v);
        return vh;
    }

    @Override
    public void onBindViewHolder(@NonNull HomeRecyclerAdapter.MyViewHolder holder, int position) {
        holder.mCategories.setText(categories[position]);
    }

    @Override
    public int getItemCount() {
        return categories.length;
    }


    public class MyViewHolder extends RecyclerView.ViewHolder{

        public TextView mCategories;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            mCategories=(TextView) itemView.findViewById(R.id.categories);
        }
    }
}
