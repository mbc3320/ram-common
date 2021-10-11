package top.beanshell.common.exception.code;

import top.beanshell.common.model.enu.EnumCode;

/**
 * global exception status code
 * @author binchao
 */
public enum GlobalStatusCode implements EnumCode {

    SUCCESS(0, "成功"),

    FAILED(1, "失败"),


    USER_LOGOUT(401, "用户未登录"),

    PERMISSION_DENY(403, "无权访问"),

    RESOURCE_IS_NOT_EXIST(404, "资源不存在"),

    REQUEST_METHOD_NOT_SUPPORT(405, "请求方式不支持"),

    SERVER_ERROR(500, "服务器异常"),

    INVALID_PARAMETER(9001, "参数不合法"),

    INVALID_PARAMETER_TYPE(9002, "参数类型不匹配"),

    MESSAGE_BODY_INVALID(9003, "报文格式不正确"),

    DATA_IS_NOT_EXIST(9004, "数据不存在"),

    UNKNOWN_ERROR(9999, "未知异常");

    /**
     * status code
     */
    private Integer code;

    /**
     * code desc
     */
    private String text;

    GlobalStatusCode(Integer code, String text) {
        this.code = code;
        this.text = text;
    }


    @Override
    public Integer getCode() {
        return code;
    }

    @Override
    public String getText() {
        return text;
    }
}
