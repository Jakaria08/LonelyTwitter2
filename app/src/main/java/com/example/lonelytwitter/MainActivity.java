package com.example.lonelytwitter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Tweet tweet = new Tweet("TEST........");
        //Log.d("TAG", tweet.getMessage());
        NormalTweet normalTweet = new NormalTweet("I am a normal tweet");
        ImportantTweet importantTweet = new ImportantTweet("I am an important tweet");

        ArrayList<Tweet> tweetList = new ArrayList<Tweet>();
        tweetList.add(normalTweet);
        tweetList.add(importantTweet);
    }
}