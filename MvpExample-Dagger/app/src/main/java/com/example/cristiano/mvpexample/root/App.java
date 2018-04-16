package com.example.cristiano.mvpexample.root;

import android.app.Application;

import com.example.cristiano.mvpexample.login.LoginModule;


/**
 * Created by cristiano on 15/04/18.
 */

public class App extends Application{

    private ApplicationComponent component;

    @Override
    public void onCreate() {
        super.onCreate();

        component = DaggerApplicationComponent.builder()
                .applicationModule(new ApplicationModule(this))
                .loginModule(new LoginModule())
                .build();
    }

    public ApplicationComponent getComponent(){
        return component;
    }
}
