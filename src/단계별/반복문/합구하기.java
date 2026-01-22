package 단계별.반복문;

import java.util.Scanner;

/** 8393번
 * [문제]
 * n이 주어졌을 때, 1부터 n까지 합을 구하는 프로그램을 작성하시오.
 * [입력]  [출력]
 * 3        6
 */
public class 합구하기 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);       //입력 하기 위한 스캐너 객체
        int n =  scanner.nextInt();                     //입력 받을 정수
        int result = 0;                                 //입력 받은 수 만큼의 합을 저장하기 위한 객체

        for(int i = 1; i <= n; i++) {                   //n만큼 반복하여
            result = result + i;                        //1부터 n까지의 합을 result에 할당.
        }
        System.out.println(result);                     //최종 결과를 출력

    }
}
