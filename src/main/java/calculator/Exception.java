package calculator;

public class Exception {
    public int exception(int num1, int num2) throws IllegalArgumentException {
        if (num1 == 0 || num2 == 0) {
            throw new IllegalArgumentException("나눗셈은 피연산자의 값이 0이 될 수 없습니다.");
        }
        return num1 / num2;
    }
}
