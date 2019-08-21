package com.condinginflow.dagger2example.dagger;


import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import javax.inject.Scope;

import static java.lang.annotation.RetentionPolicy.RUNTIME;


//we learn how to use different scope
//by creating your own scope annotation
@Scope
@Documented
@Retention(RUNTIME)
public @interface PerActivity {
}
