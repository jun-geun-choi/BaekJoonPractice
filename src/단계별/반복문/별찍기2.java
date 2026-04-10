package 단계별.반복문;

import java.util.Scanner;
// 백준 2439번 문제.
/**
 * 예를 들어 5줄의 별을 찍는다면, 1행에는 4칸의 공백과 1칸의 별을
 * 2행에는 3칸의 공백과 2칸의 별을.. 찍어내는 문제이다.
 */
public class 별찍기2 {
    public static void main(String[] args) {
        Scanner s= new  Scanner(System.in);
        int n;
        n = s.nextInt();

        for(int i = 1; i<= n; i++){ //총 n행을 출력할 것이다.(n = 1~100)
            for(int j = 1; j <= n-i ; j++){ // 현재 행 번호에 따라, 공백을 만든다.
                                            // 공백의 수 = 전체 행의 수 - 현재 행 번호
                                            // 5행짜리 행이면 1행에는 4칸의 공백, 2행에는 3칸의 공백이 들어가야 한다.
                System.out.print(" ");
            }
            for(int k = 1; k <= i; k++){ // 현재 행 번호에 따라, 별도 같은 개수로 찍어낸다. - 1행 = 별 1개
                System.out.print("*");
            }
            System.out.println();
        }
    }

}
