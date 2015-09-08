package com.example.ennis.myapplication.mNotification;

import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.support.v4.app.NotificationCompat;
import android.support.v4.app.NotificationCompat.WearableExtender;
import android.app.Notification.Action;

import com.example.ennis.myapplication.R;

/**
 * Created by Dennis on 2015/4/14.
 */
public class mNotification {


    /**
     *建置notification的卡片
     * @param context  context的屬性名稱
     * @param ContentTitle  設定notification的title
     * @param ContentText  設定notification的內容
     * @param pendingViewIntent  notification內容裡面button標題和內容
     * @param notificationId  這是每個notification卡片的順序編號
     */
    public mNotification(Context context,
                         String ContentTitle,
                         String ContentText,
                         PendingIntent pendingViewIntent,
                         int notificationId
                         ){

        NotificationManager notificationManager = null;


       PendingIntent wearable_pending_intent=null;

        NotificationCompat.Action Action = new NotificationCompat.Action.Builder(R.drawable.ic_launcher,ContentTitle,wearable_pending_intent).build();
        NotificationCompat.Builder Builder= new NotificationCompat.Builder(context);
        NotificationCompat.Builder extend = Builder.setContentTitle(ContentTitle)
                .setContentText(ContentText)
                .setSmallIcon(R.drawable.ic_launcher)
                .setOngoing(true)
                .addAction(R.drawable.ic_launcher, "open", pendingViewIntent)
                .extend(new NotificationCompat.WearableExtender().setContentAction(0).setHintHideIcon(true))
                .extend(new NotificationCompat.WearableExtender().addAction(Action));


        notificationManager = (NotificationManager) context.getSystemService(context.NOTIFICATION_SERVICE);
        notificationManager.notify(notificationId, Builder.build());

    }
}
