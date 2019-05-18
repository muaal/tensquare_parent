package com.tensquare.dao;

import com.tensquare.pojo.Label;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @Author:wzp
 * @Date:Created in 9:18 PM 2019/5/16
 * @Description:
 */
@Mapper
public interface LabelDao {
    int deleteByPrimaryKey(String id);

    int insert(Label record);

    int insertSelective(Label record);

    Label selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(Label record);

    int updateByPrimaryKey(Label record);


    List<Label> findAllLabel();

}