/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.na.mathutil.main;

import com.na.mathutils.MathUtility;

/**
 *
 * @author DELL
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //tui muon test 5! co dung 120 ko
        int n = 5;
        long expected = 120;
        long actual = MathUtility.getFactorial(n);//thuc te ham chay lam bn? ss ?
        System.out.println("5! expected: " + expected
                + ";actual: " + actual);

        //tui muon test 0! co dung la 1 ko
        System.out.println("");
        n = 0;
        expected = 120;
        actual = MathUtility.getFactorial(n);//thuc te ham chay lam bn? ss ?
        System.out.println("5! expected: " + expected
                + ";actual: " + actual);
    }

}

//viet code xong thi phai test code
//test ngay tung ham tung class truoc khi rap chung voi cac class khac
//test ngay sau khi xog ham ,xong class duoc goi la test muc do 1 , 
//muc Unit Test(test muc don vi code)
//Lam sao de test. Co nhieu cach
//1. Cach 1: sout(goi ham()) de in ra ket qua xu li cua ham
//2. Cach 2: JOptionPane de popup len ket qua xu li cua ham
//3. Cach 3: Ghi ra LOG file, ra 1 trang web
//4. Cach 4: Computer oi so sanh dum va ket luan dum luon 
//Con nguoi ko can nhin tung dong ket qua de luan dung sai,may se lo cho
//Neu tat ca tinh huong chay ham deu dung -> ham dung -> mau xanh
//Hau het tinh huong chay ham deu dung, co 1 cai sai -> ham sai -> mau do
//Do: Chi can 1 th sai
//Xanh: Tat ca phai deu dung
//Muon lam duoc deu nay ta can thu vien phu tro giup cho java xanh do
//Dieu nay cung co ben C# PHP JS, Ruby...
//Java: JUnit , TestNG
//C# : NUnit , xUnit, MSTest
// 3 cach nay deu phai dung mat de xem ket qua,va tu ket luan dung sai
//*dung: tuc la ham chay ra 1 gia tri-ACTUAL VALUE
//va ta thay ACTUAL VALUE khop,bang voi cai gia tri ma ta mong doi
//,ta tinh truoc = tay,goi la EXPECTED VALUE
//vi du 5! thi ta hy vong expected ham tra ve 120 
//nhung ham tra ve dung 120 - actual
//ham chay dung cho 5!
//*sai: test 6! ,expected = 720, run actual = 120
//ham xu li sai 

