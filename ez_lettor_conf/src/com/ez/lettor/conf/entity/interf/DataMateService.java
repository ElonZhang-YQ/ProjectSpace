package com.ez.lettor.conf.entity.interf;

import com.ez.lettor.core.entity.datamate.DataMate;

import java.util.List;

/**
 * This class created on 10/23/2019
 *
 * @author Elon.Zhang
 */
public interface DataMateService<T extends DataMate> {
    
    /**
     * 获取指定位置的数据
     *
     * @param id
     * @return
     */
    T getFingerData(int id);
    
    /**
     * 获取所有的数据信息
     *
     * @return
     */
    List<T> getAllData();
    
    /**
     * 更新单个数据信息
     * 但是不一定会用到
     *
     * @param updateMate
     * @return
     */
    boolean modifySingleData(DataMate updateMate);
    
    /**
     *
     * @param id
     * @return
     */
    boolean deleteSingleData(String id);
    
}
