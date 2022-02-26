/**
 * 링크 : https://programmers.co.kr/learn/courses/30/lessons/42748
 * 채점 결과
 * 정확성: 100.0
 * 합계: 100.0 / 100.0
 */

import java.util.Arrays;

class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        int idx = 0;
        for(int[] command : commands){
            int[] subArray = Arrays.copyOfRange(array, command[0] - 1, command[1]);
            Arrays.sort(subArray);
            answer[idx++] = subArray[command[2] - 1];
        }
        return answer;
    }
}