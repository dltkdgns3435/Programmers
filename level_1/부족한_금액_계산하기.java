/**
 * 링크 : https://programmers.co.kr/learn/courses/30/lessons/82612
 * 채점 결과
 * 정확성: 100.0
 * 합계: 100.0 / 100.0
 */

class Solution {
    public long solution(int price, int money, int count) {
        long answer = -1;
        answer = (long) price * count * (count + 1) / 2 - money;
        return answer <= 0 ? 0 : answer;
    }
}