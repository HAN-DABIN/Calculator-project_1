package caculator;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            int num1;
            while (true) {
                System.out.print("첫 번째 숫자를 입력하세요: ");
                num1 = scanner.nextInt();
                scanner.nextLine();
                if (num1 > 0) {
                    break;
                } else {
                    System.out.println("양의 정수를 입력해주세요.");
                }
            }

            char operator;
            while (true) {
                System.out.print("사칙연산 기호(+, -, *, /)를 입력하세요: ");
                operator = scanner.next().charAt(0);
                if (operator == '+' || operator == '-' || operator == '*' || operator == '/') {
                    break;
                } else {
                    System.out.println("지원하지 않는 연산자입니다.");
                }
            }

            int num2;
            while (true) {
                System.out.print("두 번째 숫자를 입력하세요: ");
                num2 = scanner.nextInt();
                scanner.nextLine();
                if (operator == '/' && num2 == 0) {
                    System.out.println("0으로 나눌 수 없습니다. 다른 숫자를 입력해주세요.");
                    continue;
                } else if (num2 < 0) {
                    System.out.println("양의 정수를 입력해주세요.");
                } else {
                    break;
                }
            }

            int result = 0;
            if (operator == '+') {
                result = num1 + num2;
            } else if (operator == '-') {
                result = num1 - num2;
            } else if (operator == '*') {
                result = num1 * num2;
            } else if (operator == '/') {
                result = num1 / num2;
            }
            System.out.println("결과: " + num1 + operator + num2 + " = " + result);

            System.out.println("계속 계산하시겠습니까? (yes - 계속 계산 / exit - 종료)");
            String exit = scanner.nextLine();
            if (exit.equals("exit")) {
                System.exit(0);
            } else if (exit.equals("yes")) {
                System.out.println("다시 계산합니다.");
            }
        }
    }
}



