package 단계별.반복문;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
//10952번
public class A더하기B빼기5 {
    public static void main(String[] args) {
        int a;
        int b;
        Scanner s= new  Scanner(System.in);
        List<Integer> addResult = new ArrayList<>();

        while(true) {
            a =  s.nextInt();
            b =   s.nextInt();
            if(a == 0 && b == 0){
                break;
            }
            addResult.add(a+b);
        }
        for(Integer i : addResult) {
            System.out.println(i);
        }
    }
}
