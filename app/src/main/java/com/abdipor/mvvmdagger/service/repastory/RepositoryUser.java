package com.abdipor.mvvmdagger.service.repastory;

import androidx.lifecycle.MutableLiveData;

import com.abdipor.mvvmdagger.service.model.ModelUser;
import com.abdipor.mvvmdagger.view.annotation.Pass;
import com.abdipor.mvvmdagger.view.annotation.User;

import javax.inject.Inject;

public class RepositoryUser {
    MutableLiveData<ModelUser> modelUserMutableLiveData=new MutableLiveData<>();
    private ModelUser modelUser;

    @Inject
    public RepositoryUser(ModelUser modelUser){
       this.modelUser=modelUser;
    }


    public MutableLiveData<ModelUser> getModelUserMutableLiveData() {
        modelUserMutableLiveData.setValue(modelUser);
        return modelUserMutableLiveData;
    }
}
