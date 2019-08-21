package com.condinginflow.dagger2example.dagger;

import com.condinginflow.dagger2example.MainActivity;
import com.condinginflow.dagger2example.car.Car;


import javax.inject.Named;

import dagger.BindsInstance;
import dagger.Component;
import dagger.Subcomponent;

@PerActivity
//@Component (dependencies=AppComponent.class, modules={WheelsModule.class, PetrolEngineModule.class})
//means this component is a subcomponent of
//appcomponent
@Subcomponent( modules={WheelsModule.class, DieselEngineModule.class})
public interface ActivityComponent {

    Car getCar();

    void inject(MainActivity mainActivity);

    //put int comment
    //because DieselEngineModule has
    // the right constructor

    //we implements CarComponent
    // because we need overriding the builder
    //definition
//    @Component.Builder
//    interface Builder{
//
//        @BindsInstance
//        Builder horsePower(@Named("horse power") int horsePower);
//
//        @BindsInstance
//        Builder engineCapacity(@Named("engine capacity")int engineCapacity);
//
//        Builder appComponent(AppComponent component);
//
//        ActivityComponent build();
//    }

}
