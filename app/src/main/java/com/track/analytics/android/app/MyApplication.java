package com.track.analytics.android.app;

import android.app.Application;

import com.track.analytics.android.sdk.TrackAPI;

/**
 */
public class MyApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();

        initSensorsDataAPI(this);
    }

    /**
     * 初始化埋点 SDK
     *
     * @param application Application
     */
    private void initSensorsDataAPI(Application application) {
        TrackAPI.init(application);
    }
}
