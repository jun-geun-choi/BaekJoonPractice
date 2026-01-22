package 단계별.반복문;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/** 25304번
 * 첫째 줄에는 영수증에 적힌 총 금액 x가 주어진다.
 * 둘째 줄에는 영수증에 적힌 구매한 물건의 종류의 수 N이 주어진다.
 * 이후 N개의 줄에는 각 물건의 가격 a와 개수 b가 공백을 사이에 두고 주어진다.
 *
 * [출력]
 * 구매한 물건의 가격과 개수로 계산한 총 금액이 영수증에 적힌 총 금액과 일치하면 Yes를 출력
 * 일치하지 않는다면, No를 출력.
 *
 * [입력]         [출력]
 * 260000          Yes
 * 4
 * 20000 5
 * 30000 2
 * 10000 6
 * 5000 8
 *
 */

public class 영수증 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);            //입력 하기 위한 객체 선언
        int x = in.nextInt();                           // 영수증에 찍힌 총 금액
        int n =  in.nextInt();                          // 구매 물건의 총 종류 갯수
        int a,b;                                        // 물건의 가격과 물건 갯수
        List<Integer> list = new ArrayList<>();         // 물건 종류별 구매가격을 담을 리스트 객체
        int total = 0;                                  // 실제 구매한 총 금액

        for (int i = 0; i < n; i++) {                   //n개의 종류만큼 반복하여
            a = in.nextInt();
            b = in.nextInt();
            list.add(a*b);                              //각 종류별 물건의 구매 금액을 리스트에 담음.
        }

        for(Integer i : list) {                        //실제 구매한 물건의 총 금액 구하기
            total =  total + i;
        }
        //실제 총 금액과 영수증에 찍힌 금액 비교하여 출력
        if(total == x) {
            System.out.println("Yes");
        }else {
            System.out.println("No");
        }

    }

}
