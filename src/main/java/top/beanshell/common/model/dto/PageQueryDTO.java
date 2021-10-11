package top.beanshell.common.model.dto;

import lombok.Data;

import javax.validation.Valid;
import java.io.Serializable;

/**
 * page query condition
 * @author binchao
 */
@Data
public class PageQueryDTO<T extends Serializable> implements Serializable {

    /**
     * max record of each page，default 10
     */
    private Integer pageSize = 10;

    /**
     * current page
     */
    private Integer current = 1;

    /**
     * condition parameter
     */
    @Valid
    private T params;

}
