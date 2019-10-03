package com.example.twitterfeedmvvm.model;

public class Twitter {
    private String user_Name;
    private String user_Id;
    private String user_Message;
    private String user_Image;

    public  Twitter(String user_Name, String user_Id, String user_Message, String user_Image, String user_Time){
        this.user_Name = user_Name;
        this.user_Id = user_Id;
        this.user_Message = user_Message;
        this.user_Image = user_Image;
        this.user_Time = user_Time;
    }


    public String getUser_Time() {
        return user_Time;
    }


    private String user_Time;


    public String getUser_Name() {
        return user_Name;
    }

    public void setUser_Name(String user_Name) {
        this.user_Name = user_Name;
    }

    public String getUser_Id() {
        return user_Id;
    }

    public void setUser_Id(String user_Id) {
        this.user_Id = user_Id;
    }

    public String getUser_Message() {
        return user_Message;
    }

    public void setUser_Message(String user_Message) {
        this.user_Message = user_Message;
    }

    public String getUser_Image() {
        return user_Image;
    }

    public void setUser_Image(String user_Image) {
        this.user_Image = user_Image;
    }


}
