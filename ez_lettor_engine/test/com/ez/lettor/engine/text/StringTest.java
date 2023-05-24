package com.ez.lettor.engine.text;

import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/**
 * This class created on 6/29/2020
 *
 * @author Elon.Zhang
 */
public class StringTest {

    @Test
    public void main() {
    
        int[] A = new int[]{5,3,1,3,2,3};
        int r  = solution(A);
        System.out.println(r);
    }


    private int solution(int[] A) {
        // write your code in Java SE 8
        /*
            put data in hashmap
            key as segments`s sums
            value as same sums collect
        */
        int rst = 0;
        HashMap<Integer, List<int[]>> valueNumsMap = new HashMap<Integer, List<int[]>>();
        for (int i = 0; i < A.length - 1; i++) {
            int j = i + 1;
            int tempSum = A[i] + A[j];
            int[] tempArr = new int[]{i, j};
            if (!valueNumsMap.containsKey(tempSum)) {
                valueNumsMap.put(tempSum, new ArrayList<int[]>());
            }
            if (!hasIndex(tempArr, valueNumsMap.get(tempSum))) {
                valueNumsMap.get(tempSum).add(tempArr);
            }

        }

        Iterator<Integer> iterator = valueNumsMap.keySet().iterator();
        while (iterator.hasNext()) {
            int sumSize = valueNumsMap.get(iterator.next()).size();
            if (sumSize > rst) {
                rst = sumSize;
            }
        }
        return rst;
    }

    private boolean hasIndex(int[] arr, List<int[]> target) {

        for (int[] arrs : target) {
            if (arr[0] == arrs[0] || arr[0] == arrs[1] || arr[1] == arrs[0] || arr[1] == arrs[1]) {
                return true;
            }
        }
        return false;
    }
}
