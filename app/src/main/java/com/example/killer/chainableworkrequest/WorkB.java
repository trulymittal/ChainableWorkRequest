package com.example.killer.chainableworkrequest;

import android.support.annotation.NonNull;
import android.util.Log;

import androidx.work.Worker;

public class WorkB extends Worker {

    private static final String TAG = "WorkB";

    @NonNull
    @Override
    public Result doWork() {

        Log.e(TAG, "doWork: Work B started ");

        try {
            Thread.sleep(5000);
            Log.e(TAG, "doWork: work finshed");
            return Result.SUCCESS;
        } catch (InterruptedException e) {
            e.printStackTrace();
            return Result.FAILURE;
        }


    }
}
