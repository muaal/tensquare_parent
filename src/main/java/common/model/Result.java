package common.model;

import lombok.Data;

/**
 * @Author:wzp
 * @Date:Created in 9:52 PM 2019/5/16
 * @Description:返回前端结果实体类
 */
@Data
public class Result {
    private boolean flag;//是否成功
    private Integer code;// 返回码
    private String message;//返回信息
    private Object data;// 返回数据
    public Result(boolean flag, Integer code, String message, Object
            data) {
        super();
        this.flag = flag;
        this.code = code;
        this.message = message;
        this.data = data;
    }
    public Result() {
    }
    public Result(boolean flag, Integer code, String message) {
        super();
        this.flag = flag;
        this.code = code;
        this.message = message;
    }

}
