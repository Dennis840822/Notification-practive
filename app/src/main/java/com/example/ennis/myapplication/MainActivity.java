package com.example.ennis.myapplication;

import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.os.Binder;
import android.os.Build;
import android.sax.StartElementListener;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.support.v4.app.NotificationCompat;
import android.support.v4.app.NotificationManagerCompat;
import android.content.Intent;

import android.support.v4.app.NotificationCompat.WearableExtender;

import com.example.ennis.myapplication.mNotification.mNotification;

import java.util.FormatFlagsConversionMismatchException;


public class MainActivity extends ActionBarActivity {

    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button=(Button)findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //Log.wtf("notification","notification");


                String aTitle="標題";
                PendingIntent pendingViewIntent=null;
                int notificationId;
                Intent notifyIntent=null;

                mNotification notification = new mNotification(
                        getApplicationContext(), "標題","內容",pendingViewIntent,1

                );


            }
        });
    };

//    private void notification1() {
//
//        Intent notifyIntent = new Intent(MainActivity.this, MainActivity.class);
//        PendingIntent pendingViewIntent = PendingIntent.getActivity(MainActivity.this, 0, notifyIntent, 0);
//
//
//        //Intent notifyIntent =null;
//       // PendingIntent.getActivity(MainActivity.this, 0, notifyIntent, PendingIntent.FLAG_UPDATE_CURRENT);
//
//        NotificationManager notificationManager = null;
//        //
//        PendingIntent wearable_pendingn_intet=null;
//        NotificationCompat.Action Action = new NotificationCompat.Action.Builder(R.drawable.ic_launcher,getString(R.string.wearable_action),wearable_pendingn_intet).build();
//        NotificationCompat.Builder Builder= new NotificationCompat.Builder(getApplicationContext());
//        NotificationCompat.Builder extend = Builder.setContentTitle("notification")
//                .setContentText("notification")
//                .setSmallIcon(R.drawable.ic_launcher)
//                .setOngoing(true)
//                .addAction(R.drawable.ic_launcher, "open", pendingViewIntent)
//                .extend(new NotificationCompat.WearableExtender().setContentAction(0).setHintHideIcon(true))
//                .extend(new WearableExtender().addAction(Action));
//
//
//        notificationManager = (NotificationManager) getSystemService(NOTIFICATION_SERVICE);
//        notificationManager.notify(notificationId, Builder.build());
//        notifyIntent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
//
//
//    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}


