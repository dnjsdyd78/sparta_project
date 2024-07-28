package calculator;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String restart;
        int[] numbers = new int[10];
        int i = -1;
        int count = 0;

        do {
            ++i;
            System.out.print("첫 번째 숫자를 입력하세요: ");
            int num1 = sc.nextInt();
            System.out.print("두 번째 숫자를 입력하세요: ");
            int num2 = sc.nextInt();

            System.out.print("사칙연산 기호를 입력하세요: "); // +, -, *, /

            // charAt(index)은 괄호안 문자열의 위치를 받아 해당 데이터의 타입을 char 타입으로 반환하는 메서드
            // 입력된 값에 따라 변수에 기호값 저장

            char operator = sc.next().charAt(0);

            switch (operator) {
                case '+':
                    System.out.println("첫 번째 숫자값 : " + num1 + " / " + "두 번째 숫자 값 : " + num2);
                    System.out.println("기호값: " + operator);
                    System.out.println("결과값: " + (num1 + num2));
                    numbers[i] = num1 + num2;
                    break;

                case '-':
                    System.out.println("첫 번째 숫자값 : " + num1 + " / " + "두 번째 숫자 값 : " + num2);
                    System.out.println("기호값: " + operator);
                    System.out.println("결과값: " + (num1 - num2));
                    numbers[i] = num1 - num2;
                    break;

                case '*':
                    int result = num1 - num2;
                    System.out.println("첫 번째 숫자값 : " + num1 + " / " + "두 번째 숫자 값 : " + num2);
                    System.out.println("기호값: " + operator);
                    System.out.println("결과값: " + (num1 * num2));
                    numbers[i] = num1 * num2;
                    break;

                case '/':
                    if (num1 == 0 || num2 == 0) {
                        System.out.println("나눗셈연산은 0을 입력할 수 없습니다");
                        break;
                    } else {
                        System.out.println("첫 번째 숫자값 : " + num1 + " / " + "두 번째 숫자 값 : " + num2);
                        System.out.println("기호값: " + operator);
                        System.out.println("결과값: " + (num1 / num2));
                        numbers[i] = num1 / num2;
                        break;
                    }

                default:
                    System.out.println("입력된 기호값이 올바르지 않습니다.");
            }


            System.out.print("더 계산하시겠습니까? (exit 입력 시 종료)");
            restart = sc.next();

            // 반복횟수 카운트
            ++count;
            System.out.println("반복횟수:" + count);
        }
        while (!restart.equals("exit"));
        System.out.println("계산종료");

        // 저장된 값 출력
        for (int number : numbers) {
            System.out.println(number);
        }

    }
}