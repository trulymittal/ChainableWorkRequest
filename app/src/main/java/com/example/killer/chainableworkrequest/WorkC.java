package com.example.killer.chainableworkrequest;

import android.support.annotation.NonNull;
import android.util.Log;

import androidx.work.Worker;

public class WorkC extends Worker {


    private static final String TAG = "WorkC";

    @NonNull
    @Override
    public Result doWork() {
        Log.e(TAG, "doWork: Work C finished");
        return Result.SUCCESS;
    }
}
