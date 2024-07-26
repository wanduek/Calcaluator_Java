package calculator;

import java.util.ArrayList;
import java.util.List;

public class Calculator {
    private double lastResult; // 최근 계산 결과를 저장할 필드
    private List<Double> resultList; // 결과를 저장할 리스트

    // 생성자: resultList 초기화
    public Calculator() {
        this.resultList = new ArrayList<>();
    }

    // 계산 메서드
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
        resultList.add(result); // 결과를 리스트에 저장
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

    // 결과 삭제 메서드
    public void removeResult() {
        if (!resultList.isEmpty()) {
            resultList.remove(0); // 처음 저장된 결과를 삭제
        } else {
            System.out.println("삭제할 결과가 없습니다.");
        }
    }

    // 저장된 결과 조회 메서드
    public void inquiryResult() {
        if (resultList.isEmpty()) {
            System.out.println("저장된 결과가 없습니다.");
        } else {
            System.out.println("저장된 연산결과:"); // 리스트에서 값을 불러온다
            for (Double item : resultList) {
                System.out.println(item);
            }
        }
    }
}
