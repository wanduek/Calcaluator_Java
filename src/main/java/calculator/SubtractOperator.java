package calculator;

public class SubtractOperator implements Operation {
    @Override
    public double operate(double num1, double num2) {
        return num1 - num2; //빼기 연산자
    }
}
