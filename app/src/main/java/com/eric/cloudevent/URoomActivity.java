package com.eric.cloudevent;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class URoomActivity extends AppCompatActivity {

    private static final String TAG = URoomActivity.class.getSimpleName();
    String edrk;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_uroom);
        Intent intent = getIntent();
        edrk = intent.getStringExtra("ROOM_KEY");
        Log.d(TAG, "onCreate: " + edrk);
    }
}
