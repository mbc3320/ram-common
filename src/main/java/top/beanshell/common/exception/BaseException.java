package top.beanshell.common.exception;

import lombok.Data;
import top.beanshell.common.model.enu.EnumCode;

/**
 *  Base Exception for custom biz exception
 * @author binchao
 */
@Data
public class BaseException extends RuntimeException {

    /**
     * exception code
     */
    private EnumCode status;

    /**
     * all biz exception must throw a code.
     * @param status
     */
    public BaseException(EnumCode status) {
        this.status = status;
    }

    /**
     * whether the code can't desc the error, just desc by ext message.
     * @param status
     * @param message
     */
    public BaseException(EnumCode status, String message) {
        super(message);
        this.status = status;
    }
}
