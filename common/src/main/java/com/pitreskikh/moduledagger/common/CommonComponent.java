package com.pitreskikh.moduledagger.common;

import com.pitreskikh.moduledagger.common.scope.CommonScope;

import dagger.Component;

@Component(modules = {CommonModule.class})
@CommonScope
public interface CommonComponent {


    void inject(CommonObject commonObject);
}
