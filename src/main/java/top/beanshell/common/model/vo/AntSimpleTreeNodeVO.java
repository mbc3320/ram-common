package top.beanshell.common.model.vo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.io.Serializable;

/**
 * antv simple tree model
 * @author beanshell
 */
@Data
public class AntSimpleTreeNodeVO implements Serializable {

    /**
     * 树ID
     */
    private String id;

    /**
     * 树节点显示名称
     */
    private String label;

    /**
     * 树节点值
     */
    private String value;

    /**
     * 父级ID
     */
    @JsonProperty("pId")
    private String pid;

    /**
     * 其他信息
     */
    private String extra;
}
