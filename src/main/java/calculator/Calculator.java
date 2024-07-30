package calculator;

import java.util.ArrayList;
import java.util.List;

public class Calculator {
    private ArrayList<Double> resultList;

    public Calculator() {
        this.resultList = new ArrayList<>();

    }

    public List<Double> getResultList() {
        return resultList;
    }

    public void addResult(double result) {
        resultList.add(result);
    }

    public void removeResult() { //처음나온 결과 값 삭제
        if (!resultList.isEmpty()) {
            resultList.remove(0); // 처음 저장된 결과를 삭제
        } else {
            System.out.println("삭제할 결과가 없습니다."); //결과 값이 없을때
        }
    }

    // Placeholder methods to be overridden by subclasses if needed
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