package 단계별.반복문;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//10951번
public class A_plus_5_minus_4 {
    public static void main(String [] args){
     /*  해당 문제는 종료 시점을 언급하지 않는 문제.
       1. 따라서, 데이터를 더 이상 읽을 수 없는 상태(EOF라고 한다. - End Of File)를 종료 시점이라고 한다.
          총 3가지 방법이 존재함. Scanner, BufferReader+StringToknizer, BufferReader+String.charAt()
       2. BufferReader : 이름 그대로 버퍼를 사용해서 데이터를 읽는 장치.
            - 버퍼링 : 입력받은 데이터를 메모리(버퍼)에 미리 쌓아두었다가, 한꺼번에 프로그램으로 전달하는 방식.
            - 효율성: 하드디스크나 키보드 같은 외부 장치와의 통신 횟수를 줄여 실행속도를 비약적으로 높일 수 있음.
            - 작돋원리 : 입력소스(키보드)로부터 데이터를 바구니에 가득 채우고, 프로그램이 데이터를 요청할 대, 저장된 데이터를 즉시 반환.
                        특히 readLine() 메서드를 통해 줄바꿈 단위로 데이터를 읽어올 수 있다.
            - 사용방법 : BufferReader br = new BufferReader(new InputStream(System.in));
                    - InputStream : 문자 단위의 데이터를 변환해 주는 다리 역할.
                                    0과1로 되어 있는 데이터를 읽어 문자 데이터로 변환해준다.
                    - InputStraem으로 문자 단위로 데이터를 읽어엇 Buffer에 담아, 문장 형태로 데이터를 처리한다.
      */

        //1.Scanner를 이용하여 EOF 만들기
        Scanner s = new  Scanner(System.in);
        int a;
        int b;
        List<Integer> list = new ArrayList<>();
        while(s.hasNextInt()){
            a = s.nextInt();
            b = s.nextInt();
            list.add(a+b);
        }
        for(Integer i:list){
            System.out.println(i);
        }

        //2.BufferReader+.. 내일 하자.

    }
}
