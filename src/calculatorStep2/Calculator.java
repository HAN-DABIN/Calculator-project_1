package calculatorStep2;

public class Calculator {

    // 연산 기록 저장 캡슐화
    private ,,,,,,,,,,,,,,,,,


        // 연산 수행 메서드 생성
        public int calculate (int num1, int num2, char operator) {
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
            // 반환값
            return result;
        }

    }

}
