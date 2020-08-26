package com.aashiq.notify.Notification;

import android.util.Log;

import com.google.firebase.iid.FirebaseInstanceId;
import com.google.firebase.iid.FirebaseInstanceIdService;
import com.google.firebase.messaging.FirebaseMessaging;


public class MyFirebaseInstanceIDService extends FirebaseInstanceIdService {

    private static final String TAG = "MyFirebaseIIDService";

    @Override
    public void onTokenRefresh() {


        String refreshedToken = FirebaseInstanceId.getInstance().getToken();
        Log.d(TAG, "Refreshed token: " + refreshedToken);

        FirebaseMessaging.getInstance().subscribeToTopic("all");


    }



/*

    private void storeToken(String token) {
       // SharedPrefManager.getInstance(getApplicationContext()).saveDeviceToken(token);
        //SharedPrefManager.getInstance(getApplicationContext()).saveDeviceToken(token);
        FirebaseDatabase.getInstance().getReference().child("TOKEN").push().setValue(token);


    }*/
}