package com.outerspace.daggerscone.component;

import com.outerspace.daggerscone.MainActivity;
import com.outerspace.daggerscone.model.Person;
import com.outerspace.daggerscone.module.SconeModule;

import javax.inject.Named;
import javax.inject.Singleton;

import dagger.Component;

// @Singleton
@Component(modules = {SconeModule.class} )
public interface SconeComponent {

    public Person providePerson();

    public void inject(MainActivity main);

}
