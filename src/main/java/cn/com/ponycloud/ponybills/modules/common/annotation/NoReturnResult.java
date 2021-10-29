package cn.com.ponycloud.ponybills.modules.common.annotation;

import java.lang.annotation.*;

/**
 * 无需统一返回接口时，使用此注解
 * @author pony
 */
@Documented
@Inherited
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
public @interface NoReturnResult {
}