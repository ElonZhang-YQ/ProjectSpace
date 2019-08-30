package com.ez.lettor.conf.entity.dao;

import com.ez.lettor.core.entity.datamate.DataMate;

import java.util.List;

/**
 * This class created on 2019/2/13
 * <p>
 * 数据操作实体
 *
 * @author Elon.Zhang
 */
public interface DataMateDAO<T extends DataMate> {
    
    /**
     * 获取所有数据信息
     *
     * @return
     */
    List<T> getData();
    
    /**
     * 获取单个数据信息
     *
     * @param id
     * @return
     */
    T getData(String id);
    
    /**
     * 更新单个数据信息
     *
     * @param dataMate
     */
    void updateData(DataMate dataMate);
    
    /**
     * 更新所有的数据信息
     */
    void updateAllData();
    
    /**
     * 删除所有的数据信息
     */
    void deleteAllData();
    
    /**
     * 删除单条数据信息
     *
     * @param id
     */
    void deleteData(Object id);
    
}
