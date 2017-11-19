package com.pitreskikh.moduledagger.common;


public class Common {

    private static CommonComponent commonComponent;

    public static CommonComponent getCommonComponent() {
        return commonComponent;
    }

    public static void setCommonComponent(CommonComponent commonComponent) {
        Common.commonComponent = commonComponent;
    }
}
