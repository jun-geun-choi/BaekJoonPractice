package 단계별.반복문;

import java.util.Scanner;

/** 25314번
 * [입력]         [출력]
 *  4           long int
 * [입력]         [출력]
 *  20       long long long long long int
 */
public class 코딩은체육과목 {

    public static void main(String[] args) {
        Scanner in  = new Scanner(System.in);           // 입력하기 위한 스캐너 객체 선언
        int n ;                                         // 입력 받을 수 4의 배수로 한정
        String str = "int";                             // 기본 String 값.

        while(true){                                    // 무한 반복을 돌려, 4의 배수만 입력될 수 있도록 설정.
            n = in.nextInt();
            if(n % 4 == 0) {                            // 입력값이 4의 배수이면, 무한 반복 탈출
                break;
            }
            System.out.println("4의 배수가 아닙니다. 재입력 하십시오 .");
        }

        for(int i = 0; i<n; i+=4){                  // 4의 배수만큼만 반복
            str = "long " + str;                    // 출력 형식에 맞게 문자열 합치기
        }
        System.out.println(str);                    // 출력

    }

}
