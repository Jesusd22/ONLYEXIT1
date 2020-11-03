package com.example.onlyexit;


import android.app.Application;

import com.parse.Parse;

public class ParseApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        // Register your parse models
        //ParseObject.registerSubclass(Items.class);

        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("8huB3GAmJBhs2sQNUo05UI74L6BHnzmLsJAkXPSS")
                .clientKey("3xK5kd65kufJwlN3wqlW3BCYsiKLFLLdcPHj1EIM")
                .server("https://parseapi.back4app.com")
                .build()
        );
    }
}

