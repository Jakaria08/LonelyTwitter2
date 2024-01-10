package com.example.lonelytwitter;

import java.util.Date;

public class Tweet {
    private Date date;
    private String message;

    public Tweet(Date date, String message){
        this.date = date;
        this.message = message;
    }

    public Tweet(String message) {
        this.message = message;
        this.date = new Date();
    }



    public void setDate(Date date) {
        this.date = date;
    }
    public Date getDate() {
        return date;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }


}
