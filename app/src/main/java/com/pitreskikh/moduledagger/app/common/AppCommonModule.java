package com.pitreskikh.moduledagger.app.common;

import com.pitreskikh.moduledagger.common.CommonText;
import com.pitreskikh.moduledagger.common.scope.CommonScope;

import dagger.Module;
import dagger.Provides;

@Module
public class AppCommonModule {

    @CommonScope
    @Provides
    CommonText getCommonText() {

        return new CommonText("Text in common text is provided by Application");
    }
}
