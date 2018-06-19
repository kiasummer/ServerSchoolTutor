package com.nn.kovaleva.irina.serverschooltutor;

import android.content.Intent;
import android.provider.SyncStateContract;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.nn.kovaleva.irina.serverschooltutor.server.SchoolTutorHTTPServer;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Intent service = new Intent(MainActivity.this, ForegroundService.class);

        if (!ForegroundService.IS_SERVICE_RUNNING){
            service.setAction(Constants.ACTION.STARTFOREGROUND_ACTION);
            ForegroundService.IS_SERVICE_RUNNING = true;
        }
        startService(service);
    }
}
