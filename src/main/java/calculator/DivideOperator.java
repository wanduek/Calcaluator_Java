package calculator;

public class DivideOperator implements Operation{
    @Override
    public double operate(double num1, double num2) { // 나누기 연산자
        if (num2 == 0) {
            throw new ArithmeticException("0으로 나눌 수 없습니다.");
        }  // num2가 0일떄 값에 오류가 생기니 예외처리를 하였다.
        return num1 / num2;
    }
}