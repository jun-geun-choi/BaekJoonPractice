package 프로그래머스;

public class 정수를숫자로변환하기 {

    /**
     * 여기서 포인트는 -1234를 해도 결국엔 정수이기 때문에, 출력이 된다는 것이다.
     * @param s
     * @return
     */
    public int solution(String s) {
        int answer = 0;
        int strSize = s.length();

        if (strSize < 1 || strSize > 5) { //문자열의 길이가, 1이상 5이하인지 확인.
            return 0;
        }
        answer = Integer.parseInt(s);
        return answer;
    }

}
