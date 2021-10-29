package cn.com.ponycloud.ponybills.modules.common.handler.exception;

import cn.com.ponycloud.ponybills.modules.common.constant.HttpStatus;

/**
 * @author pony
 */
public enum GlobalExceptionEnum implements BaseErrorException {

    SUCCESS(HttpStatus.SUCCESS, "成功！"),
    CREATED(HttpStatus.CREATED, "对象创建成功！"),
    ACCEPTED(HttpStatus.ACCEPTED, "请求已经被接受！"),
    MOVED_PERM(HttpStatus.MOVED_PERM, "资源已被移除！"),
    BAD_REQUEST(HttpStatus.BAD_REQUEST, "参数列表错误（缺少，格式不匹配）！"),
    UNAUTHORIZED(HttpStatus.UNAUTHORIZED, "未授权的资源！"),
    FORBIDDEN(HttpStatus.FORBIDDEN, "访问受限或授权过期！"),
    NOT_FOUND(HttpStatus.NOT_FOUND, "资源，服务未找到！"),
    ERROR(HttpStatus.ERROR, "系统内部错误！"),
    NOT_IMPLEMENTED(HttpStatus.NOT_IMPLEMENTED, "接口未实现！"),
    SERVER_BUSY(HttpStatus.SERVER_BUSY,"服务器正忙，请稍后再试！"),
    SEE_OTHER(HttpStatus.SEE_OTHER, "重定向！")
    ;

    private final Integer code;

    private final String message;

    GlobalExceptionEnum(Integer code, String message) {
        this.code = code;
        this.message = message;
    }

    @Override
    public int getResultCode() {
        return code;
    }

    @Override
    public String getResultMessage() {
        return message;
    }
}
