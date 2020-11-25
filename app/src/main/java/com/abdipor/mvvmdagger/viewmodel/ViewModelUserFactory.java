package com.abdipor.mvvmdagger.viewmodel;

import androidx.annotation.NonNull;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;

import java.util.Map;

import javax.inject.Inject;
import javax.inject.Provider;

public class ViewModelUserFactory implements ViewModelProvider.Factory {
    private Map<Class<? extends ViewModel>, Provider<ViewModel>> map;

    @Inject
    public ViewModelUserFactory(Map<Class<? extends ViewModel>, Provider<ViewModel>> map) {
        this.map = map;
    }

    @NonNull
    @Override
    public <T extends ViewModel> T create(@NonNull Class<T> modelClass) {
        Provider<? extends ViewModel> creator = map.get(modelClass);
        if (creator == null) {
            for (Map.Entry<Class<? extends ViewModel>, Provider<ViewModel>> mapEn : map.entrySet()) {
                if (modelClass.isAssignableFrom(mapEn.getKey())) {
                    creator = mapEn.getValue();
                }
            }
        }
        if (creator == null) {
            throw new IllegalArgumentException("unknown ViewModel ");
        }
        try {
            return (T) creator.get();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }


    }
}
