package com.kolawoletech.qe2.bugseefinal2;

import android.app.Application;

import com.bugsee.library.Bugsee;

/**
 * Created by qe2 on 2017/07/01.
 */

public class GlobalApplication extends Application {
    public String helloGlobal = "Hello From GlobalApplication";

    private static GlobalApplication singleton;

    public static GlobalApplication getInstance() {
        return singleton;
    }

    @Override
    public void onCreate() {
        super.onCreate();
        singleton = this;

        Bugsee.launch(this, "80d3837c-1d38-47d7-84ea-c58ad573ad22");
    }
}
