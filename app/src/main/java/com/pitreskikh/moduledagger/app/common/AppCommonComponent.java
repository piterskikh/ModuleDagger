package com.pitreskikh.moduledagger.app.common;

import com.pitreskikh.moduledagger.app.chat.AppChatComponent;
import com.pitreskikh.moduledagger.app.chat.AppChatModule;
import com.pitreskikh.moduledagger.common.CommonComponent;
import com.pitreskikh.moduledagger.common.scope.CommonScope;

import dagger.Component;

@Component(modules = {AppCommonModule.class})
@CommonScope
public interface AppCommonComponent extends CommonComponent {
    AppChatComponent plusAppChatComponent(AppChatModule appChatModule);
}
