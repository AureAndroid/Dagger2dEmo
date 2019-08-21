package com.condinginflow.dagger2example.car;

import javax.inject.Inject;

public class Wheels {
    //we don't own this class so
    // we can't annotate it with @Inject

    private Rims rims;
    private Tires tires;

    @Inject
    public Wheels(Rims rims,Tires tires){
        this.rims=rims;
        this.tires=tires;
    }
}
