package 단계별.반복문;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * 10950번 문제 두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오.
 * - 입력 첫째 줄에 테스트 케이스의 개수 T가 주어진다.
 * - 각 테스트 케이스는 한 줄로 이루어져 있으며, 각 줄에 A와 B가 주어진다. (0 < A, B < 10)
 * - 출력 각 테스트 케이스마다 A+B를 출력한다.
 * [입력]      [출력]
 * 4
 * 1 1          2
 * 2 2          4
 * 3 3          6
 * 4 4          8
 */
public class A더하기B연산 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);        //입력 받기 위한 스캐너 객체
        int a, b, t;                                  // 입력받을 변수들 선언(정수 2개, 개수)
        List<Integer> result = new ArrayList<>();   // 입력 받은 두 정수의 합을 저장하기 위한 리스트 객체
        t = in.nextInt();           // 입력 받을 수 있도록 설정

        for (int i = 0; i < t; i++) {      //t(테스트 개수) 만큼 반복하여, 두 정수를 입력 받고
            a = in.nextInt();
            b = in.nextInt();
            result.add(a + b);                    // 두 수의 합을 리스트 객체에 저장.
        }

        for (Integer i : result) {       // 출력 형식을 맞추기 위해 리스트를 반복하여 출력.
            System.out.println(i);
        }

    }

}
