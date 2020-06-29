package com.ez.lettor.core.entity.datamate;

import com.ez.lettor.core.entity.data.LettorId;
import com.ez.lettor.core.entity.data.SingleData;
import com.ez.lettor.core.entity.type.LettorType;

import java.util.List;

/**
 * This class created on 2019/2/13
 * <p>
 * 这个类为数据对象的接口类
 * 将一个数据对象分成两个部分：
 * 1.前面的部分为常规数
 * 2.后面的部分为特殊数
 * <p>
 * 接口提供：
 * 1.直接获取常规数集合
 * 2.直接获取特殊数集合
 * 3.获取当前数据对象的长度
 * 4.根据下标获取当前数据对象中的数据信息
 * 5.获取数据的类型
 *
 * @author Elon.Zhang
 */
public interface DataMate<T> extends LettorId {
    
    /**
     * 获取常规数集合
     *
     * @return
     */
    List<T> getNormalData();
    
    /**
     * 获取特殊数集合
     *
     * @return
     */
    List<T> getSpecialData();
    
    /**
     * 获取当前数据对象的长度
     *
     * @return
     */
    int getLength();
    
    /**
     * 根据对应的下标获取对应下标的数字
     *
     * @param index
     * @return
     */
    T getNumber(int index);
    
    /**
     * 获取当前的数据类型，是福彩还是体彩
     *
     * @return
     */
    LettorType getLettorType();
    
    /**
     * 获取当前彩票的具体类型
     *
     * @return
     */
    int getDataType();
    
    /**
     * 检查数据的格式是否正确
     *
     * @return
     */
    boolean checkData();
    
    /**
     * 设置常规数
     *
     * @param normalDatas
     */
    void setNormalDatas(List<SingleData> normalDatas);
    
    /**
     * 设置特殊数
     *
     * @param specialDatas
     */
    void setSpecialDatas(List<SingleData> specialDatas);
    
    /**
     * 设置数组长度
     *
     * @param dataLength
     */
    void setdataLength(int dataLength);
    
    /**
     * 设置当前彩票的数据类型
     * TODO 需要声明不同的类型数组
     *
     * @param lettorType
     */
    void setLettorType(LettorType lettorType);
    
    /**
     * 设置数据为某个大类彩票下面的哪个小类型
     *
     * @param dataType
     */
    void setDataType(int dataType);
}
