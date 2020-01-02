package com.semicolon.friendlycook.Adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.semicolon.friendlycook.R;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class TodaySpecialAdapter extends RecyclerView.Adapter<TodaySpecialAdapter.MyViewHolder> {

    private Integer[] todaySpecialImage;
    private String[] todaySpecialTitle;

    public TodaySpecialAdapter(Integer[] todaySpecialImage, String[] todaySpecialTitle) {
        this.todaySpecialImage=todaySpecialImage;
        this.todaySpecialTitle=todaySpecialTitle;
    }

    @NonNull
    @Override
    public TodaySpecialAdapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.card_view_today_special, parent, false);

        MyViewHolder vh = new MyViewHolder(v);
        return vh;
    }

    @Override
    public void onBindViewHolder(@NonNull TodaySpecialAdapter.MyViewHolder holder, int position) {
        holder.mFoodImage.setImageResource(todaySpecialImage[position]);
        holder.mTitle.setText(todaySpecialTitle[position]);
    }

    @Override
    public int getItemCount() {
        return todaySpecialImage.length;
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        ImageView mFoodImage;
        TextView mTitle;
        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            mFoodImage=itemView.findViewById(R.id.todaySpecialImage);
            mTitle=itemView.findViewById(R.id.todaySpecialTextTitle);

        }
    }
}
