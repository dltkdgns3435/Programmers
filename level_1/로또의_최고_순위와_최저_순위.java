/**
 * 링크 : https://programmers.co.kr/learn/courses/30/lessons/77484
 * 채점 결과
 * 정확성: 100.0
 * 합계: 100.0 / 100.0
 */

class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
        int zeroCnt = 0;
        int matchCnt = 0;

        for (int i = 0; i < 6; i++) {
            if (lottos[i] == 0) {
                zeroCnt++;
            } else {
                for (int j = 0; j < 6; j++) {
                    if (lottos[i] == win_nums[j]) {
                        matchCnt++;
                    }
                }
            }

        }
        int min = Math.min(7 - matchCnt, 6);
        int max = Math.max(min - zeroCnt, 1);


        return new int[]{max, min};
    }
}