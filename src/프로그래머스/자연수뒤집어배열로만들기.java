package 프로그래머스;

public class 자연수뒤집어배열로만들기 {

    public Long[] solution(long n) {
        String strN = Long.toString(n);     // 전달 받은 정수를 문자열로 변환 한 다음,
        Long[] answer = new Long[strN.length()]; // 문자열로 변환한 정수의 사이즈 만큼의 배열을 가지도록 초기화

        for (int i = 0; i < strN.length(); i++) {
            answer[i] = n % 10;
            n = n / 10;
        }

        return answer;
    }

}
