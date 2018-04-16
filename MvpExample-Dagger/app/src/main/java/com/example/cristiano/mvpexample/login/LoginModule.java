package com.example.cristiano.mvpexample.login;

import dagger.Module;
import dagger.Provides;

/**
 * Created by cristiano on 15/04/18.
 */

@Module
public class LoginModule {

    @Provides
    public LoginActivityMVP.Presenter providerLoginActivityPresenter(LoginActivityMVP.Model model){
        return new LoginActivityPresenter(model);
    }

    @Provides
    public LoginActivityMVP.Model providerLoginActivityModel(LoginRepository repository){
        return new LoginModel(repository);
    }

    @Provides
    public LoginRepository providerLoginRepository(){
        return new MemoryRepository();
    }
}
