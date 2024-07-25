package calculator;

import java.util.*;
import java.lang.*;

public class App {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        

        while(true){ // exit를 작성하지 않을 경우 계산기는 계속 반복하면서 계산을 한다.
        System.out.println("첫 번째 숫자를 입력하세요:");
        int num1 = sc.nextInt();
        System.out.println("두 번째 숫자를 입력하세요:");
        int num2 = sc.nextInt();

        sc.nextLine(); //num1, num2 줄 모음
        System.out.println("사칙연산의 기호를 입력하세요 (+, -, *,/)");
        char operator = sc.nextLine().charAt(0);

            int result = 0;

            // 사칙연산 스위치//
            switch (operator) {
                case '+':
                    result = num1 + num2;
                    break;
                case '-':
                    result = num1 - num2;
                    break;
                case '*':
                    result = num1 * num2;
                    break;
                case '/':
                    result = num1 / num2;
                default:
                    if (num2 != 0) { //n/0이 계산되지 않게 num2 0일 경우 처음부터 다시하는 경우로 예외처리하였다.)
                        result = num1 / num2;
                    } else {
                        System.out.println("다시하세요");
                        return;
                    }


            }
            System.out.println("결과는 :" + result);

            return result=list;

            System.out.println("계산기 종료(exit 입력 시 종료)"); //exit 작성시 계산기 종료
            String str = sc.nextLine();
            if (str.equalsIgnoreCase("exit")) {
                System.out.println("계산종료");
            } else {
                System.out.println("계산 계속");
            }
        }

        }
    }



