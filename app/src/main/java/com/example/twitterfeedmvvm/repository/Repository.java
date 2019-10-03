package com.example.twitterfeedmvvm.repository;

import com.example.twitterfeedmvvm.model.Twitter;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Random;

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
        twitter.add(new Twitter("Bart Simpson","@bmimpson" ,"KAWABUNGA DUDE","", getRandomDate()));
        twitter.add(new Twitter("Donnie Phatso","@donniep" ,"WHERE IS MY MONEY?","", getRandomDate()));
        twitter.add(new Twitter("Hugh Jass","@hughj" ,"You got the...?","", getRandomDate()));
        twitter.add(new Twitter("Gon 'A' Tinkle","@gtinkle" ,"Put down you glass?","", getRandomDate()));
        twitter.add(new Twitter("Sum Ting Wong","@sumti" ,"Did you order take-out>","", getRandomDate()));
        twitter.add(new Twitter("Agot Chu","@agotc" ,"Do you need some help?","", getRandomDate()));
        twitter.add(new Twitter("Jaques Strap","@jstrap" ,"Bro did you borrow my gear?","", getRandomDate()));
        twitter.add(new Twitter("Ivanna Tinkle","@itinkle" ,"who invented the toilet ","", getRandomDate()));
        twitter.add(new Twitter("Pac Man","@pcman" ,"WOKA* WOKA* WOKU*","", getRandomDate()));
        twitter.add(new Twitter("Woking Disway","@wokdis" ,"Making my way Uptown","", getRandomDate()));
        twitter.add(new Twitter("Thai Tanic","@t_tanic" ,"check out this new place Iceberger","", getRandomDate()));
        return twitter;
    }
    private static Date getRandomDate() {
        int day = new Random().nextInt((31 - 1) + 1) + 1;
        int month = new Random().nextInt((12 - 1) + 1) + 1;
        int year = new Random().nextInt((2019 - 1900) + 1) + 1900;
        Date date = new Date(System.currentTimeMillis());
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy", Locale.US);
        try {
            date = sdf.parse(day + "/" + month + "/" + year);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return date;
    }
}
