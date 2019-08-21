package com.condinginflow.dagger2example.dagger;

import com.condinginflow.dagger2example.car.Engine;
import com.condinginflow.dagger2example.car.PetrolEngine;

import dagger.Binds;
import dagger.Module;

@Module
public abstract class PetrolEngineModule {

    //This methods of implementations
    //is more efficient and pratic
    @Binds
    abstract Engine bindEngine(PetrolEngine engine);

//    @Provides
//    Engine provideEngine(PetrolEngine engine){
//        return engine;
//    }
}
