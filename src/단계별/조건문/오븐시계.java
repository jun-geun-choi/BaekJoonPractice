package 단계별.조건문;

import java.util.Scanner;

/**
 * 2525번 문제
 */
public class 오븐시계 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);  // 현재 시각과 조리 시간을 입력 받기 위해
        int h = sc.nextInt();       // 현재 시간
        int m = sc.nextInt();      // 현재 분
        int c = sc.nextInt();      // 조리시간

        int totalTime = (h * 60) + m + c; // 종료 시간을 분으로 환산

        h = totalTime / 60;             // 종료 시(hoour)
        m = totalTime % 60;            // 종료 분(minute)

        if (h >= 24) {                   // 만일 종료 시가 24시보다 크거나 같은 경우
            h = h - 24;                 // 24를 빼서 종료 시를 표현.(24시인 경우 0으로 표기)
        }
        System.out.println(h + " " + m);// 출력
    }
}
