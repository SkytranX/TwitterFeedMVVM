package com.example.twitterfeedmvvm.repository;

import com.example.twitterfeedmvvm.model.Twitter;

import java.util.ArrayList;
import java.util.List;

public class Repository {

    private Repository() {
    }

    static class InstanceHolder {
        static  Repository INSTANCE = new Repository();
    }
    public static Repository getInstance() {
        return InstanceHolder.INSTANCE;
    }

    public List<Twitter> getData() {
       List<Twitter> twitter = new ArrayList<>();
       twitter.add(new Twitter("Maddy Burnches","@maddybunch", "Hellow", "", "00:00AM" ));
        twitter.add(new Twitter("Bart Simpson","@bmimpson" ,"KAWABUNGA DUDE","", "00:00PM"));
        twitter.add(new Twitter("Donnie Phatso","@donniep" ,"WHERE IS MY MONEY?","", "00:00PM"));
        twitter.add(new Twitter("Hugh Jass","@hughj" ,"You got the...?","", "00:00PM"));
        twitter.add(new Twitter("Gon 'A' Tinkle","@gtinkle" ,"Put down you glass?","", "00:00PM"));
        twitter.add(new Twitter("Sum Ting Wong","@sumti" ,"Did you order take-out>","", "00:00PM"));
        twitter.add(new Twitter("Agot Chu","@agotc" ,"Do you need some help?","", "00:00PM"));
        twitter.add(new Twitter("Jaques Strap","@jstrap" ,"Bro did you borrow my gear?","", "00:00PM"));
        twitter.add(new Twitter("Ivanna Tinkle","@itinkle" ,"who invented the toilet ","", "00:00PM"));
        twitter.add(new Twitter("Pac Man","@pcman" ,"WOKA* WOKA* WOKU*","", "00:00PM"));
        twitter.add(new Twitter("Woking Disway","@wokdis" ,"Making my way Uptown","", "00:00PM"));
        twitter.add(new Twitter("Thai Tanic","@t_tanic" ,"check out this new place Iceberger","", "00:00AM"));
        return twitter;
    }
}
