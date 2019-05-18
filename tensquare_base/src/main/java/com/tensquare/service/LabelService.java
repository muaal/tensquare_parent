package com.tensquare.service;

import com.tensquare.dao.LabelDao;
import com.tensquare.pojo.Label;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author:wzp
 * @Date:Created in 2:57 PM 2019/5/18
 * @Description:
 */
@Service
public class LabelService{

    @Autowired
    private LabelDao labelDao;

    
    public int deleteByPrimaryKey(String id) {
        return labelDao.deleteByPrimaryKey(id);
    }

    
    public int insert(Label record) {
        return labelDao.insert(record);
    }

    
    public int insertSelective(Label record) {
        return labelDao.insertSelective(record);
    }

    
    public Label selectByPrimaryKey(String id) {
        return labelDao.selectByPrimaryKey(id);
    }

    
    public int updateByPrimaryKeySelective(Label record) {
        return labelDao.updateByPrimaryKeySelective(record);
    }

    
    public int updateByPrimaryKey(Label record) {
        return labelDao.updateByPrimaryKey(record);
    }

    /**
     * 查询所有标签
     * @return List<Label>
     */
    public List<Label> findAllLabel() {
        return labelDao.findAllLabel();
    }
}
