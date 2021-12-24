package com.system.art;

import com.system.art.po.Store;
import com.system.art.po.Store2;
import org.springframework.boot.context.event.ApplicationStartedEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

@Component
public class AppStart implements ApplicationListener<ApplicationStartedEvent> {
    @Override
    public void onApplicationEvent(ApplicationStartedEvent event) {
        initStore();
    }

    /**
     * 初始化全局变量 Store
     */
    private void initStore(){
        Store.getInstance();
    }
}
