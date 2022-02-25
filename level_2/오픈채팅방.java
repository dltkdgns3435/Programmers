/**
 * 링크 : https://programmers.co.kr/learn/courses/30/lessons/42888
 * 채점 결과
 * 정확성: 100.0
 * 합계: 100.0 / 100.0
 */

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

class Solution {
    public String[] solution(String[] record) {
        HashMap<String, String> hashMap = new HashMap<>();
        String[][] recodeParsed = new String[record.length][3];

        for (int i = 0; i < recodeParsed.length; i++) {
            recodeParsed[i] = record[i].split(" ");

            if (!recodeParsed[i][0].equals("Leave")) {
                hashMap.put(recodeParsed[i][1], recodeParsed[i][2]);
            }
        }
        List<String> answerList = new ArrayList<>();
        for (String[] sArr : recodeParsed) {
            if (sArr[0].equals("Enter")) {
                answerList.add(in(hashMap.get(sArr[1])));
            } else if (sArr[0].equals("Leave")) {
                answerList.add(out(hashMap.get(sArr[1])));
            }
        }

        return answerList.toArray(new String[0]);
    }

    private String out(String name) {
        return name + "님이 나갔습니다.";
    }

    private String in(String name) {
        return name + "님이 들어왔습니다.";
    }
}