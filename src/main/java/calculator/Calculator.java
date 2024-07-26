package calculator;

import javax.xml.transform.Result;
import java.util.*;


public class Calculator {
    private double lastResult; // 최근 계산 결과를 저장할 필드
    public List<Double> ResultList;

    public Calculator() {
        ResultList = new ArrayList<>();
    }

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

        // 최근 계산 결과 저장
        this.lastResult = result;
        return result;
    }

    // Getter 메서드: lastResult 필드의 값을 반환
    public double getLastResult() {
        return lastResult;
    }

    // Setter 메서드: lastResult 필드의 값을 설정
    public void setLastResult(double lastResult) {
        this.lastResult = lastResult;
    }

    public void removeResult() {
        if (!ResultList.isEmpty()) {
            ResultList.remove(0);
        } else {
            System.out.println("삭제할 결과가 없습니다.");// 처음 저장된 결과를 삭제
        }


    }
}
