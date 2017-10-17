package com.outerspace.daggerscone.module;

import com.outerspace.daggerscone.model.Person;

import dagger.Module;
import dagger.Provides;

@Module
public class SconeModule {
    @Provides
    public Person providePerson() {
        return new Person();
    }
}
