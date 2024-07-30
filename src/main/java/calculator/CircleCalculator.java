package calculator;

public class CircleCalculator extends Calculator {//Calculator를 통해 상속 받음

    public final double PI = 3.14159265358979323846; //파이값 고정

    public double calculateCircleAre(double radius) {
        double circleresult = 0;
        if (radius > 0) {
            circleresult = radius * radius * PI; //원의 넓이
        } else {
            System.out.println("유효하지 않은 반지름입니다. 다시 입력하세요."); //반지름이 0보다 작을경우 유효한 값이 아니므로 리턴됨
            return Double.NaN; // 유효하지 않은 반지름
        }
        // 최근 원넓이 계산 결과 저장
        addResult(circleresult); //결과값이 나오면 circleresult에 결과 값을 추가한다
        return circleresult; //circleresult 값 리턴
    }

}
