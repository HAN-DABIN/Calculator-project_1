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
                    int num1 = calculator.firstnum(scanner, "첫 번째 숫자를 입력하세요.: ");

                    char operator = calculator.operate(scanner, "연산자(+, -, *, /)를 입력해주세요.");

                    int num2 = calculator.secondnum(scanner, "두 번쩨 숫자를 입력하세요.: ", operator);


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
                        System.out.println("첫 번째 계산 기록을 삭제합니다");
                        // 메서드 활용
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




