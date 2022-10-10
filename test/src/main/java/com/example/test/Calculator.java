package com.example.test;

import com.example.test.calculate.*;

import java.util.List;


public class Calculator {

    private static final List<NewArithmeticOperator> arithmeticOperators = List.of(
            new AdditionOperator(), new SubstrationOperator(),
            new MultiplicationOperator(), new DivisionOperator()
    );

//    public static int calculate(int operand1, String operator, int operand2) {
public static int calculate(PositiveNumber operand1, String operator, PositiveNumber operand2) {

    //  return ArithmeticOperator.calculate(operand1, operator, operand2);
        return arithmeticOperators.stream()
                .filter(arithmeticOperator -> arithmeticOperator.supports(operator))
                .map(arithmeticOperator -> arithmeticOperator.calculate(operand1, operand2))
                .findFirst()
                .orElseThrow(() -> new IllegalArgumentException("올바른 사칙 연산이 아닙니다"));
    }

}
