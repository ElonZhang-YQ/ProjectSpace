package com.ez.lettor.engine.text;

/**
 * This class created on 6/29/2020
 *
 * @author Elon.Zhang
 */
public class StringTest {
    
    public static void main(String[] args) {
    
        String str1 = "头文字";
        StringBuffer stbf = new StringBuffer(str1).append(": D");
        System.out.println(str1);
        str1 = stbf.toString();
        System.out.println(str1);
    }
}
