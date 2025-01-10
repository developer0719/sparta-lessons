package com.example.calculator2;

import java.util.List;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calculator2 calculator = new Calculator2();

        while (true) {
            System.out.print("첫 번째 숫자를 입력하세요: ");
            int num1 = scanner.nextInt();

            System.out.print("두 번째 숫자를 입력하세요: ");
            int num2 = scanner.nextInt();

            System.out.print("사칙연산 기호를 입력하세요: ");
            char operator = scanner.next().charAt(0);

            double result = calculator.calculate(num1, num2, operator);

            System.out.println("계산 결과는 " + result + "입니다.");
            System.out.println("1. 계산 다시하기 / 2. 결과 조회 / 3. 첫 번째 결과 제거 / 4. 종료(exit 입력)");

            int next = scanner.nextInt();

            if (next == 2) {
                List<Double> resultList = calculator.getResultList();
                for (Double v : resultList) {
                    System.out.println("저장된 결과: " + v);
                }
            } else if (next == 3) {
                calculator.removeResult();
            } else if (next == 4) {
                break;
            } else {
                throw new IllegalArgumentException("잘못된 입력입니다.");
            }
        }
    }
}
