package com.cyanswim.cyanacademy;

import android.app.Application;

import com.firebase.client.Firebase;

/**
 * Created by MoreFamily on 4/24/2016.
 */
public class ToDoApplication extends Application{
    @Override
    public void onCreate() {
        super.onCreate();

        Firebase.setAndroidContext(this);
    }
}
