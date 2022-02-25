/**
 * 링크 : https://programmers.co.kr/learn/courses/30/lessons/60057
 * 채점 결과
 * 정확성: 100.0
 * 합계: 100.0 / 100.0
 */

class Solution {
    public int solution(String s) {
        int answer = s.length();

        for (int size = 1; size <= s.length() / 2; size++) {
            String tmp = "";
            int result = s.length();
            int cnt = 1;

            for (int i = 0; i < s.length() / size; i++) {
                String cut = s.substring(i * size, (i + 1) * size);

                if (cut.equals(tmp)) {
                    cnt++;
                    result -= size;
                } else {
                    if (cnt > 1) {
                        result += Integer.valueOf(cnt).toString().length();
                        cnt = 1;
                    }
                    tmp = cut;
                }
            }
            if (cnt > 1) {
                result += Integer.valueOf(cnt).toString().length();
            }
            answer = Math.min(answer, result);
        }

        return answer;
    }
}