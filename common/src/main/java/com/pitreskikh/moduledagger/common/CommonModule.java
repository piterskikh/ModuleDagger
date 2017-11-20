package com.pitreskikh.moduledagger.common;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module
public class CommonModule {

    @Singleton
    @Provides
    CommonText getCommonText() {
        return new CommonText("Text in common text is provided by Common module");
    }
}
