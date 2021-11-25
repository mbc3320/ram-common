package top.beanshell.common.service.impl;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.context.NoSuchMessageException;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.stereotype.Service;
import top.beanshell.common.model.enu.EnumCode;
import top.beanshell.common.service.I18nService;

/**
 * i18n service impl
 * @author binchao
 */
@Slf4j
@Service
public class I18nServiceImpl implements I18nService {

    /**
     * 错误码枚举格式
     */
    private static final String EXCEPTION_CODE_FORMAT = "i18n.exception.code.%d";


    @Autowired
    private MessageSource messageSource;


    @Override
    public String getMessage(String msgKey) {
        return findMessage(msgKey, null);
    }

    @Override
    public String getMessage(String msgKey, Object... args) {
        return findMessage(msgKey, args);
    }

    @Override
    public String getMessage(EnumCode enumCode) {
        return findMessage(String.format(EXCEPTION_CODE_FORMAT, enumCode.getCode()), null);
    }

    @Override
    public String getMessage(Integer code) {
        return findMessage(String.format(EXCEPTION_CODE_FORMAT, code), null);
    }

    private String findMessage(String msgKey, Object... args) {
        try {
            return messageSource.getMessage(msgKey, args, LocaleContextHolder.getLocale());
        } catch (NoSuchMessageException e) {
            log.debug("Get i18n message error: {}", e.getMessage());
        } catch (Exception e) {
            log.debug("Get i18n message error: {}", e.getMessage(), e);
        }
        return null;
    }
}
