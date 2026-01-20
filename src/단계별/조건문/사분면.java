package 단계별.조건문;

import java.util.Scanner;

public class 사분면 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);       // x,y 값을 입력 받기 위해 스캐너 객체 생성
        int x = scanner.nextInt();                      // x값 입력
        int y = scanner.nextInt();                     // y값 입력

        if ((x > 0) && (y > 0)) {                             // 두 수가 양수인 경우
            System.out.println(1);                            // 1사분면
        } else if ((x < 0) && (y > 0)) {                     // x가 음수, y가 양수
            System.out.println(2);                           // 2사분면
        } else if ((x < 0) && (y < 0)) {                     // 둘다 음수
            System.out.println(3);                           // 3사분면
        } else if ((x > 0) && (y < 0)) {                     // x가 양수, y가 음수
            System.out.println(4);                           //4사분면
        }
    }

}
