package io.github.forezp.netty.rpc.core.annotation.condition;

import static io.github.forezp.netty.rpc.core.common.constant.ConfigConstants.MONITOR_TYPE;
import static io.github.forezp.netty.rpc.core.common.constant.ConfigConstants.MONITOR_TYPE_HTTP;

/**
 * Created by forezp on 2018/6/2.
 */
public class HttpMonitorConditon extends PropertyEqualsCondition {
    public HttpMonitorConditon() {

        super(MONITOR_TYPE, MONITOR_TYPE_HTTP);
    }
}
