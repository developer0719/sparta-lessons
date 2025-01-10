package com.example.calculator;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.print("첫 번째 숫자를 입력하세요: ");
            int num1 = scanner.nextInt();

            System.out.print("두 번째 숫자를 입력하세요: ");
            int num2 = scanner.nextInt();

            System.out.print("사칙연산 기호를 입력하세요: ");
            char operator = scanner.next().charAt(0);

            int result = 0;
            if (operator == '+') {
                result = num1 + num2;
            } else if (operator == '-') {
                result = num1 - num2;
            } else if (operator == '*') {
                result = num1 * num2;
            } else if (operator == '/') {
                if (num2 == 0) {
                    System.out.println("나눗셈 연산에서 분모(두번째 정수)에 0이 입력될 수 없습니다. \n프로그램을 종료합니다.");
                    break;
                } else {
                    result = num1 / num2;
                }
            } else {
                System.out.println("유효하지 않은 연산자입니다.\n프로그램을 종료합니다.");
                break;
            }

            System.out.println("계산 결과는 " + result + "입니다.");
            System.out.println("더 계산하시겠습니까? (exit 입력 시 종료)");
        } while (!scanner.next().equals("exit"));
    }
}
