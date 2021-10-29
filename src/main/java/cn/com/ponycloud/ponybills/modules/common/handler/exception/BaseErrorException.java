package cn.com.ponycloud.ponybills.modules.common.handler.exception;

/**
 * 全局统一异常处理接口
 * @author pony
 */
public interface BaseErrorException {

    /**
     * 错误码
     * @return 错误码
     */
    int getResultCode();

    /**
     * 错误描述
     * @return 错误描述
     */
    String getResultMessage();
}