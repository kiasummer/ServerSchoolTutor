package com.nn.kovaleva.irina.serverschooltutor;

import android.app.Notification;
import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.support.annotation.Nullable;
import android.support.v4.app.NotificationCompat;
import android.util.Log;
import android.widget.Toast;

import com.nn.kovaleva.irina.serverschooltutor.server.SchoolTutorHTTPServer;

public class ForegroundService extends Service {
    public static final String TAG = "ForegroundService";
    public static boolean IS_SERVICE_RUNNING = false;

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        if (intent.getAction().equals(Constants.ACTION.STARTFOREGROUND_ACTION)){
            Log.d(TAG, "onStartCommand: ");
            SchoolTutorHTTPServer.Instance().setContext(this);
            SchoolTutorHTTPServer.Instance().serverStart();
            Toast.makeText(this, "Service started", Toast.LENGTH_SHORT).show();
        }

        Notification notification = new Notification.Builder(this)
                .setContentTitle("Server")
                .setContentText("service started")
                .setSmallIcon(R.mipmap.ic_launcher).build();
        startForeground(Constants.NOTIFICATION_ID.FOREGROUND_SERVICE, notification);

        return START_STICKY;
    }

    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }
}
