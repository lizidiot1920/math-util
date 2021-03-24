/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.na.mathutils;

/**
 *
 * @author DELL
 */
public class MathUtility {

    //Class nay chua 1 nhom ham tpoan hoc ,fake tu class chuan
    //java.util.Math cua JDK
    //vi la do xai chung cho nen se la static
    public static final double PI = 3.1415;

    //ham tinh n!
    //long chiu duoc 10^18 con so 0.Lon hon nua la thua
    //am giai thua ko tinh dc
    //ham chi chap nhan tu 0..20->long 
    public static long getFactorial(int n) {
        if (n < 0 || n > 20) {
            throw new IllegalArgumentException("Invalid argument. "
                    + "n must tbe between 0..20");
        }
        if (n == 0 || n == 1) {
            return 1;
        }
        long result = 1;
        for (int i = 2; i <= n; i++) {
            result *= i;
        }

        return result;
    }
}
