package com.example.student.march10th;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Toast toast;
    final String TAG = "lifecycle";



    @Override
    protected void onStart() {
        super.onStart();
        toast.makeText(this, "onStart()", Toast.LENGTH_LONG).show();
        Log.i(TAG, "onStart");
    }

    @Override
    protected void onPause() {
        super.onPause();
        toast.makeText(this, "onPause()", Toast.LENGTH_LONG).show();
        Log.i(TAG, "onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        toast.makeText(this, "onStop()", Toast.LENGTH_LONG).show();
        Log.i(TAG, "onStop");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        toast.makeText(this, "onRestart()", Toast.LENGTH_LONG).show();
        Log.i(TAG, "onRestart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        toast.makeText(this, "onResume()", Toast.LENGTH_LONG).show();
        Log.i(TAG, "onResume");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        toast.makeText(this, "onDestroy()", Toast.LENGTH_LONG).show();
        Log.i(TAG, "onDestroy");
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        toast.makeText(this, "onCreate()", Toast.LENGTH_LONG).show();
        Log.i(TAG, "onCreate");



    }
}
