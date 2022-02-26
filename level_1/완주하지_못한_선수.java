/**
 * 링크 : https://programmers.co.kr/learn/courses/30/lessons/42576
 * 채점 결과
 */

import java.util.Arrays;
import java.util.PriorityQueue;

class Solution {
    public String solution(String[] participant, String[] completion) {
        PriorityQueue<String> participantQueue = new PriorityQueue<>(Arrays.asList(participant));
        PriorityQueue<String> completionQueue = new PriorityQueue<>(Arrays.asList(completion));

        for (int i = 0; i < participant.length; i++) {
            String p = participantQueue.poll();
            String c = completionQueue.poll();
            if(!p.equals(c)) return p;
        }
        return "";
    }
}