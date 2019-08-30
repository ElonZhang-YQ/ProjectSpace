package com.ez.lettor.engine.conf.dao;

import com.ez.lettor.conf.entity.dao.DataMateDAO;
import com.ez.lettor.core.entity.datamate.DataMate;

import java.util.List;

/**
 * This class created on 2019-04-20
 *
 * 引擎层适配配置层的dao操作
 *
 * @author Elon.Zhang
 */
public class DataMateDAOImp implements DataMateDAO<DataMate> {
    
    @Override
    public List getData() {
        
        return null;
    }
    
    @Override
    public DataMate getData(String id) {
        
        return null;
    }
    
    @Override
    public void updateData(DataMate dataMate) {
    
    }
    
    @Override
    public void updateAllData() {
    
    }
    
    @Override
    public void deleteAllData() {
    
    }
    
    @Override
    public void deleteData(Object id) {
    
    }
}
