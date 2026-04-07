package 단계별.반복문;

import java.util.Scanner;

public class 별찍기 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int count; // 별을 몇 줄까지 찍을지 입력 받을 변수 선언

        count = in.nextInt();
        String star = "*"; // 콘솔에 찍을 별

        for (int i = 0; i < count; i++) { // count 만큼 반복 해서
            System.out.println(star);
            star += "*";
        }
    }

}
