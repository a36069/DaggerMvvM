package com.abdipor.mvvmdagger.view.ui;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;

import android.os.Bundle;
import android.util.Log;

import com.abdipor.mvvmdagger.R;
import com.abdipor.mvvmdagger.service.model.ModelUser;
import com.abdipor.mvvmdagger.view.ComponentUser;

import com.abdipor.mvvmdagger.view.DaggerComponentUser;
import com.abdipor.mvvmdagger.viewmodel.ViewModelUser;
import com.abdipor.mvvmdagger.viewmodel.ViewModelUserFactory;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {
    @Inject
    ViewModelUserFactory factory;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ComponentUser componentUser = DaggerComponentUser.builder().getUser("ali").getPass("1234").build();
        componentUser.injectFilde(this);
        ViewModelUser viewModelUser = new ViewModelProvider(this,factory).get(ViewModelUser.class);

        viewModelUser.getModelUserMutableLiveData().observe(this, userModel -> {
            Log.d("rrr", "onCreate: " + userModel.getName());
        });

    }
}