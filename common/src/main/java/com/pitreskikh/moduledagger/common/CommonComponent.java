package com.pitreskikh.moduledagger.common;

import dagger.Subcomponent;

@Subcomponent
@ModuleScope
public interface CommonComponent {
    void inject(CommonObject commonObject);
}
