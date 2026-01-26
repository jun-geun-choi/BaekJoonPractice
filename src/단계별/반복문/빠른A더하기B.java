package 단계별.반복문;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

/** [입력]            [출력]
 * 5
 * 1 1                  2
 * 12 34                46
 * 5 500                505
 * 40 60                100
 * 1000 1000            2000
 */

public class 빠른A더하기B {
    public static void main(String[] args) throws IOException {

        // 입력 받기 위한 BufferedReader 객체
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // 먼저 몇 번 연산 할 지 입력하여 n에 할당.
        int n = Integer.parseInt(br.readLine());
        //한 줄에 두 정수를 입력하기 위한 문자열 객체 -> 공백을 기준으로 두 정수를 쪼개서 각 정수 변수에 할당.
        String strAB;
        // 두 정수의 합을 저장하기 위한 리스트 객체.
        List<Integer> result = new ArrayList<>();

        // 입력 받은 n 만큼 반복
        for(int i = 0; i < n ; i ++) {
            // 두 정수를 한 줄에 다 입력하여 strAB에 저장. - 입력 예제 형식을 맞추기 위함.
            strAB = br.readLine();
            //strAB를 공백 기준으로 나눔
            StringTokenizer st = new StringTokenizer(strAB);
            //각 나눈 것을 정수로 변환하여 저장
            int a =  Integer.parseInt(st.nextToken());
            int b =  Integer.parseInt(st.nextToken());
            // 두 정수의 합을 result(리스트 객체에) 저장.
            result.add(a + b);
        }

        // 출력을 위한 객체 선언(BufferedWriter)
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        // 출력 형식을 맞추기 위해, 반복문을 돌려 출력.
        for(Integer i : result) {
            bw.write(i + "\n");
        }
        // 버퍼 한번 비우고
        bw.flush();
        //버퍼 닫기
        bw.close();
    }

}
