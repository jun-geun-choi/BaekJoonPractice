import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in  = new Scanner(System.in);
        String object = "int";
        int n ;

        while(true) {
            n =  in.nextInt();
            if(n % 4 == 0) {
                break;
            }
            System.out.println("재입력");
        }

        for(int i = 0; i < n; i+=4) {
            object = "long " + object;
        }
        System.out.println(object);
    }
}