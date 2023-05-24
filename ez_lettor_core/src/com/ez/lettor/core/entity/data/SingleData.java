package com.ez.lettor.core.entity.data;

import com.ez.lettor.exception.LettorException;

/**
 * This class created on 2019-03-04
 * <p>
 * 对应当前期数中的某一个数据的对象
 *
 * @author Elon.Zhang
 */
public interface SingleData {

    /**
     * 获取十位数值
     *
     * @return
     */
    int getFirstData();

    /**
     * 获取个位数值
     *
     * @return
     */
    int getEndData();

    /**
     * 设置十位数值
     */
    void setFirstData(int firstData);

    /**
     * 设置个位数值
     */
    void setEndData(int endData);

    /**
     * 检查数值状态
     *
     * @return
     */
    boolean checkDataStatus();

    /**
     * 是否是偶数
     *
     * @return
     */
    boolean isEvenNumber() throws LettorException;

    /**
     * 将对象输出成一个String的值进行输出
     *
     * @return
     */
    String convert2Print();
}
