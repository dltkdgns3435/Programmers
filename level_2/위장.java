/**
 * 링크 : https://programmers.co.kr/learn/courses/30/lessons/42578
 * 채점 결과
 * 정확성: 100.0
 * 합계: 100.0 / 100.0
 */

import java.util.HashMap;
import java.util.HashSet;

class Solution {
    public int solution(String[][] clothes) {
        HashMap<String, Integer> map = new HashMap<>();
        HashSet<String> keys = new HashSet<>();

        for(String[] clothe : clothes){
            if(map.containsKey(clothe[1])){
                map.put(clothe[1], map.get(clothe[1]) + 1);
            }
            else {
                map.put(clothe[1], 1);
                keys.add(clothe[1]);
            }
        }

        int result = 1;
        for(String key : keys){
            result *= map.get(key) + 1;
        }


        return result - 1;
    }
}