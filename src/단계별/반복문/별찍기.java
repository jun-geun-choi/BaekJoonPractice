package 단계별.반복문;

import java.util.Scanner;

public class 별찍기 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in); // 입력 객체 생성.
        int count;                          // 별을 몇 줄 찍을지에 대한 카운트 변수 선언
        count = s.nextInt();                // 별을 몇 줄 찍을지 입력 받는다.

        //별 찍기.
        for(int i = 1; i <= count; i ++){   //1행 부터 count행까지 출력 시킬 것이고,
                                            //i를 1부터 시작해야하는 이유는, 현재 행 번호가 별의 개수를 의미하기 때문.

            for(int j =1; j <= i; j++){    //현재 행 번호 = 별의 개수. 1행에 별 1개 2행에 별 2개..
                System.out.print("*");
            }
            System.out.println();         //행 한 줄이 끝나면 줄바꿈한다.
        }
    }

}
