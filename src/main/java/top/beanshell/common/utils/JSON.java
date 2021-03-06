package top.beanshell.common.utils;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.extern.slf4j.Slf4j;

import java.util.Collections;
import java.util.List;

/**
 * json util for jackson
 * @author binchao
 */
@Slf4j
public final class JSON {

    private static final String DESERIALIZE_ERROR_FORMAT = "Deserialize String to Object error: {}";

    private JSON() {
    }

    private static ObjectMapper objectMapper;

    /**
     * config objectMapper
     * @param config  config data
     * @return        JSON instance
     */
    public static JSON config(ObjectMapper config) {
        if (null != config) {
            objectMapper = config;
        }
        return new JSON();
    }

    /**
     * pojo to json string
     * @param obj  bean instance
     * @return     json string
     */
    public static String toJSONString(Object obj) {
        if (objectMapper == null) {
            objectMapper = new ObjectMapper();
        }
        try {
            return objectMapper.writeValueAsString(obj);
        } catch (Exception e) {
            log.error("Serialize Object to String error: {}", e.getMessage(), e);
        }
        return null;
    }

    /**
     * json string to pojo
     * ignore unknown property
     * @param jsonString  json string data
     * @param valueType   bean class
     * @param <T>         bean class
     * @return            bean instance with data
     */
    public static <T> T parse(String jsonString, Class<T> valueType) {
        if (objectMapper == null) {
            objectMapper = new ObjectMapper();
        }
        try {
            objectMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES,false);
            return objectMapper.readValue(jsonString, valueType);
        } catch (Exception e) {
            log.error(DESERIALIZE_ERROR_FORMAT, e.getMessage(), e);
        }
        return null;
    }

    /**
     * json string to pojo
     * @param byteData  json string byte array data
     * @param valueType bean class
     * @param <T>       bean class
     * @return          bean instance with data
     */
    public static <T> T parse(byte[] byteData, Class<T> valueType) {
        if (objectMapper == null) {
            objectMapper = new ObjectMapper();
        }
        try {
            objectMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES,false);
            return objectMapper.readValue(byteData, valueType);
        } catch (Exception e) {
            log.error(DESERIALIZE_ERROR_FORMAT, e.getMessage(), e);
        }
        return null;
    }

    /**
     * json array to pojo list
     * @param jsonString json data string
     * @param valueType  bean class
     * @param <T>        bean class
     * @return data list
     */
    public static <T> List<T> parseArray(String jsonString, Class<T> valueType) {
        if (objectMapper == null) {
            objectMapper = new ObjectMapper();
        }
        try {
            objectMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES,false);
            return objectMapper.readValue(jsonString, new TypeReference<List<T>>() { });
        } catch (Exception e) {
            log.error(DESERIALIZE_ERROR_FORMAT, e.getMessage(), e);
        }
        return Collections.emptyList();
    }
}
