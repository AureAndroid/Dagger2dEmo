package com.condinginflow.dagger2example.car;

import android.util.Log;

import com.condinginflow.dagger2example.dagger.PerActivity;

import javax.inject.Inject;
//we expect to have a single car
//per activity
@PerActivity
public class Car {
    private static final String TAG = "Car";

    private Driver driver;
    private Engine engine;
    private Wheels wheels;

    @Inject
    Car(Driver driver,Wheels wheels,Engine engine){
        this.driver=driver;
        this.wheels = wheels;
        this.engine = engine;
    }

    @Inject
    public void enableRemote(Remote remote){
        remote.setListener(this);
    }

    public void drive(){
        engine.start();
        Log.d(TAG,driver+ " drives " + this);
    }
}
