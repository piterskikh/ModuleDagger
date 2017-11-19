package com.pitreskikh.moduledagger.app;

import javax.inject.Singleton;

import dagger.Component;

@Component(modules = {AppModule.class})
@Singleton
public interface AppComponent {

    void inject(MainActivity mainActivity);
}
