package dom.com.bpd.kafkaconnector.monitor;

import java.util.Map;

import org.apache.camel.kafkaconnector.CamelSinkConnectorConfig;
import org.apache.camel.kafkaconnector.CamelSinkTask;

public class MonitorSinkTask extends CamelSinkTask{

    @Override
    protected CamelSinkConnectorConfig getCamelSinkConnectorConfig(Map<String, String> props) {
        return new MonitorSinkConnectorConfig(props);
    }

    @Override
    protected String getSinkKamelet() {
        return "kamelet:log-sink";
    }
    
}
