package calculator;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("첫 번째 숫자를 입력하세요: ");
        int num1 = sc.nextInt();
        System.out.print("두 번째 숫자를 입력하세요: ");
        int num2 = sc.nextInt();

        System.out.print("사칙연산 기호를 입력하세요: "); // +, -, *, /
        // charAt(index)은 괄호안 문자열의 위치를 받아 해당 데이터의 타입을 char 타입으로 반환하는 메서드
        char operator = sc.next().charAt(0);



        System.out.println("첫 번째 숫자값 : " + num1 + " / " + "두 번째 숫자 값 : " + num2);
        System.out.println("기호값: " + operator);
    }
}