package com.example.twitterfeedmvvm.view.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.twitterfeedmvvm.R;
import com.example.twitterfeedmvvm.model.Twitter;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Locale;

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

        return new TwitterViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull TwitterViewHolder holder, int position) {
        Twitter twitter = twitterList.get(position);

        holder.userName.setText(twitter.getUser_Name());
        holder.userId.setText(twitter.getUser_Id());
        holder.userMessage.setText(twitter.getUser_Message());

        SimpleDateFormat formatter = new SimpleDateFormat("yyyy.MM.dd G 'at' HH:mm:ss", Locale.US);

        Date date = twitter.getUser_Time();

        holder.userDate.setText(formatter.format(date));



    }

    @Override
    public int getItemCount() {
        return twitterList.size();
    }

    class TwitterViewHolder extends RecyclerView.ViewHolder {
        TextView userName;
        TextView userId;
        TextView userMessage;
        TextView userDate;
        ImageView userImage;

        public TwitterViewHolder(@NonNull View itemView) {
            super(itemView);
            userName = itemView.findViewById(R.id.u_Name);
            userId = itemView.findViewById(R.id.u_Id);
            userMessage = itemView.findViewById(R.id.u_Message);
            userDate = itemView.findViewById(R.id.u_Time);
            userImage = itemView.findViewById(R.id.u_Image);

        }
    }
}
