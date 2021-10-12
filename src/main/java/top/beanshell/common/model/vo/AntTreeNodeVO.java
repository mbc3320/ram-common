package top.beanshell.common.model.vo;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.List;


/**
 * ant design vue tree component node data
 * @author binchao
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class AntTreeNodeVO implements Serializable {

    /**
     * title
     */
    private String title;

    /**
     * key
     */
    private String key;

    /**
     * checked
     */
    private Boolean checked;

    /**
     * other info
     */
    private String extra;

    /**
     * checked list
     */
    private List<String> checkedList;

    /**
     * children node
     */
    private List<AntTreeNodeVO> children;
}
