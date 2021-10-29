package cn.com.ponycloud.ponybills.modules.common.handler.exception;

/**
 * 自定义异常类
 * @author pony
 */
public class BizException extends RuntimeException{

    private static final long serialVersionUID = 1L;

    /**
     * 错误码
     */
    protected Integer errorCode;
    /**
     * 错误信息
     */
    protected String errorMsg;

    public BizException() {
        super();
    }

    public BizException(BaseErrorException baseErrorException) {
        super(String.valueOf(baseErrorException.getResultCode()));
        this.errorCode = baseErrorException.getResultCode();
        this.errorMsg = baseErrorException.getResultMessage();
    }

    public BizException(BaseErrorException baseErrorException, Throwable cause) {
        super(String.valueOf(baseErrorException.getResultCode()), cause);
        this.errorCode = baseErrorException.getResultCode();
        this.errorMsg = baseErrorException.getResultMessage();
    }

    public BizException(String errorMsg) {
        super(errorMsg);
        this.errorMsg = errorMsg;
    }

    public BizException(Integer errorCode, String errorMsg) {
        super(String.valueOf(errorCode));
        this.errorCode = errorCode;
        this.errorMsg = errorMsg;
    }

    public BizException(Integer errorCode, String errorMsg, Throwable cause) {
        super(String.valueOf(errorCode), cause);
        this.errorCode = errorCode;
        this.errorMsg = errorMsg;
    }


    public Integer getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(Integer errorCode) {
        this.errorCode = errorCode;
    }

    public String getErrorMsg() {
        return errorMsg;
    }

    public void setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
    }

    public String getMessage() {
        return errorMsg;
    }

    @Override
    public Throwable fillInStackTrace() {
        return this;
    }
}