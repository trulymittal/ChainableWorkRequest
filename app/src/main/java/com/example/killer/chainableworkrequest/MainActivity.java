package com.example.killer.chainableworkrequest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import androidx.work.OneTimeWorkRequest;
import androidx.work.WorkManager;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        OneTimeWorkRequest oneTimeWorkRequestA = new OneTimeWorkRequest.Builder(WorkA.class).build();
        OneTimeWorkRequest oneTimeWorkRequestB = new OneTimeWorkRequest.Builder(WorkB.class).build();
        OneTimeWorkRequest oneTimeWorkRequestC = new OneTimeWorkRequest.Builder(WorkC.class).build();


//        Simple Work Requests
        
//        WorkManager.getInstance()
//                .beginWith(oneTimeWorkRequestA)
//                .then(oneTimeWorkRequestB)
//                .then(oneTimeWorkRequestC)
//                .enqueue();

//        Parallel chainable Work request
        WorkManager.getInstance()
                .beginWith(oneTimeWorkRequestA, oneTimeWorkRequestB)
                .then(oneTimeWorkRequestC)
                .enqueue();


    }
}
