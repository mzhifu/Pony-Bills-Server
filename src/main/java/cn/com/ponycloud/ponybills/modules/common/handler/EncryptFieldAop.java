package cn.com.ponycloud.ponybills.modules.common.handler;

import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

/**
 * @author: pony
 */
@Order(Ordered.HIGHEST_PRECEDENCE)
@Component
public class EncryptFieldAop {
}