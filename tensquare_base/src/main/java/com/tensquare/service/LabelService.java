package com.tensquare.service;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.tensquare.dao.LabelDao;
import com.tensquare.pojo.Label;

import java.util.List;

/**
 * @Author:wzp
 * @Date:Created in 9:18 PM 2019/5/16
 * @Description:
 */
@Service
public class LabelService {

    @Resource
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

    public List<Label> findAllLabel() {
        return labelDao.findAllLabel();
    }
}
