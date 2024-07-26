package calculator;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Calculator calculator = new Calculator();

        while (true) {
            System.out.println("사칙연산 or 원의 넓이 (press: 1 사칙연산, press: 2 원의 넓이, exit: 종료)");
            String choosemath = sc.nextLine();

            if (choosemath.equals("1")) {
                while (true) {
                    System.out.println("첫 번째 숫자를 입력하세요:");
                    double num1 = sc.nextDouble();

                    System.out.println("두 번째 숫자를 입력하세요:");
                    double num2 = sc.nextDouble();

                    sc.nextLine(); // num1, num2 뒤의 줄 바꿈 문자 처리
                    System.out.println("사칙연산의 기호를 입력하세요 (+, -, *, /)");
                    String operator = sc.nextLine();

                    if (operator.length() != 1) {
                        System.out.println("유효하지 않은 연산자입니다. 다시 입력하세요");
                        continue;
                    }

                    double result = calculator.calculate(operator, num1, num2);

                    if (Double.isNaN(result)) {
                        continue; // 오류가 발생했으므로 루프의 시작으로 돌아감
                    }

                    System.out.println("계산 결과는: " + result);

                    // 추가 명령어 처리
                    System.out.println("가장 먼저 저장된 연산 결과를 삭제하시겠습니까? (remove 입력)");
                    String std = sc.nextLine();
                    if (std.equalsIgnoreCase("remove")) {
                        calculator.removeResult();
                        System.out.println("첫 번째 결과값이 삭제되었습니다.");
                    }

                    // 저장된 연산결과 조회
                    System.out.println("저장된 연산결과를 조회 (inquiry 입력 시 조회)");
                    String stf = sc.nextLine();
                    if (stf.equalsIgnoreCase("inquiry")) {
                        calculator.inquiryResult();
                    }

                    System.out.println("계속 진행하시겠습니까? (yes: 계속, no: 종료)");
                    String continueChoice = sc.nextLine();
                    if (continueChoice.equalsIgnoreCase("no")) {
                        break; // 사칙연산 모드 종료
                    }
                }
            } else if (choosemath.equals("2")) {
                while (true) {
                    System.out.println("반지름을 입력하세요:");
                    double radius = sc.nextDouble();

                    sc.nextLine(); // num1, num2 뒤의 줄 바꿈 문자 처리

                    double crresult = calculator.calculateCircleAre(radius);

                    if (Double.isNaN(crresult)) {
                        continue; // 오류가 발생했으므로 루프의 시작으로 돌아감
                    }

                    System.out.println("계산 결과는: " + crresult);

                    // 추가 명령어 처리
                    System.out.println("가장 먼저 저장된 원 넓이 결과를 삭제하시겠습니까? (remove 입력)");
                    String sta = sc.nextLine();
                    if (sta.equalsIgnoreCase("remove")) {
                        calculator.crremoveResult();
                        System.out.println("첫 번째 결과값이 삭제되었습니다.");
                    }

                    // 저장된 원 넓이 결과 조회
                    System.out.println("저장된 원 넓이 결과를 조회 (inquiry 입력 시 조회)");
                    String stb = sc.nextLine();
                    if (stb.equalsIgnoreCase("inquiry")) {
                        calculator.crinquiryResult();
                    }2

                    System.out.println("계속 진행하시겠습니까? (yes: 계속, no: 종료)");
                    String continueChoice = sc.nextLine();
                    if (continueChoice.equalsIgnoreCase("no")) {
                        break; // 원 넓이 모드 종료
                    }
                }
            } else if (choosemath.equalsIgnoreCase("exit")) {
                System.out.println("계산 종료");
                break; // 전체 프로그램 종료
            } else {
                System.out.println("유효하지 않은 입력입니다. 다시 시도해 주세요.");
            }
        }

        sc.close(); // Scanner 자원 해제
    }
}
