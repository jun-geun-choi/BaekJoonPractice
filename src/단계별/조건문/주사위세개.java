package 단계별.조건문;

import java.util.Scanner;

/**
 * 2480번
 */
public class 주사위세개 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);   // 주사위 눈의 정수를 입력 받기 위함.(0 ~ 6)
        int num1 = scanner.nextInt();          // 주사위 눈 1
        int num2 = scanner.nextInt();          // 주사위 눈 2
        int num3 = scanner.nextInt();          // 주사위 눈 3
        int max = 0;                        // 최댓값
        int reward = 0;                     // 상금

        if (num1 != num2 && num1 != num3 && num2 != num3) {       //세 주사위 눈 수가 다른 경우
            if (num1 > num2) {
                if (num3 > num1) { // num3이 제일 큰 경우
                    max = num3;
                } else {         //num1이 제일 큰 경우
                    max = num1;
                }
            } else { //num2 > num1인 경우
                if (num3 > num2) { // num3이 제일 큰 경우
                    max = num3;
                } else {
                    max = num2; // num2이 제일 큰 경우
                }
            }
            reward = max * 100;
        } else { // 두 정수가 같거나, 세 정수 모두 같은 경우
            if (num1 == num2 && num1 == num3 && num2 == num3) {   // 모두 같은 경우
                reward = 10000 + num1 * 1000;
            } else if (num1 == num2 || num1 == num3) { // num1이 num2와 같거나 num3과 같은 경우
                reward = 1000 + num1 * 100;
            } else { //num2 == num3
                reward = 1000 + num2 * 100;
            }
        }
        System.out.println(reward);

    }

}
