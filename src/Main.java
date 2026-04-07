import java.util.Scanner;

public class Main {
    public static void main(String [] args){
        int count; // 입력 받을 테스트 케이스 개수
        int a;
        int b; // 입력 받을 두 정수

        Scanner s = new Scanner(System.in); // 스캐너 생성
        count = s.nextInt();            // 테스트 케이스 개수 입력

        for(int i = 1; i <= count; i++){ // 입력한 개수만큼 반복해서,
            a =  s.nextInt();
            b =  s.nextInt(); // 두 정수를 입력하고,
            int sum = a + b; // 두 정수의 합을 sum에 저장.
            System.out.println("Case #"+ i+": " + sum); // 두 정수의 합을 출력.
        }
    }
}