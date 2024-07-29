package calculator;

public class ArithmeticCalculator extends Calculator {
    private Operation addOperator;
    private Operation subtractOperator;
    private Operation multiplyOperator;
    private Operation divideOperator;
    private Operation modOperator;

    public ArithmeticCalculator() {
        this.addOperator = new AddOperator();
        this.subtractOperator = new SubtractOperator();
        this.multiplyOperator = new MultiplyOperator();
        this.divideOperator = new DivideOperator();
        this.modOperator = new ModOperator(); // 새로운 연산자 추가
    }

    public double calculate(String operator, double num1, double num2) {
        double result = 0;

        try {
            switch (operator) {
                case "+":
                    result = addOperator.operate(num1, num2);
                    break;
                case "-":
                    result = subtractOperator.operate(num1, num2);
                    break;
                case "*":
                    result = multiplyOperator.operate(num1, num2);
                    break;
                case "/":
                    result = divideOperator.operate(num1, num2);
                    break;
                case "%":  // 나머지 연산 추가
                    result = modOperator.operate(num1, num2);
                    break;
                default:
                    System.out.println("유효하지 않은 연산자입니다. 다시 입력하세요.");
                    return Double.NaN; // 유효하지 않은 연산자
            }
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage()); // 예외 메시지 출력
            return Double.NaN; // Not a Number
        }

        addResult(result);
        return result;
    }
}
