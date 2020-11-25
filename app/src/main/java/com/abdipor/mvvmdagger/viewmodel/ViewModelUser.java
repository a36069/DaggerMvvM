package com.abdipor.mvvmdagger.viewmodel;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.abdipor.mvvmdagger.service.model.ModelUser;
import com.abdipor.mvvmdagger.service.repastory.RepositoryUser;
import com.abdipor.mvvmdagger.view.annotation.Pass;
import com.abdipor.mvvmdagger.view.annotation.User;

import javax.inject.Inject;

public class ViewModelUser extends ViewModel {
    public MutableLiveData<ModelUser> modelUserMutableLiveData = new MutableLiveData<>();

@Inject
    public ViewModelUser( RepositoryUser repositoryUser1) {
        modelUserMutableLiveData=repositoryUser1.getModelUserMutableLiveData();
    }


    public MutableLiveData<ModelUser> getModelUserMutableLiveData() {
        return modelUserMutableLiveData;
    }
}
