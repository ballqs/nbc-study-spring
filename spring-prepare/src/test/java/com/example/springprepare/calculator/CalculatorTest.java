package com.example.springprepare.calculator;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

// JUnit
// 1.main같이 실행하는 곳이 없다.
// 2.Test 실행환경을 따로 가지고 있고 서버를 따로 실행시키지 않아도 각각의 테스트 코드를 통해 테스트가능
class CalculatorTest {
    @Test   // Test환경에서 실행시킬 코드다 라고 명시하는 어노테이션
    @DisplayName("더하기 테스트")
    void test1() {
        // 테스트할 객체를 생성
        Calculator calculator = new Calculator();
        // 객체가 가지고 있는 메서드를 호출
        Double result = calculator.operate(8, "+", 2);
        // print 하기
        System.out.println("result = " + result);

        // Assertions.assertEquals(예상하는 값 , 결과값)
        Assertions.assertEquals(10, result);

        // 만약 예상하는 값과 결과값이 틀리게 나온다면 아래와 같이 에러 나옴
        // Expected :11.0
        // Actual   :10.0
        // org.opentest4j.AssertionFailedError: expected: <11.0> but was: <10.0>
    }

    @Test
    @DisplayName("나누기 테스트")
    void test2() {
        Calculator calculator = new Calculator();
        Double result = calculator.operate(8, "/", 2);
        System.out.println("result = " + result);

        Assertions.assertEquals(4, result);
    }
}