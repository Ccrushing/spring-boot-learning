package top.crush.boot.exception.commen;

/**
 * @description: ⾃定义异常枚举
 * @author: crush
 * @since: 2021-04-08
 **/

public enum CustomExceptionEnum {
    /*
     * 错误枚举值
     */
    USER_INPUT_ERROR(400, "您输⼊的数据错误或您没有权限访问资源！"),
    SYSTEM_ERROR(500, "系统出现异常，请您稍后再试或联系管理员！"),
    OTHER_ERROR(999, "系统出现未知异常，请联系管理员！"),
    NOT_FOUND_ERROR(404,"⻚⾯找不到！");
    CustomExceptionEnum(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }
    private final int code;
    private final String msg;

    public int getCode() {
        return code;
    }
    public String getMsg() {
        return msg;
    }

}
