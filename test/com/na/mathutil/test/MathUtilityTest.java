/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.na.mathutil.test;

import static com.na.mathutils.MathUtility.*; //cac ham bien trong class nay
import java.sql.SQLException;
                                        //go truc tiep ma ko can class cham
                                        //chi static moi co dieu nay                                
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author DELL
 */
public class MathUtilityTest {
    @Test
    public void testFactorialGivenRightArgumentReturnsGoodResult(){
        int n = 5; //tui muon test 5! co dung la 
        long expected = 120; // 120 hay ko
        long actual = getFactorial(n);
        assertEquals(expected, actual);
    
        assertEquals(720, getFactorial(6));
        assertEquals(24, getFactorial(4));
        assertEquals(1, getFactorial(1));
        assertEquals(1, getFactorial(0));
    }
        //test truong hop 2 ko can bien trung gian
        
        //dieu gi xay ra neu ta dua vao tham so am hoac >20
        //theo thieet ke cua ham,dua vao tham so sai se nem ra ngoai le
        //va ta can test xem,tham so sai co dc nem ra ko
        //tuc la neu thay xuat hien ngoai le neu tham so sai dc dua vao->ham dung
        //thay ngoai le -> ham chay dung
    @Test (expected = SQLException.class)
    public void testFactorialWrongArgumentThrowsException() {
        //minh test tinh huong ham phai nem ra ngoai le neu tham so sai
        //ngoai le ko phai la value de so sanh,ko dung assertEquals()
        //Junit 4 khac JUnit 5 o cho bat ngoai le
        getFactorial(-5);
        getFactorial(21);
        getFactorial(40);
        
    }
    
}
