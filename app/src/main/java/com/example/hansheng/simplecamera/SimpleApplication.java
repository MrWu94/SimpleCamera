package com.example.hansheng.simplecamera;

import android.app.Application;

import us.pinguo.edit.sdk.PGEditImageLoader;
import us.pinguo.edit.sdk.base.PGEditSDK;

/**
 * Created by hansheng on 2015/12/30.
 */
public class SimpleApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        PGEditImageLoader.initImageLoader(this);
        PGEditSDK.instance().initSDK(this);
    }
}
