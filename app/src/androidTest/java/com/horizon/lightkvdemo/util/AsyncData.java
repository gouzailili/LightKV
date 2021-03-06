package com.horizon.lightkvdemo.util;


import com.horizon.lightkv.AsyncKV;
import com.horizon.lightkv.LightKV;
import com.horizon.lightkvdemo.config.GlobalConfig;

public class AsyncData {
    private final AsyncKV DATA;

    private AsyncData() {
        DATA = new LightKV.Builder(GlobalConfig.INSTANCE.getAppContext(), "async_data")
                .keys(Keys.class)
                .logger(AppLogger.INSTANCE)
                .async();
    }

    public AsyncKV data() {
        return DATA;
    }

    public static AsyncData newInstance(){
        return new AsyncData();
    }
}
