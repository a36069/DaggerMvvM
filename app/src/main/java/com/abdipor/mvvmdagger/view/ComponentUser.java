package com.abdipor.mvvmdagger.view;

import com.abdipor.mvvmdagger.service.model.ModelUser;
import com.abdipor.mvvmdagger.view.Module.ViewModelUserModule;
import com.abdipor.mvvmdagger.view.annotation.Pass;
import com.abdipor.mvvmdagger.view.annotation.User;
import com.abdipor.mvvmdagger.view.ui.MainActivity;
import com.abdipor.mvvmdagger.viewmodel.ViewModelUser;

import dagger.BindsInstance;
import dagger.Component;

@Component(modules = ViewModelUserModule.class)
public interface ComponentUser {



    void injectFilde(MainActivity mainActivity);

    @Component.Builder
    interface Builder {

        @BindsInstance
        Builder getUser(@User String user);

        @BindsInstance
        Builder getPass(@Pass String pass);
//        @BindsInstance
//        Builder setUserModel(ModelUser model);

        ComponentUser build();
    }
}
