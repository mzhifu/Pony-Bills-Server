package cn.com.ponycloud.ponybills.modules.common.handler;

import cn.com.ponycloud.ponybills.modules.common.annotation.NoReturnResult;
import cn.com.ponycloud.ponybills.modules.common.domain.ResultData;
import com.alibaba.fastjson.JSON;
import org.springframework.core.MethodParameter;
import org.springframework.http.MediaType;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.converter.StringHttpMessageConverter;
import org.springframework.http.server.ServerHttpRequest;
import org.springframework.http.server.ServerHttpResponse;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.mvc.method.annotation.ResponseBodyAdvice;

import java.util.Objects;

/**
 * 统一定义返回标准格式
 * @author: pony
 */
@ControllerAdvice
@ResponseBody
public class GlobalResponseHandler implements ResponseBodyAdvice<Object> {

    @Override
    public boolean supports(MethodParameter methodParameter, Class aClass) {
        NoReturnResult noReturnResult = methodParameter.getMethodAnnotation(NoReturnResult.class);
        return Objects.isNull(noReturnResult);
    }

    @Override
    public Object beforeBodyWrite(Object o, MethodParameter methodParameter, MediaType mediaType,
                                  Class<? extends HttpMessageConverter<?>> converterType,
                                  ServerHttpRequest serverHttpRequest, ServerHttpResponse serverHttpResponse) {
        if (methodParameter.hasMethodAnnotation(NoReturnResult.class)) {
            return o;
        }
        if (o == null && StringHttpMessageConverter.class.isAssignableFrom(converterType)) {
            return null;
        }

        if (!(o instanceof ResultData)) {
            if (o instanceof String) {
                return JSON.toJSONString(ResultData.success(o));
            }
            return ResultData.success(o);
        }
        return o;
    }
}