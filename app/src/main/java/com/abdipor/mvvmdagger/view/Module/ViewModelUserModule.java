package com.abdipor.mvvmdagger.view.Module;

import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;

import com.abdipor.mvvmdagger.view.annotation.MapKeyUser;
import com.abdipor.mvvmdagger.viewmodel.ViewModelUser;
import com.abdipor.mvvmdagger.viewmodel.ViewModelUserFactory;

import dagger.Binds;
import dagger.Module;
import dagger.multibindings.IntoMap;

@Module
public abstract class ViewModelUserModule {

    @Binds
    abstract ViewModelProvider.Factory getFactory(ViewModelUserFactory viewModelUserFactory);

    @Binds
    @IntoMap
    @MapKeyUser(getMapKeyU = ViewModelUser.class)
    abstract ViewModel getViewModel(ViewModelUser viewModelUser);
}
