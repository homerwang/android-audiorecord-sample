package com.example.audiorecord;

import android.app.Activity;
import android.content.Context;
import android.content.pm.PackageManager;

import androidx.core.app.ActivityCompat;

public class RecordPermission {


    static final int PERMISSIONS_REQUEST_CODE_RECORD_AUDIO = 2024;

    static final String[] RECORDING_PERMISSIONS = {
            android.Manifest.permission.RECORD_AUDIO
    };

    public static boolean checkRecordingPermission(Activity acti) {

        boolean hasPermissions = true;
        for (String permission : RECORDING_PERMISSIONS) {
            if (ActivityCompat.checkSelfPermission(acti.getApplicationContext(), permission) == PackageManager.PERMISSION_DENIED) {
                hasPermissions = false;
            }
        }

        return hasPermissions;
    }

}
