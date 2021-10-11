package top.beanshell.common.model.enu;

import com.fasterxml.jackson.annotation.JsonValue;

import java.io.Serializable;

/**
 * key-value enum
 * @author binchao
 */
public interface EnumCode extends Serializable {

    /**
     * enum code
     * @return
     */
    @JsonValue
    Integer getCode();

    /**
     * enum value
     * @return
     */
    String getText();
}
