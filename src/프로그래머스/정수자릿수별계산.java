package 프로그래머스;

public class 정수자릿수별계산 {

    /**
     * 입력 받은 정수에서 각 자릿수의 합을 구한다. 123 =>  6
     *
     * @param n 입력 받은 정수
     * @return
     */
    public int solution(int n) {
        int answer = 0;   // 최종 결과를 저장할 변수.

        while (n != 0) {       // n이 0이 될 때까지 계속 반복한다.
            answer += n % 10; // n을 10으로 나누어 그 나머지를 answer에 저장한다.
            n /= 10;          // 위 계산 이후, n을 다시 10으로 나누어 나온 몫을 다시 n에 저장한다.
        }

        return answer;
    }


}
