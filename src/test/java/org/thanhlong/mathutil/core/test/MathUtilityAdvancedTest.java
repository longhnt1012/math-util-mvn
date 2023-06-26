/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package org.thanhlong.mathutil.core.test;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import static org.thanhlong.mathutil.core.MathUtility.getFactorial;

/**
 *
 * @author Thành Long
 */
public class MathUtilityAdvancedTest {
    
    
    //tạo mảng 2 chiều chứa data sẽ dùng cho việc assertE()
    //gồm n đưa vào và expected trả về
    // int          long-> Object (wrapper class)
    //                               Integer  Long
    public static Object[][] initTestData(){
      Object testData[][] ={{0,1},
                            {1,1},
                            {2,2},
                            {4,24},
                            {5,120}};
      
      return testData;
    }
    @ParameterizedTest
    @MethodSource("initTestData")
                                                         //cột 0    //cột  expected
   public void testFactorialGivenRightArgumentReturnWell(int n, long expected){
       //assertEquals(69,69 );
       assertEquals(expected, getFactorial(n));
      
   }
    
    //nhồi data vào hàm getF()
   
   //TDD: Test Driven Development là kĩ thuật lập trình mà nó 
   // được gắn với việc viết các test case dể kiểm thử ngay những hàm 
   // dev mà mình vừa viết
   // với nhau, 2 màu XANH ĐỎ LIÊN TỤC DIỄN RA
   
   //DDT: sự mở rộng thêm cho quá trình viết code của test (JUnit)
   //   Data Driven Testing
   // kĩ thuật tách bộ test data ra 1 chỗ riêng, tách vào mảng
   // tách vào file Excel, hay table, sau đó so nhồi/fill,map
   // cái data từ mảng này vào trong hàm so san assertEquals()
   // Giúp code dễ đọc hơn, để kiểm tra xem còn thiếu test case 
   // nào hay không
}
