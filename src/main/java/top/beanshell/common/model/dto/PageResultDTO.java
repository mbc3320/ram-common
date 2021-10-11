package top.beanshell.common.model.dto;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * page result
 * @author binchao
 */
@Data
public class PageResultDTO<T extends Serializable> implements Serializable {

    /**
     * current page
     */
    private Integer current;

    /**
     * page size
     */
    private Integer pageSize;

    /**
     * total record
     */
    private Long total;

    /**
     * data list
     */
    private List<T> records;
}
