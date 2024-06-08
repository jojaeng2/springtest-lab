package com.example.sample;


import static org.assertj.core.api.AssertionsForClassTypes.*;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class CalculatorTest {

    @Test
    public void 덧셈_연산을_할_수_있다() {
        // given
        long num1 = 2;
        String operator = "+";
        long num2 = 3;
        Calculator calculator = new Calculator();

        // when
        long result = calculator.calculate(num1, operator, num2);

        // then
        assertThat(result).isEqualTo(5);
    }

    @Test
    public void 뺄셈_연산을_할_수_있다() {
        // given
        long num1 = 2;
        String operator = "-";
        long num2 = 3;
        Calculator calculator = new Calculator();

        // when
        long result = calculator.calculate(num1, operator, num2);

        // then
        assertThat(result).isEqualTo(-1);
    }

    @Test
    public void 나눗셈_연산을_할_수_있다() {
        // given
        long num1 = 6;
        String operator = "/";
        long num2 = 3;
        Calculator calculator = new Calculator();

        // when
        long result = calculator.calculate(num1, operator, num2);

        // then
        assertThat(result).isEqualTo(2);
    }

    @Test
    public void 곱셈_연산을_할_수_있다() {
        // given
        long num1 = 2;
        String operator = "*";
        long num2 = 3;
        Calculator calculator = new Calculator();

        // when
        long result = calculator.calculate(num1, operator, num2);

        // then
        assertThat(result).isEqualTo(6);
    }

    @Test
    public void 잘못된_연산자가_요청으로_들어올_경우_에러가_난다() {
        // given
        long num1 = 2;
        String operator = "x";
        long num2 = 3;
        Calculator calculator = new Calculator();

        // when

        // then
        assertThrows(InvalidOperatorException.class, () -> {
            calculator.calculate(num1, operator, num2);
        });
    }
}
