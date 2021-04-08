package top.crush.boot.exception.exception;

import top.crush.boot.exception.commen.CustomExceptionEnum;

/**
 * @author Crush
 * @date 2021/4/8
 * @dercsiption 自定义异常类
 */
public class CustomException extends RuntimeException {
    /**
     * 异常错误编码
     */
    private int code;
    /**
     * 异常信息
     */
    private String message;
    private CustomException() {
    }
    public CustomException(CustomExceptionEnum
                                   exceptionTypeEnum) {
        this.code = exceptionTypeEnum.getCode();
        this.message = exceptionTypeEnum.getMsg();
    }
    public CustomException(CustomExceptionEnum
                                   exceptionTypeEnum,
                           String message) {
        this.code = exceptionTypeEnum.getCode();
        this.message = message;
    }
    public int getCode() {
        return code;
    }
    @Override
    public String getMessage() {
        return message;
    }
}