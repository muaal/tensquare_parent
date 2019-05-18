package common.exception;

/**
 * @Author:wzp
 * @Date:Created in 9:46 PM 2019/5/16
 * @Description:公共异常类
 */
public class BizException extends RuntimeException {
    public BizException(String message) {
        super(message);
    }
}

