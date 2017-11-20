package com.pitreskikh.moduledagger.common;

import dagger.Subcomponent;

@Subcomponent
@ModuleScope
public interface CommonComponent {

    @Subcomponent.Builder
    interface Builder {
        CommonComponent build();
    }

    void inject(CommonObject commonObject);
}
