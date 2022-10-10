package com.example.test;

import com.example.test.calculate.PositiveNumber;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.assertj.core.api.Assertions.assertThatCode;

public class PositiveNumberTest {

//    @Test
//    void createTest() {
//        assertThatCode(()-> new PositiveNumber(0))
//                .isInstanceOf(IllegalArgumentException.class)
//                .hasMessage("0 또는 음수를 전달 할 수 없습니다");
//    }

    @ParameterizedTest
    @ValueSource(ints = {0 , -1})
    void createTest(int value) {
        assertThatCode(()-> new PositiveNumber(value))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage("0 또는 음수를 전달 할 수 없습니다");
    }


}
