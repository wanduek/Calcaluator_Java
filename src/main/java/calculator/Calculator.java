package calculator;

public class Calculator {

    public double calculate(String operator, double num1, double num2) {
        double result = 0;

        try {
            // 사칙연산 switch
            switch (operator) {
                case "+":
                    result = num1 + num2; // 더하기 연산
                    break;
                case "-":
                    result = num1 - num2; // 빼기 연산
                    break;
                case "*":
                    result = num1 * num2; // 곱하기 연산
                    break;
                case "/":  // 나누기 연산
                    if (num2 == 0) {
                        throw new ArithmeticException("0으로 나눌 수 없습니다.");
                    }
                    result = num1 / num2;
                    break;
                default:
                    System.out.println("유효하지 않은 연산자입니다. 다시 입력하세요.");
                    return Double.NaN; // 유효하지 않은 연산자
            }
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage()); // 예외 메시지 출력
            return Double.NaN; // Not a Number
        }

        return result;
    }
}
