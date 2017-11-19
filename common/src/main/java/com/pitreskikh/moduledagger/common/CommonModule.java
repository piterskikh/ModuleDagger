package com.pitreskikh.moduledagger.common;

import com.pitreskikh.moduledagger.common.scope.CommonScope;

import dagger.Module;
import dagger.Provides;

@Module
public class CommonModule {

    @CommonScope
    @Provides
    public CommonText commonText() {
        return null;
    }


}
