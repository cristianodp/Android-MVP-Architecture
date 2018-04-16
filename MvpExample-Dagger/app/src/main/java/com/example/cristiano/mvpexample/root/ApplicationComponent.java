package com.example.cristiano.mvpexample.root;

import com.example.cristiano.mvpexample.login.LoginActivity;
import com.example.cristiano.mvpexample.MainActivity;
import com.example.cristiano.mvpexample.login.LoginModule;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by cristiano on 15/04/18.
 */
@Singleton
@Component(modules = {ApplicationModule.class, LoginModule.class})
public interface ApplicationComponent {

    void inject (MainActivity target);
    void inject (LoginActivity target);

}
