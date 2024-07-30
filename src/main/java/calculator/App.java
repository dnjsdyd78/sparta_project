package calculator;

import java.util.ArrayList;
import java.util.Scanner;

public class App extends Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String restart;
        String result;

        //Calculator 클래스 인스턴스 생성
        Calculator calculator = new Calculator();

        ArrayList<Integer> numbers = new ArrayList<Integer>();
        int count = 0;
        String remove;

        do {
            //연산자와 피연산자의 값을 입력받는 코드
            System.out.print("첫 번째 숫자를 입력하세요: ");
            int num1 = sc.nextInt();
            System.out.print("두 번째 숫자를 입력하세요: ");
            int num2 = sc.nextInt();

            System.out.print("사칙연산 기호를 입력하세요: "); // +, -, *, /
            // charAt(index)은 괄호안 문자열의 위치를 받아 해당 데이터의 타입을 char 타입으로 반환하는 메서드
            // 입력된 값에 따라 사칙연산 변수를 정의
            char operator = sc.next().charAt(0);

            //Caluculator 클래스를 통해 연산실행과 리턴값 출력
            numbers.add(calculator.calculate(num1, num2, operator));

            //나눗셈 연산 예외문 발생시 중복값 저장 발생방지
            if (num1 == 0 || num2 == 0){
                numbers.remove(numbers.size()-1);
            }

            // 입력된 조건에 따라 가장 먼저 저장된 값을 삭제
            System.out.print("가장 먼저 저장된 연산 결과를 삭제하시겠습니까? (remove 입력 시 삭제)");
            remove = sc.next();
            if(remove.equals("remove")){
                numbers.remove(0);
            }

            // 입력된 값에 따라 저장된 결과값 출력
            System.out.print("저장된 연산결과를 조회하시겠습니까? (inquiry 입력 시 조회)");
            result = sc.next();
            if(result.equals("inquiry")){
                for (int number : numbers) {
                    System.out.println(number);
                }
            }


            //입력된 조건에 따라 계산추가실행
            System.out.print("더 계산하시겠습니까? (exit 입력 시 종료)");
            restart = sc.next();

            // 반복횟수 카운트
            ++count;
            System.out.println("반복횟수:" + count);

        }

        // 입력값의 조건에 따라 반복문을 끝내는 코드
        while (!restart.equals("exit"));
        System.out.println("계산종료");



    }
}