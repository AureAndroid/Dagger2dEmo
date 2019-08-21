package com.condinginflow.dagger2example;

import android.app.Application;

import com.condinginflow.dagger2example.dagger.ActivityComponent;
import com.condinginflow.dagger2example.dagger.AppComponent;
import com.condinginflow.dagger2example.dagger.DaggerAppComponent;


public class ExampleApp extends Application {
    private AppComponent component;

    @Override
    public void onCreate(){
        super.onCreate();

        component= DaggerAppComponent.create();

//        component = DaggerCarComponent.builder()
//                .horsePower(120)
//                .engineCapacity(1400)
//                .build();
               }
    public AppComponent getAppComponent(){
        return component;
    }
}
