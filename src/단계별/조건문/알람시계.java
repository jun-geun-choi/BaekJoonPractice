package 단계별.조건문;

import java.util.Scanner;

public class 알람시계 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);    // 시간과 분을 입력하기 위한 스캐너
        int h = scanner.nextInt();                   // 시간 입력
        int m = scanner.nextInt();                   // 분 입력

        if (m < 45) {                               // 분이 45보다 작은 경우, 0 ~ 44의 경우이므로
            m = (60 + m) - 45;                      // 그에 맞는 분을 계산
            h = h -1;                               // 시간 또한 1을 뺀다.
            if(h < 0 ) {                            // 뺀 시간이 음수인 경우
                h = 23;                             // 23으로 정의한다.
            }
            System.out.println(h + " " + m);        // 00 : 00 -> 23 : 15 , 6 : 30 -> 5 : 45
            return;                                 // 종료
        }
        m = m - 45;                                 // 그 외로 45보다 큰 경우에는 입력된 분에 45를 뺀다.
        System.out.println(h + " " + m);            // 출력

    }

}
