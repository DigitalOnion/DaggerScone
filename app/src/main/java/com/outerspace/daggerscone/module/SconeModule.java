package com.outerspace.daggerscone.module;

import com.outerspace.daggerscone.model.Person;

import javax.inject.Named;
import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module
public class SconeModule {

    @Provides
    // @Singleton
    public Person providePerson() {
        Person person = new Person();

        return person;
    }
}
