package com.abdipor.mvvmdagger.view.annotation;

import androidx.lifecycle.ViewModel;

import dagger.MapKey;

@MapKey
public @interface MapKeyUser {
    Class<? extends ViewModel> getMapKeyU();
}
