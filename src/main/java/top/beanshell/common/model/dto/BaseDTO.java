package top.beanshell.common.model.dto;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.ser.std.ToStringSerializer;
import lombok.Data;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.util.Date;

/**
 * Base DTO
 * @author binchao
 */
@Data
@Accessors(chain = true)
public class BaseDTO implements Serializable {

    /**
     * id
     */
    @JsonSerialize(using = ToStringSerializer.class)
    private Long id;

    /**
     * create time
     */
    private Date createTime;

    /**
     * update time
     */
    private Date updateTime;
}
