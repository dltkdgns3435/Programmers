/**
 * 링크 : https://programmers.co.kr/learn/courses/30/lessons/76501
 * 채점 결과
 * 정확성: 100.0
 * 합계: 100.0 / 100.0
 */

class Solution {
    public int solution(int[] absolutes, boolean[] signs) {
        int answer = 0;
        for (int i = 0; i < absolutes.length; i++) {
            if(signs[i]) answer += absolutes[i];
            else answer -= absolutes[i];
        }
        return answer;
    }
}