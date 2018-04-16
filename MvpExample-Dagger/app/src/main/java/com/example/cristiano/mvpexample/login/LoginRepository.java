package com.example.cristiano.mvpexample.login;

/**
 * Created by cristiano on 15/04/18.
 */

public interface LoginRepository {

    User getUser();

    void saveUser(User user);
}
