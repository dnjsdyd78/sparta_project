package calculator;

import java.util.ArrayList;

public class Calculator {
    /* 연산 결과를 저장하는 컬렉션 타입 필드 선언 및 생성 */
    int result;
    ArrayList<Integer> numbers = new ArrayList<Integer>();
    Exception divide = new Exception();


    public int calculate(int num1, int num2, char operator) {
        //매개변수값에 따라 연산진행

        switch (operator) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                // 나눗셈연산 예외발생시 정의해둔 예외문 출력
                try {
                    result = divide.exception(num1, num2);
                } catch (IllegalArgumentException e) {
                    System.out.println(e.getMessage());
                }
        }
        /* 연산 결과값 리스틍레 저장 */
        numbers.add(result);
        return result;
    }
}