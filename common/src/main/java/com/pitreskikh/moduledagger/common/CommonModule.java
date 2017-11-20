package com.pitreskikh.moduledagger.common;

import javax.inject.Named;
import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module
public class CommonModule {

    @Singleton
    @Provides
    CommonText getCommonText(@Named("name") String commonText) {
        return new CommonText(commonText);
    }
}
