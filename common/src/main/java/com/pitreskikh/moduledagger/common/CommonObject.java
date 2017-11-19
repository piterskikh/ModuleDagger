package com.pitreskikh.moduledagger.common;


import javax.inject.Inject;

public class CommonObject {

    @Inject
    CommonText commonText;

    public CommonObject() {
        Common.getCommonComponent().inject(this);
    }

    public CommonText getCommonText() {
        return commonText;
    }
}
