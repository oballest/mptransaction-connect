package dom.com.bpd.kafkaconnector.monitor;

import java.util.Map;

import org.apache.camel.kafkaconnector.CamelSinkConnectorConfig;
import org.apache.kafka.common.config.ConfigDef;

public class MonitorSinkConnectorConfig extends CamelSinkConnectorConfig{

    public static final String CAMEL_SINK_LOGSINK_KAMELET_LOGGER_NAME_CONF = "camel.kamelet.mptransaction-sink.loggerName";
    public static final String CAMEL_SINK_LOGSINK_KAMELET_LOGGER_NAME_DOC = "Name of the logging category to use";
    public static final String CAMEL_SINK_LOGSINK_KAMELET_LOGGER_NAME_DEFAULT = "log-sink";
    public static final String MPTRANSACTION_SINK_URL_CONF = "camel.kamelet.mptransaction-sink.url";
    public static final String MPTRANSACTION_SINK_URL_DOC = "URL sobre la que se encuentra el servicio MPTransaction Rest";
    public static final String MPTRANSACTION_SINK_URL_DEFAULT = null;
    public static final String MPTRANSACTION_SINK_METHOD_CONF = "camel.kamelet.mptransaction-sink.method";
    public static final String MPTRANSACTION_SINK_METHOD_DOC = "The HTTP method to use.";
    public static final String MPTRANSACTION_SINK_METHOD_DEFAULT = "POST";
    public static final String MPTRANSACTION_SINK_HEADER_ID_CONF = "camel.kamelet.mptransaction-sink.headerId";
    public static final String MPTRANSACTION_SINK_HEADER_ID_DOC = "HEADER http a incluir en la solicitud http";
    public static final String MPTRANSACTION_SINK_HEADER_ID_DEFAULT = "BPD";
    public static final String MPTRANSACTION_SINK_HEADER_TOKEN_CONF = "camel.kamelet.mptransaction-sink.headerToken";
    public static final String MPTRANSACTION_SINK_HEADER_TOKEN_DOC = "Valor Header Token de autenticación con MPTransaction Rest";
    public static final String MPTRANSACTION_SINK_HEADER_TOKEN_DEFAULT = null;
    public static final String MPTRANSACTION_SINK_HEADER_CONTENT_TYPE_CONF = "camel.kamelet.mptransaction-sink.contentType";
    public static final String MPTRANSACTION_SINK_HEADER_CONTENT_TYPE_DOC = "Tipo de contenido a enviar al servicio MPTransaction Rest";
    public static final String MPTRANSACTION_SINK_HEADER_CONTENT_TYPE_DEFAULT = "application/json";

    public MonitorSinkConnectorConfig(ConfigDef config, Map<String, String> parsedConfig) {
        super(config, parsedConfig);
        
    }

    public MonitorSinkConnectorConfig(Map<String, String> parsedConfig) {
        super(parsedConfig);
        
    }

    public static ConfigDef conf(){
        ConfigDef conf = new ConfigDef(CamelSinkConnectorConfig.conf());
        conf.define(CAMEL_SINK_LOGSINK_KAMELET_LOGGER_NAME_CONF, ConfigDef.Type.STRING, CAMEL_SINK_LOGSINK_KAMELET_LOGGER_NAME_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_LOGSINK_KAMELET_LOGGER_NAME_DOC);
        conf.define(MPTRANSACTION_SINK_URL_CONF, ConfigDef.Type.STRING, MPTRANSACTION_SINK_URL_DEFAULT, ConfigDef.Importance.HIGH, MPTRANSACTION_SINK_URL_DOC);
        conf.define(MPTRANSACTION_SINK_METHOD_CONF, ConfigDef.Type.STRING, MPTRANSACTION_SINK_METHOD_DEFAULT, ConfigDef.Importance.HIGH, MPTRANSACTION_SINK_METHOD_DOC);
        conf.define(MPTRANSACTION_SINK_HEADER_ID_CONF, ConfigDef.Type.STRING, MPTRANSACTION_SINK_HEADER_ID_DEFAULT, ConfigDef.Importance.HIGH, MPTRANSACTION_SINK_HEADER_ID_DOC);
        conf.define(MPTRANSACTION_SINK_HEADER_TOKEN_CONF, ConfigDef.Type.STRING, MPTRANSACTION_SINK_HEADER_TOKEN_DEFAULT, ConfigDef.Importance.HIGH, MPTRANSACTION_SINK_HEADER_TOKEN_DOC);
        conf.define(MPTRANSACTION_SINK_HEADER_CONTENT_TYPE_CONF, ConfigDef.Type.STRING, MPTRANSACTION_SINK_HEADER_CONTENT_TYPE_DEFAULT, ConfigDef.Importance.HIGH, MPTRANSACTION_SINK_HEADER_CONTENT_TYPE_DOC);
        return conf;
    }


    
}
