package com.condinginflow.dagger2example.dagger;


import com.condinginflow.dagger2example.car.Driver;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module
public abstract class DriverModule {
    @Provides
    @Singleton
    static Driver provideDriver(){
        return new Driver();
    }
}
