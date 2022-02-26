/**
 * 링크 : https://programmers.co.kr/learn/courses/30/lessons/86051
 * 채점 결과
 * 정확성: 100.0
 * 합계: 100.0 / 100.0
 */

class Solution {
    public int solution(int[] numbers) {
        boolean[] foundNumbers = new boolean[10];
        int answer = 0;

        for(int number : numbers){
            foundNumbers[number] = true;
        }

        for(int i=0; i<10; i++){
            if(!foundNumbers[i]){
                answer+=i;
            }
        }

        return answer;
    }
}