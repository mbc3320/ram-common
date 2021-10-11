package top.beanshell.common.model.vo;

import lombok.Data;

import java.io.Serializable;

/**
 * Common label
 * @author binchao
 */
@Data
public class CommonLabelVO implements Serializable {

    /**
     * label text
     */
    private String label;

    /**
     * label value
     */
    private String value;

    /**
     * label ext info
     */
    private String desc;

    public CommonLabelVO() {
    }

    public CommonLabelVO(String label, String value) {
        this.label = label;
        this.value = value;
    }

    public CommonLabelVO(String label, String value, String desc) {
        this.label = label;
        this.value = value;
        this.desc = desc;
    }
}
