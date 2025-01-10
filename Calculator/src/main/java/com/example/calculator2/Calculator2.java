package com.example.calculator2;

import java.util.ArrayList;
import java.util.List;

public class Calculator2 {

    private final List<Double> resultList = new ArrayList<>();

    public double calculate(int num1, int num2, char operator) {
        double result;

        if (operator == '+') {
            result = num1 + num2;
        } else if (operator == '-') {
            result = num1 - num2;
        } else if (operator == '*') {
            result = num1 * num2;
        } else if (operator == '/') {
            if (num2 == 0) {
                throw new IllegalStateException("나눗셈 연산에서 분모(두번째 정수)에 0이 입력될 수 없습니다. \n프로그램을 종료합니다.");
            } else {
                result = (double) num1 / num2;
            }
        } else {
            throw new IllegalStateException("유효하지 않은 연산자입니다.\n프로그램을 종료합니다.");
        }

        resultList.add(result);
        return result;
    }

    public List<Double> getResultList() {
        return resultList;
    }

    public void setResultList(double value) {
        resultList.add(value);
    }

    public void removeResult() {
        resultList.remove(0);
    }
}
