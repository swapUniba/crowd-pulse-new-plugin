package com.github.swapUniba.pulse.crowd.yourpackagename;

import com.github.frapontillo.pulse.spi.IPlugin;
import com.github.frapontillo.pulse.spi.VoidConfig;
import rx.Observable.Operator;

/**
 * CrowdPulse's skeleton plugin.
 *
 * @author YourFirstName YourLastName
 *
 */
public class PluginMainClass extends IPlugin<Object, Object, VoidConfig> {

    private static final String PLUGIN_NAME = "plugin-name";

    @Override
    public String getName() {
        return PLUGIN_NAME;
    }

    @Override
    public VoidConfig getNewParameter() {
        return new VoidConfig();
    }

    @Override
    protected Operator<Object, Object> getOperator(VoidConfig params) {
        return null;
    }

}