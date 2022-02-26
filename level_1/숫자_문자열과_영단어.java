/**
 * 링크 : https://programmers.co.kr/learn/courses/30/lessons/81301
 * 채점 결과
 * 정확성: 100.0
 * 합계: 100.0 / 100.0
 */

class Solution {
    public int solution(String s) {
        String[] numbers = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};

        for(int i = 0; i < 10; i++){
            s = s.replaceAll(numbers[i], Integer.toString(i));
        }

        return Integer.parseInt(s);
    }
}