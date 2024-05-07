package dom.com.bpd.kafkaconnector.monitor;

import java.util.Map;

import org.apache.camel.kafkaconnector.CamelSinkConnectorConfig;
import org.apache.kafka.common.config.ConfigDef;

public class MonitorSinkConnectorConfig extends CamelSinkConnectorConfig{

    public static final String CAMEL_SINK_LOGSINK_KAMELET_LOGGER_NAME_CONF = "camel.kamelet.log-sink.loggerName";
    public static final String CAMEL_SINK_LOGSINK_KAMELET_LOGGER_NAME_DOC = "Name of the logging category to use";
    public static final String CAMEL_SINK_LOGSINK_KAMELET_LOGGER_NAME_DEFAULT = "log-sink";


    public MonitorSinkConnectorConfig(ConfigDef config, Map<String, String> parsedConfig) {
        super(config, parsedConfig);
        
    }

    public MonitorSinkConnectorConfig(Map<String, String> parsedConfig) {
        super(parsedConfig);
        
    }

    public static ConfigDef conf(){
        ConfigDef conf = new ConfigDef(CamelSinkConnectorConfig.conf());
        conf.define(CAMEL_SINK_LOGSINK_KAMELET_LOGGER_NAME_CONF, ConfigDef.Type.STRING, CAMEL_SINK_LOGSINK_KAMELET_LOGGER_NAME_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_LOGSINK_KAMELET_LOGGER_NAME_DOC);
        return conf;
    }


    
}
