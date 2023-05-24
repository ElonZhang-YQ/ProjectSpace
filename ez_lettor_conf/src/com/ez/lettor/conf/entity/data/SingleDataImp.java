package com.ez.lettor.conf.entity.data;

import com.ez.lettor.core.entity.data.SingleData;
import com.ez.lettor.exception.LettorException;
import com.ez.lettor.exception.data.LettorInvalidateDataException;

/**
 * This class created on 2019-03-04
 *
 * @author Elon.Zhang
 */
public class SingleDataImp implements SingleData {

    private int firstData;

    private int endData;

    public SingleDataImp() {

    }

    public SingleDataImp(int firstData, int endData) {

        this.firstData = firstData;
        this.endData = endData;
    }

    @Override
    public int getFirstData() {

        return this.firstData;
    }

    @Override
    public void setFirstData(int firstData) {

        this.firstData = firstData;
    }

    @Override
    public int getEndData() {

        return this.endData;
    }

    @Override
    public void setEndData(int firstData) {

        this.endData = endData;
    }

    /**
     * 检查数据是否合法化
     *
     * @return
     */
    @Override
    public boolean checkDataStatus() {

        return !(firstData == 0 && endData == 0);
    }

    /**
     * 检查是否是偶数
     *
     * @return
     */
    @Override
    public boolean isEvenNumber() throws LettorException {

        if (checkDataStatus()) {
            return endData % 2 == 0;
        }
        throw new LettorInvalidateDataException("InvalidateNumber");
    }

    @Override
    public String convert2Print() {

        return Integer.toString(firstData) + Integer.toString(endData);
    }
}
