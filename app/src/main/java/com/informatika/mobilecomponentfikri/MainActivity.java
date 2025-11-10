package com.informatika.mobilecomponentfikri;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

import com.informatika.mobilecomponentfikri.sharedprefs.SharedPrefsActivity;
import com.informatika.mobilecomponentfikri.recyclerview.RecyclerViewActivity;
import com.informatika.mobilecomponentfikri.roomdb.RoomActivity;
import com.informatika.mobilecomponentfikri.alarm.AlarmActivity;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn1 = findViewById(R.id.btnPrefs);
        Button btn2 = findViewById(R.id.btnRecycler);
        Button btn3 = findViewById(R.id.btnRoom);
        Button btn4 = findViewById(R.id.btnAlarm);

        btn1.setOnClickListener(v -> startActivity(new Intent(this, SharedPrefsActivity.class)));
        btn2.setOnClickListener(v -> startActivity(new Intent(this, RecyclerViewActivity.class)));
        btn3.setOnClickListener(v -> startActivity(new Intent(this, RoomActivity.class)));
        btn4.setOnClickListener(v -> startActivity(new Intent(this, AlarmActivity.class)));
    }
}