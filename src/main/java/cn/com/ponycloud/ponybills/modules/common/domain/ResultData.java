package cn.com.ponycloud.ponybills.modules.common.domain;

import cn.com.ponycloud.ponybills.modules.common.constant.HttpStatus;
import cn.com.ponycloud.ponybills.modules.common.handler.exception.GlobalExceptionEnum;
import org.apache.commons.lang3.builder.ToStringBuilder;

import java.io.Serializable;

/**
 * @author: pony
 */
public class ResultData<T> implements Serializable {

    private static final long serialVersionUID = -1L;

    /**
     * 返回状态码
     */
    private Integer code;

    /**
     * 结果信息描述
     */
    private String message;

    /**
     * 结果数据
     */
    private T data;

    /**
     * 返回时间戳
     */
    private long timestamp ;

    /**
     * 无参构造方法
     */
    public ResultData() {
        this.timestamp = System.currentTimeMillis();
    }

    public ResultData(Integer code, String message) {
        this.code = code;
        this.message = message;
    }

    public ResultData(Integer code, String message, T data) {
        this(code, message);
        this.data = data;
    }

    public static <T> ResultData<T> success(T data) {
        ResultData<T> resultData = new ResultData<>();
        resultData.setCode(GlobalExceptionEnum.SUCCESS.getResultCode());
        resultData.setMessage(GlobalExceptionEnum.SUCCESS.getResultMessage());
        resultData.setData(data);
        return resultData;
    }

    public static <T> ResultData<T> fail(int code, String message) {
        ResultData<T> resultData = new ResultData<>();
        resultData.setCode(code);
        resultData.setMessage(message);
        return resultData;
    }

    public static <T> ResultData<T> fail(String message) {
        ResultData<T> resultData = new ResultData<>();
        resultData.setCode(-1);
        resultData.setMessage(message);
        return resultData;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public long getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(long timestamp) {
        this.timestamp = timestamp;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this)
                .append("code", code)
                .append("message", message)
                .append("data", data)
                .toString();
    }
}