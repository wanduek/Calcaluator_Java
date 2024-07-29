package calculator;

public class CircleCalculator extends Calculator {

    public static final double PI = 3.14159265358979323846;

    public double calculateCircleAre(double radius) {
        double circleresult = 0;
        if (radius > 0) {
            circleresult = radius * radius * PI;
        } else {
            System.out.println("유효하지 않은 반지름입니다. 다시 입력하세요.");
            return Double.NaN; // 유효하지 않은 반지름
        }
        // 최근 원넓이 계산 결과 저장
        addResult(circleresult);
        return circleresult;
    }

}
