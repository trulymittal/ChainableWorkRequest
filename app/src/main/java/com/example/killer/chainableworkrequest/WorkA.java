package com.example.killer.chainableworkrequest;

import android.support.annotation.NonNull;
import android.util.Log;

import androidx.work.Worker;

public class WorkA extends Worker {

    private static final String TAG = "WorkA";

    @NonNull
    @Override
    public Result doWork() {

        Log.e(TAG, "doWork: work finsihed");
        return Result.SUCCESS;
    }
}
