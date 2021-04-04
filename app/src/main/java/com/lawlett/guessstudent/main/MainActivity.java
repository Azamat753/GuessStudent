package com.lawlett.guessstudent.main;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.lawlett.guessstudent.R;
import com.lawlett.guessstudent.fragments.StartFragment;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        openStartFragment();
    }

    private void openStartFragment() {
        getSupportFragmentManager().beginTransaction().add(R.id.container_fragment, new StartFragment()).commit();
    }
}