package top.beanshell.common.annotation;

import java.lang.annotation.*;

/**
 * Permission check annotation
 * <p>
 *     usage:
 *         Target Class: api method of Controller
 *
 * </p>
 * @author binchao
 */
@Target({ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface Authorization {

    /**
     * permission code
     *  ex: api_admin_user_save
     * @return api permissionCode
     */
    String value() default "";

    /**
     * whether the validation
     * @return whether the validation
     */
    boolean valid() default true;
}
