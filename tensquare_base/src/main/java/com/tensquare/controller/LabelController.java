package com.tensquare.controller;

import com.tensquare.pojo.Label;
import com.tensquare.service.LabelService;
import controller.BaseController;
import exception.BizException;
import model.ParamObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

/**
 * @Author:wzp
 * @Date:Created in 9:23 PM 2019/5/16
 * @Description:标签控制层
 */
@RestController
public class LabelController extends BaseController {
    @Autowired
    private LabelService labelService;

    @PostMapping("/label")
    public Object homeStay(ParamObject params, Label label) {
        boolean o = false;
        Object result = null;
        try {
            url = Optional.ofNullable(params.getParam0()).orElseThrow(() -> new BizException("系统错误"));
            logger.info("request-" + url + "-param-" + objectMapper.writeValueAsString(params));
            switch (url) {
                //查询全部标签
                case "1":
                    result=labelService.findAllLabel();
                    break;
                //根据ID查询标签
                case "2":
                    result=labelService.selectByPrimaryKey(params.getParam1());
                    break;
                //增加标签
                case "3":
                    result=labelService.insertSelective(label);
                    break;
                //修改标签
                case "4":
                    result=labelService.updateByPrimaryKeySelective(label);
                    break;
                //删除标签
                case "5":
                    result=labelService.deleteByPrimaryKey(params.getParam1());
                    break;
                case "6":
                    break;
                case "7":
                    break;
                case "8":
                    break;
                case "9":
                    break;
                case "10":
                    break;
                default:
                    result = "error:404,参数param0不正确,请填写正确的url地址!";
                    break;
            }
            if (o) {
                logger.info("success-" + url + "-result-" + objectMapper.writeValueAsString(result));
            }
            return result;
        } catch (BizException e) {
            logger.error("fail-" + url + "-result-" + e.getMessage(), e);
            return result;
        } catch (Exception e) {
            logger.error("error-" + url + "-result-" + e.getMessage(), e);
            logger.error(e.getMessage(), e);
            return result;
        }
    }

}
