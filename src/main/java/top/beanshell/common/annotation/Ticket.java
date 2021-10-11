package top.beanshell.common.annotation;

import java.lang.annotation.*;


/**
 * User Ticket
 *  for Controller method to get current user info.
 * @author binchao
 */
@Target(ElementType.PARAMETER)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface Ticket {
}
