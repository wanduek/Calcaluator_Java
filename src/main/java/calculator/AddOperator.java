package calculator;

public class AddOperator implements Operation {
    @Override
    public double operate(double num1, double num2) {
        return num1 + num2;
    } //더하기 연산자