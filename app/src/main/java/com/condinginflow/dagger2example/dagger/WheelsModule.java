package com.condinginflow.dagger2example.dagger;


import com.condinginflow.dagger2example.car.Rims;
import com.condinginflow.dagger2example.car.Tires;
import com.condinginflow.dagger2example.car.Wheels;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

//deleting abstract keword permit
//to pass the argument wheelsModule
// into proxyProvideRims method
// in a DaggerCarComponent
@Module
public  abstract class WheelsModule {

    @Provides
    static Rims provideRims(){
        return new Rims();
    }

    @Provides
    static Tires provideTires(){
        Tires tires = new Tires();
        tires.inflate();
        return tires;
    }

    @Provides
    static Wheels provideWheels(Rims rims, Tires tires){
        return new Wheels(rims,tires);
    }
}
