package com.pitreskikh.moduledagger.app;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module
public class AppModule {

    @Singleton
    @Provides
    public AppText appText() {
        return null;
    }


}
