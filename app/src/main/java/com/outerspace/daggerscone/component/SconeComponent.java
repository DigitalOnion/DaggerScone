package com.outerspace.daggerscone.component;

import com.outerspace.daggerscone.MainActivity;
import com.outerspace.daggerscone.model.Person;
import com.outerspace.daggerscone.module.SconeModule;

import dagger.Component;

@Component(modules = {SconeModule.class} )
public interface SconeComponent {

    public Person providePerson();

    public void inject(MainActivity main);

}
