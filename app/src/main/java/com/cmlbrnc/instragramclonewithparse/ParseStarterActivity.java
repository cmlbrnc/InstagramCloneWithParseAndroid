package com.cmlbrnc.instragramclonewithparse;

import android.app.Application;

import com.parse.Parse;

public class ParseStarterActivity extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        Parse.setLogLevel(Parse.LOG_LEVEL_DEBUG);
        
        
      /*  Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("")
                .clientKey("")
                .server("")
                .build()
        );*/

      //AWS Connection :
        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("")
                .clientKey("")
                .server("")
                .build()
        );

    }
}
