package com.example.assign;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView textView;
    String tag = "activityLifeCycle";

    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView = findViewById(R.id.textView);
        textView.setText("inside onCreate() now");
        Log.d(tag,"inside onCreate() now");

        button = findViewById(R.id.button);
        button.setOnClickListener(
                view ->{
                    Fragment fragment =  new fragment();
                    FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
                    FragmentTransaction replace = transaction.replace(R.id.flayout,fragment);
                    transaction.addToBackStack(null);
                    transaction.commit();
                }
        );
    }

    @Override
    protected void onStart() {
        super.onStart();
        textView = findViewById(R.id.textView);
        textView.setText("inside onStart() now");
        Log.d(tag,"inside onStart() now");



    }

    @Override
    protected void onResume() {
        super.onResume();
        textView = findViewById(R.id.textView);
        textView.setText("inside onResume() now");
        Log.d(tag,"inside onResume() now");
    }

    @Override
    protected void onPause() {
        super.onPause();
        textView = findViewById(R.id.textView);
        textView.setText("inside onPause() now");
        Log.d(tag,"inside onPause() now");
    }

    @Override
    protected void onStop() {
        super.onStop();
        textView = findViewById(R.id.textView);
        textView.setText("inside onStop() now");
        Log.d(tag,"inside onStop() now");
    }

    @Override
    protected void onRestart(){
        super.onRestart();
        textView = findViewById(R.id.textView);
        textView.setText("inside onRestart() now");
        Log.d(tag,"inside onRestart() now");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        textView = findViewById(R.id.textView);
        textView.setText("inside onDestroy() now");
        Log.d(tag,"inside onDestroy() now");
    }



}