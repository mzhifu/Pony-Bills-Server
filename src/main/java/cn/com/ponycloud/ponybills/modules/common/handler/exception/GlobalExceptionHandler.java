package cn.com.ponycloud.ponybills.modules.common.handler.exception;

import cn.com.ponycloud.ponybills.modules.common.constant.HttpStatus;
import cn.com.ponycloud.ponybills.modules.common.domain.ResultData;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import javax.servlet.http.HttpServletRequest;

/**
 * 全局异常处理
 * @author pony
 */
@RestControllerAdvice
public class GlobalExceptionHandler {

    private static final Logger logger = LoggerFactory.getLogger(GlobalExceptionHandler.class);

    /**
     * 默认全局异常处理。
     * @param e the e
     * @return ResultData
     */
    @ExceptionHandler(Exception.class)
    @ResponseStatus(org.springframework.http.HttpStatus.INTERNAL_SERVER_ERROR)
    public ResultData<String> exception(Exception e) {
        StackTraceElement element= e.getStackTrace()[0];
        logger.error("未知异常！原因是:{}, 文件名:{}, 错误行号 :{}, 方法名: {}",
                e, element.getFileName(), element.getLineNumber(), element.getMethodName());
        return ResultData.fail(HttpStatus.ERROR,e.getMessage());
    }

    /**
     * 自定义业务异常
     */
    @ExceptionHandler(value = BizException.class)
    @ResponseBody
    public ResultData<String> bizExceptionHandler(HttpServletRequest req, BizException e){
        StackTraceElement element= e.getStackTrace()[0];
        logger.error("发生业务异常！原因是:{}, 文件名:{}, 错误行号 :{}, 方法名: {}",
                e, element.getFileName(), element.getLineNumber(), element.getMethodName());
        return ResultData.fail(e.getErrorCode(), e.getErrorMsg());
    }

    /**
     * 处理空指针的异常
     */
    @ExceptionHandler(value =NullPointerException.class)
    @ResponseBody
    public ResultData<String> exceptionHandler(HttpServletRequest req, NullPointerException e){
        StackTraceElement element= e.getStackTrace()[0];
        logger.error("发生空指针异常！原因是:{}, 文件名:{}, 错误行号 :{}, 方法名: {}",
                e, element.getFileName(), element.getLineNumber(), element.getMethodName());
        return ResultData.fail(GlobalExceptionEnum.BAD_REQUEST.getResultCode(),
                GlobalExceptionEnum.BAD_REQUEST.getResultMessage());
    }
}