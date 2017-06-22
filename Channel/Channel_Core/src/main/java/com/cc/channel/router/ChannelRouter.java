package com.cc.channel.router;

import com.cc.channel.thread.RouterKeyBinder;
import org.springframework.jdbc.datasource.lookup.AbstractRoutingDataSource;

/**
 * @author changcheng
 * @version 2017/6/8
 * @description
 */
public class ChannelRouter extends AbstractRoutingDataSource {

    protected Object determineCurrentLookupKey() {
        String routerKey = RouterKeyBinder.getRouterKey();
        RouterKeyBinder.remove();
        return routerKey;
    }
}
