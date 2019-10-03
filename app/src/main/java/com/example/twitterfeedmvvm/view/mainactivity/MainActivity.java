package com.example.twitterfeedmvvm.view.mainactivity;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelProviders;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.twitterfeedmvvm.R;
import com.example.twitterfeedmvvm.view.adapter.TwitterAdapter;
import com.example.twitterfeedmvvm.viewmodel.MainActivityViewModel;

public class MainActivity extends AppCompatActivity {
    private MainActivityViewModel m_ViewModel;
    private RecyclerView recyclerView;
    private TwitterAdapter recyclerAdapter;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        m_ViewModel = ViewModelProviders
                .of(this)
                .get(MainActivityViewModel.class);
        m_ViewModel .getData();

        recyclerView = findViewById(R.id.rv_Recycler);

        DividerItemDecoration item = new DividerItemDecoration(this,DividerItemDecoration.VERTICAL);

        recyclerView.addItemDecoration(item);

        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setHasFixedSize(true);

        recyclerAdapter = new TwitterAdapter(m_ViewModel.getData());
        recyclerView.setAdapter(recyclerAdapter);
    }
}
