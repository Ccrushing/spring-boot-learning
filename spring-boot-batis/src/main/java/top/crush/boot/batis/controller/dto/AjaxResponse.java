package top.crush.boot.batis.controller.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author Crush
 * @date 2021/3/4
 * @dercsiption AjaxResponse
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class AjaxResponse {
    private Integer code;
    private String message;
    private Object data;

    public static AjaxResponse success() {
        AjaxResponse ajaxResponse = new AjaxResponse();
        ajaxResponse.setCode(200);
        ajaxResponse.setMessage("请求成功");
        return ajaxResponse;
    }

    public static AjaxResponse success(Object obj) {
        AjaxResponse ajaxResponse = new AjaxResponse();
        ajaxResponse.setCode(200);
        ajaxResponse.setMessage("请求成功");
        ajaxResponse.setData(obj);
        return ajaxResponse;
    }

    public static AjaxResponse failure(String message) {
        AjaxResponse ajaxResponse = new AjaxResponse();
        ajaxResponse.setCode(5001);
        ajaxResponse.setMessage(message);
        return ajaxResponse;
    }


}
