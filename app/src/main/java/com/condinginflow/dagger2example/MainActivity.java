package com.condinginflow.dagger2example;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.condinginflow.dagger2example.car.Car;
import com.condinginflow.dagger2example.dagger.ActivityComponent;
import com.condinginflow.dagger2example.dagger.DieselEngineModule;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {

    //Cannot be private and final because we want
    // to change its value
    @Inject
    Car car1,car2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ActivityComponent component = ((ExampleApp) getApplication()).getAppComponent()
                .getActivityComponent(new DieselEngineModule(120));


//        ActivityComponent component = DaggerActivityComponent.builder()
//                .horsePower(120)
//                .engineCapacity(1400)
//                .appComponent(((ExampleApp) getApplication()).getAppComponent())
//                .build();


        component.inject(this);

        //ActivityComponent component = (ActivityComponent) ((ExampleApp) getApplication()).getAppComponent();

//        CarComponent component = DaggerCarComponent.builder()
//                //.dieselEngineModule(new DieselEngineModule(100))
//                .horsePower(150)
//                .engineCapacity(1400)
//                .build();

        //component.inject(this);

        //car = component.getCar();
        car1.drive();
        car2.drive();

//        Block block = new Block();
//        Cylinders cylinders = new Cylinders();
//        SparkPlugs sparkplugs = new Sparkplugs();
//        Tires tires = new Tires();
//        Rimes rims = new Rims();
//
//        Engine engine = new Engine(block, cylinders,sparkplugs);
//        Wheels wheels = new Wheels(tires,rims);
//
//        CarComponent component = DaggerCarComponent.create();
//
//        Car car = component.getCar();
//        car.drive();
    }
}
