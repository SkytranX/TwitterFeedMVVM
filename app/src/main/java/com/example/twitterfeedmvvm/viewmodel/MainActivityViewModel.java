package com.example.twitterfeedmvvm.viewmodel;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;

import com.example.twitterfeedmvvm.model.Twitter;
import com.example.twitterfeedmvvm.repository.Repository;

import java.util.List;

public class MainActivityViewModel extends AndroidViewModel {

    private Repository repo;

    public MainActivityViewModel(@NonNull Application application) {
        super(application);
         repo = Repository.getInstance();
    }

    public List<Twitter> getData(){
        return repo.getData();
    }
}
