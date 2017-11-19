package com.pitreskikh.moduledagger.common;

import com.pitreskikh.moduledagger.common.scope.CommonScope;

import dagger.Subcomponent;

@Subcomponent
@CommonScope
public interface CommonComponent {
    void inject(CommonObject commonObject);
}
