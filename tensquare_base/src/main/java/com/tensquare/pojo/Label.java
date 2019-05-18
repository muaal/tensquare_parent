package com.tensquare.pojo;

import java.io.Serializable;
import lombok.Data;

/**
 * @Author:wzp
 * @Date:Created in 2:57 PM 2019/5/18
 * @Description:
 */
@Data
public class Label implements Serializable {
    /**
    * 标签ID
    */
    private String id;

    /**
    * 标签名称
    */
    private String labelName;

    /**
    * 状态
    */
    private String state;

    /**
    * 使用数量
    */
    private Long count;

    /**
    * 是否推荐
    */
    private String recommend;

    /**
    * 粉丝数
    */
    private Long fans;

    private static final long serialVersionUID = 1L;
}