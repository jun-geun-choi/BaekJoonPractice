import java.util.Scanner;

public class Solution {

    /**
     * 입력 받은 정수에서 각 자릿수의 합을 구한다. 123 =>  6
     *
     * @param n 입력 받은 정수
     * @return
     */
    public Long[] solution(long n) {
        String strN = Long.toString(n);     // 전달 받은 정수를 문자열로 변환 한 다음,
        Long []answer = new Long[strN.length()]; // 문자열로 변환한 정수의 사이즈 만큼의 배열을 가지도록 초기화

        for(int i = 0; i < strN.length(); i++) {
            answer[i] = n % 10;
            n = n / 10;
        }

        return answer;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        long n = 123456789L;
        Long [] answer = solution.solution(n);
        for(int  i = 0; i < answer.length; i++) {
            System.out.println(answer[i]);
        }

    }

}
