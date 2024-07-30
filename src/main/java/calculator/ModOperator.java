package calculator;

public class ModOperator implements Operation{ //나누기 몫 연산자
    @Override
    public double operate(double num1, double num2) {
        if (num2 == 0) {
            throw new ArithmeticException("0으로 나눌 수 없습니다.");
        } //num2가 0일때 발산이 되므로 throw통해 예외처리를 하였다.
        return num1%num2;
    }

}
