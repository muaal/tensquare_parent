package common.controller;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import common.exception.BizException;
import common.model.ParamObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.util.Map;
import java.util.Objects;

/**
 * Created with IntelliJ IDEA.
 * Description: 基控制器
 *
 * @author: wzp
 * Date: 2019-01-28
 * Time: 17:04
 */
@RestController
public class BaseController {
    public Logger logger = LoggerFactory.getLogger(this.getClass().getName());
    public ObjectMapper objectMapper = new ObjectMapper().setSerializationInclusion(JsonInclude.Include.NON_NULL);
    public String url;


    /**
     * 参数检查
     *
     * @param o
     * @param ii
     */
    public void check(ParamObject o, int ii) {
        Map<String, String> map = null;
        try {
            String value = objectMapper.writeValueAsString(o);
            map = objectMapper.readValue(value, new TypeReference<Map<String, String>>() {
            });
        } catch (IOException e) {
            logger.error("json转换错误", e);
        }
        for (int i = 1; i < ii + 1; i++) {
            if (Objects.requireNonNull(map).get("param" + i) == null) {
                throw new BizException("参数param + i + 为空!");
            }
        }
    }


}
