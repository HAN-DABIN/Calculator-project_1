package calculatorStep2;

import java.util.ArrayList;
import java.util.List;

public class Calculator2 {

    // 연산 결과를 저장하는 컬렉션 타입 필드를 외부에서 직접 접근 하지 못하도록 수정 - 캡슐화
    private List<Integer> results = new ArrayList<>();

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
        // 연산 결과 저장
        history(result);
        // 반환값
        return result;
    }
    // 세터 - 연산 결과 추가
    private void history(int result) {
        results.add(result);
    }

    public List<Integer> getResults() {
        return new ArrayList<>(results);
    }

}