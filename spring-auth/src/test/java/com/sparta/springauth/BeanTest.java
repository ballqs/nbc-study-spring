package com.sparta.springauth;

import com.sparta.springauth.food.Food;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class BeanTest {

    // 이름만으로도 해당 껄 지정해서 가져올수 있음
    // 단! primary가 지정되어 있다면 지정된 것을 가져와 주입함
    @Autowired
    Food pizza;

    @Autowired
    Food chicken;

    // Qualifier가 primary 보다 더 우선시 댐
    @Qualifier("pizza")
    @Autowired
    Food food;

    @Test
    @DisplayName("테스트")
    void test1() {
        pizza.eat();
        chicken.eat();
        food.eat();
    }

}
