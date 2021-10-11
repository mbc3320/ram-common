package top.beanshell.common.utils;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import lombok.extern.slf4j.Slf4j;

/**
 * xml util for jackson
 * @author binchao
 */
@Slf4j
public final class XML {

    private XML() {
    }

    private static XmlMapper objectMapper;

    /**
     * pojo to xml
     * @param data
     * @return
     */
    public static String toXML(Object data) {
        if (objectMapper == null) {
            objectMapper = new XmlMapper();
        }
        try {
            return objectMapper.writeValueAsString(data);
        } catch (Exception e) {
            log.error("Serialize Object to String error: {}", e.getMessage(), e);
        }
        return null;
    }

    /**
     * xml to pojo
     * @param data
     * @param cls
     * @param <T>
     * @return
     */
    public static <T> T toBean(String data, Class<T> cls) {
        if (objectMapper == null) {
            objectMapper = new XmlMapper();
        }
        try {
            objectMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES,false);
            return objectMapper.readValue(data, cls);
        } catch (Exception e) {
            log.error("Deserialize String to Object error: {}", e.getMessage(), e);
        }
        return null;
    }
}
