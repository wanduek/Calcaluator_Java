package calculator;

public class MultiplyOperator implements Operation {
        @Override
        public double operate(double num1, double num2) {
            return num1 * num2; //곱하기 연산자
        }
    }
