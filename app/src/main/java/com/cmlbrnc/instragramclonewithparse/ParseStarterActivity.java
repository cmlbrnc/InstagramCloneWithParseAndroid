package com.cmlbrnc.instragramclonewithparse;

import android.app.Application;

import com.parse.Parse;

public class ParseStarterActivity extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        Parse.setLogLevel(Parse.LOG_LEVEL_DEBUG);

      /*  Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("peAD2dzNebnYZAkvjsHSSREGTOW3rQsIynOId8NN")
                .clientKey("bb9NvxsqqBg0VTERsOgVzLdMoHUO7CW3zFjXtcKl")
                .server("https://parseapi.back4app.com/")
                .build()
        );*/

      //AWS Connection :
        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("54da288f053c0b41312be2e381ca1330f73ce39d")
                .clientKey("a55d495d83a012569bcca12d9af53f78153d052d")
                .server("http://34.244.203.151:80/parse")
                .build()
        );
    }
}
