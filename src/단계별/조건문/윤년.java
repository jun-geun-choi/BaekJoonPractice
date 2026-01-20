package 단계별.조건문;

import java.util.Scanner;
/**
 문제
 연도가 주어졌을 때, 윤년이면 1, 아니면 0을 출력하는 프로그램을 작성하시오.

 윤년은 연도가 4의 배수이면서, 100의 배수가 아닐 때 또는 400의 배수일 때이다.

 예를 들어, 2012년은 4의 배수이면서 100의 배수가 아니라서 윤년이다. 1900년은 100의 배수이고 400의 배수는 아니기 때문에 윤년이 아니다. 하지만, 2000년은 400의 배수이기 때문에 윤년이다.

 입력
 첫째 줄에 연도가 주어진다. 연도는 1보다 크거나 같고, 4000보다 작거나 같은 자연수이다.

 출력
 첫째 줄에 윤년이면 1, 아니면 0을 출력한다.
 */

public class 윤년 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in); // 값을 입력 받기 위해 스캐너 객체 생성
        int year = scanner.nextInt();             //  입력받은 값을 year에 할당.

        // 윤년인지 확인하기 위한 로직
        if (year % 4 != 0) {                    // year가 4의 배수가 아니라면
            System.out.println(0);              // 윤년이 아님.
            return;                             // 종료
        }

        if ((year % 100 == 0)&&(year % 400 != 0)) {                  // year가 100의 배수이면서 400의 배수가 아닌 경우
            System.out.println(0);                                     // 윤년 아님.
            return;                                                    // 종료.
        }

        System.out.println(1);              // 위 조건 모두 통과 시 윤년이므로 1을 출력.
    }
}
