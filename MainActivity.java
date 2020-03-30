package com.example.notification_basicapp;

import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.NotificationCompat;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void sendNotification(View view) {

        //Get an instance of NotificationManager//
        NotificationCompat.Builder mBuilder =
                new NotificationCompat.Builder(this);

        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.tmu.ac.in"));
        PendingIntent pendingIntent = PendingIntent.getActivity(this, 0, intent, 0);
        mBuilder.setContentIntent(pendingIntent);

        mBuilder.setSmallIcon(R.drawable.notify);
                        mBuilder.setContentTitle("My notification");
                        mBuilder.setContentText("Hello World!");

        // Gets an instance of the NotificationManager service//
        NotificationManager mNotificationManager = (NotificationManager) getSystemService(Context.NOTIFICATION_SERVICE);
                mNotificationManager.notify(001, mBuilder.build());
    }
}