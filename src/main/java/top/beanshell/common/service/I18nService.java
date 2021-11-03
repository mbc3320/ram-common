package top.beanshell.common.service;

import top.beanshell.common.model.enu.EnumCode;

import javax.validation.constraints.NotNull;

/**
 * i18n service
 * @author binchao
 */
public interface I18nService {

    /**
     * 通过属性获取文本
     * @param msgKey     msg property name
     * @return  i18n message
     */
    String getMessage(@NotNull String msgKey);

    /**
     * 通过属性获取并格式化文本
     * @param msgKey  msg property name
     * @param args    format arg
     * @return  i18n message
     */
    String getMessage(@NotNull String msgKey, Object... args);

    /**
     * 通过枚举获取i18n文本
     * @param enumCode  枚举值
     * @return          i18n枚举描述
     */
    String getMessage(@NotNull EnumCode enumCode);

    /**
     * 通过错误码获取i18n文本
     * @param code    错误码
     * @return        i18n错误码描述
     */
    String getMessage(@NotNull Integer code);
}
