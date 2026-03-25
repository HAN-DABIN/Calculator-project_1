package calculatorStep2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Calculator2 {

    // 연산 결과를 저장하는 컬렉션 타입 필드를 외부에서 직접 접근 하지 못하도록 수정 - 캡슐화
    private ArrayList<Integer> resultList = new ArrayList<>();

    // 첫 번째 숫자 입력 메서드 생성
    public int firstnum(Scanner scanner, String first) {
        int num1;
        while (true) {
            System.out.println(first);
            num1 = scanner.nextInt();
            // 개행문자 제거
            scanner.nextLine();
            // num2가 0보다 크면 메서드 종료
            if (num1 > 0) {
                return num1;
            } else {
                System.out.println("양의 정수를 입력하세요.");
            }
        }
    }
    // 연산자 입력 메서드 생성
    public char operate(Scanner scanner, String ope) {
        char operator;
        while (true) {
            System.out.println(ope);
            operator = scanner.next().charAt(0);

            // +, -, *, / 입력시 반복문 종료
            if (operator == '+' || operator == '-' || operator == '*' || operator == '/') {
                return operator;
                // 아니면 문구 출력 후 재입력
            } else {
                System.out.println("지원하지 않는 연산자입니다.");
            }
        }
    }
    // 두 번째 숫자 입력 메서드 생성
    public int secondnum(Scanner scanner, String second, char operator) {
        int num2;
        while (true) {
            System.out.println(second);
            num2 = scanner.nextInt();
            // 개행문자 제거
            scanner.nextLine();

            // 연산자가 / 그리고 두 번째로 입력받은 숫자가 0일 때 문장 출력 후 재입력
            if (operator == '/' && num2 == 0) {
                System.out.println("0으로 나눌 수 없습니다. 다른 숫자를 입력해주세요.");
            // num2가 0보다 크면 메서드 종료
            } else if(num2 > 0) {
                return num2;
            } else {
                    System.out.println("양의 정수를 입력하세요.");
                }
            }
        }

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
        // 결과값 resultList에 저장
        resultList.add(result);
        return result;
    }
    // getter - main에서 resultList에 접근하게 해주는 메서드
    public List<Integer> getResult() {
    return this.resultList;
    }

    // 첫번째 기록 삭제 메서드
    public void removeResult() {
        if (!resultList.isEmpty()) {
            resultList.remove(0);
            System.out.println("현재 저장된 결과는 " + resultList + "입니다.");
        } else {
            System.out.println("삭제할 결과가 없습니다.");
        }
    }
}




