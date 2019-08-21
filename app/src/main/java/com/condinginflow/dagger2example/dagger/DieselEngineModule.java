package com.condinginflow.dagger2example.dagger;

import com.condinginflow.dagger2example.car.DieselEngine;
import com.condinginflow.dagger2example.car.Engine;

import dagger.Binds;
import dagger.Module;
import dagger.Provides;

@Module
public  class DieselEngineModule {
    private int horsePower;

    public DieselEngineModule(int horsePower) {
        this.horsePower = horsePower;
    }

    @Provides
    int provideHorsePower(){
        return horsePower;
    }

    @Provides
    Engine provideEngine(DieselEngine engine){
        return engine;
    }


//    @Binds
//    abstract Engine bindEngine(DieselEngine engine);

//    @Provides
//    Engine provideEngine(PetrolEngine engine){
//        return engine;
//    }
}
