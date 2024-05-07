package dom.com.bpd.kafkaconnector.monitor;

import org.apache.camel.kafkaconnector.CamelSinkConnector;
import org.apache.kafka.common.config.ConfigDef;
import org.apache.kafka.connect.connector.Task;

public class MonitorSinkConnector extends CamelSinkConnector{

    @Override
    public ConfigDef config() {
        return MonitorSinkConnectorConfig.conf();
    }

    @Override
    public Class<? extends Task> taskClass() {
        return MonitorSinkTask.class;
    }
    
}
