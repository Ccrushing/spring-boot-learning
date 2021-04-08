package top.crush.boot.exception.commen;

import lombok.Data;
import top.crush.boot.exception.exception.CustomException;

/**
 * @author Crush
 * @date 2021/4/8
 * @dercsiption 接口数据请求统一响应数据结构
 */
@Data
public class AjaxResponse {
    /**
     * 请求响应状态码
     */
    private int code;
    /**
     * 请求结果描述信息
     */
    private String message;
    /**
     * 请求结果数据（通常⽤于查询操作）
     */
    private Object data;
    private AjaxResponse() {
    }
    /*
     * 请求出现异常时的响应数据封装
     *
     * @param e ⾃定义异常对象
     * @return AjaxResponse
     */
    public static AjaxResponse error(CustomException e) {
        AjaxResponse resultBean = new AjaxResponse();
        resultBean.setCode(e.getCode());
        resultBean.setMessage(e.getMessage());
        return resultBean;
    }
    /**
     * 请求出现异常时的响应数据封装
     *
     * @param customExceptionEnum 异常类型枚举
     * @param errorMessage 异常信息
     * @return AjaxResponse
     */
    public static AjaxResponse error(CustomExceptionEnum
                                             customExceptionEnum,
                                     String errorMessage) {
        AjaxResponse resultBean = new AjaxResponse();
        resultBean.setCode(customExceptionEnum.getCode());
        resultBean.setMessage(errorMessage);
        return resultBean;
    }
    /**
     * 请求成功的响应，不带查询数据（⽤于删除、修改、新增接⼝）
     *
     * @return AjaxResponse
     */
    public static AjaxResponse success() {
        AjaxResponse ajaxResponse = new AjaxResponse();
        ajaxResponse.setCode(200);
        ajaxResponse.setMessage("请求响应成功!");
        return ajaxResponse;
    }
    /**
     * 请求成功的响应，带查询数据（⽤于查询接⼝）
     *
     * @return AjaxResponse
     */
    public static AjaxResponse success(Object data) {
        AjaxResponse ajaxResponse = new AjaxResponse();
        ajaxResponse.setCode(200);
        ajaxResponse.setMessage("请求响应成功!");
        ajaxResponse.setData(data);
        return ajaxResponse;

    }
}
