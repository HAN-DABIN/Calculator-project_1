package calculatorStep2;

import java.util.List;
import java.util.Scanner;

public class App2 {

    public static void main(String[] args) {
        // 스캐너 선언
        Scanner scanner = new Scanner(System.in);
        // calcultator 클래스 객체 생성
        Calculator2 calculator = new Calculator2();

        System.out.println("계산기를 작동합니다.");
        while (true) {
            System.out.println("=== 메뉴 ===");
            System.out.println("1. 계산하기");
            System.out.println("2. 연산 기록");
            System.out.println("0. 종료");
            System.out.println("원하시는 메뉴를 숫자로 입력해주세요.");

            // 메뉴 입력받기
            int select = scanner.nextInt();
            scanner.nextLine();

            // 0을 고르면 계산기 종료
            if (select == 0) {
                System.out.println("계산기를 종료합니다.");
                System.exit(0);
            }

            if (select == 1) {
                System.out.println("=== 계산을 시작합니다. ===");
                // 계산기 전체 반복문
                while (true) {
                    int num1;
                    // 첫번째 숫자 입력 반복문
                    while (true) {
                        System.out.print("첫 번째 숫자를 입력하세요: ");
                        // 숫자1 입력 받기
                        num1 = scanner.nextInt();
                        // 개행문자 제거
                        scanner.nextLine();
                        // num1이 0보다 크면 반복문 종료
                        if (num1 > 0) {
                            break;
                            // 아니면 문구 출력 후 재입력
                        } else {
                            System.out.println("양의 정수를 입력해주세요.");
                        }
                    }

                    char operator;
                    // 사칙연산 반복문
                    while (true) {
                        System.out.print("사칙연산 기호(+, -, *, /)를 입력하세요: ");
                        operator = scanner.next().charAt(0);
                        // +, -, *, / 입력시 반복문 종료
                        if (operator == '+' || operator == '-' || operator == '*' || operator == '/') {
                            break;
                            // 아니면 문구 출력 후 재입력
                        } else {
                            System.out.println("지원하지 않는 연산자입니다.");
                        }
                    }
                    int num2;
                    // 두 번째 숫자 입력 반복문
                    while (true) {
                        System.out.print("두 번째 숫자를 입력하세요: ");
                        // 숫자2 입력받기
                        num2 = scanner.nextInt();
                        // 개행문자 제거
                        scanner.nextLine();
                        // 만약 /과 0이 같이 쓰이면 문구 출력 후 재입력
                        if (operator == '/' && num2 == 0) {
                            System.out.println("0으로 나눌 수 없습니다. 다른 숫자를 입력해주세요.");
                            // num2가 0보다 작으면 문구 출력 후 재입력
                        } else if (num2 < 0) {
                            System.out.println("양의 정수를 입력해주세요.");
                            // 둘 다 아니면 반복문 종료
                        } else {
                            break;
                        }
                    }
                    // 메서드 호출
                    int result = calculator.calculate(num1, num2, operator);

                    System.out.println("결과: " + num1 + operator + num2 + " = " + result);

                    System.out.println("계속 계산하시겠습니까? (yes - 계속 계산 / no - 메뉴로 돌아가기)");
                    // 입력 받기
                    String exit = scanner.nextLine();
                    // exit 입력 시 프로그램 종료
                    if (exit.equals("no")) {
                       break;
                        // yes 입력 시 문구 출력 후 while문 처음으로 돌아감
                    } else if (exit.equals("yes")) {
                        System.out.println("다시 계산합니다.");
                    }
                }
            }
            if (select == 2) {
                System.out.println("연산 기록을 확인합니다.");
                System.out.println("1. 연산 기록 조회");
                System.out.println("2. 연산 기록 삭제");

                int select2 = scanner.nextInt();
                scanner.nextLine();

                switch (select2) {
                    case 1:
                        // getter 활용
                        List<Integer> newCal = calculator.getResult();
                        System.out.println(newCal);
                        break;
                    case 2:
                        // setter 활용
                        System.out.println("첫 번째 계산 기록을 삭제합니다");
                            calculator.removeResult();
                            break;
                        }

                System.out.println("메뉴로 돌아가시겠습니까? (yes - 메뉴로 돌아가기 / exit - 프로그램 종료)");
                // 입력 받기
                String exit2 = scanner.nextLine();
                // yes 입력 시 문구 출력 후 while문(메뉴반복) 처음으로 돌아감
                if (exit2.equals("yes")) {
                    // exit 입력 시 프로그램 종료
                } else if (exit2.equals("exit")) {
                    System.out.println("프로그램을 종료합니다.");
                    System.exit(0);
                }
                }
            }
        }
}




