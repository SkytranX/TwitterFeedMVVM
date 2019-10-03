package com.example.twitterfeedmvvm.view.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.twitterfeedmvvm.R;
import com.example.twitterfeedmvvm.model.Twitter;

import java.util.List;

public class TwitterAdapter extends RecyclerView.Adapter<TwitterAdapter.TwitterViewHolder> {

    private List<Twitter> twitterList;

    public TwitterAdapter(List<Twitter> twitterList) {
        this.twitterList = twitterList;
    }

    @NonNull
    @Override
    public TwitterViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(
                R.layout.twitter_item,
                parent,
                false
        );

        return TwitterViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull TwitterViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return twitterList.size();
    }

    class TwitterViewHolder extends RecyclerView.ViewHolder {

        public TwitterViewHolder(@NonNull View itemView) {
            super(itemView);
        }
    }
}
