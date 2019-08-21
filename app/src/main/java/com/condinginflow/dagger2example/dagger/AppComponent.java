package com.condinginflow.dagger2example.dagger;

import com.condinginflow.dagger2example.car.Driver;

import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component(modules = DriverModule.class)
//@Component
public interface AppComponent {
    //we don't have to expose drive rinto appcomponent
    //Activity Component automatically
    // can able to access all of them
    ActivityComponent getActivityComponent(DieselEngineModule disielEngineModule);

    //alowwing activity component
    //to use it
    //that's a provision method
    //Driver getDriver();
}
