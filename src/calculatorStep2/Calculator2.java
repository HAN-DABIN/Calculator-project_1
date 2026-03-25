package calculatorStep2;

import java.util.ArrayList;
import java.util.List;

public class Calculator2 {

    // 연산 결과를 저장하는 컬렉션 타입 필드를 외부에서 직접 접근 하지 못하도록 수정 - 캡슐화
    private ArrayList<Integer> resultList = new ArrayList<>();

    // 연산 수행 메서드 생성
    public int calculate(int num1, int num2, char operator) {
        int result = 0;

        // 계산 수행
        if (operator == '+') {
            result = num1 + num2;
        } else if (operator == '-') {
            result = num1 - num2;
        } else if (operator == '*') {
            result = num1 * num2;
        } else if (operator == '/') {
            result = num1 / num2;
        }
        resultList.add(result);
        return result;
    }
    // getter
    public List<Integer> getResult() {
    return this.resultList;
    }
    // setter

    // 첫번째 기록 삭제
    public void removeResult() {
        if (!resultList.isEmpty()) {
            resultList.remove(0);
            System.out.println("현재 저장된 결과는 " + resultList + "입니다.");
        } else {
            System.out.println("삭제할 결과가 없습니다.");
        }
    }
}




