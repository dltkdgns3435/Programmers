/**
 * 링크 : https://programmers.co.kr/learn/courses/30/lessons/72412
 * 채점 결과
 * 정확성: 100.0
 * 합계: 100.0 / 100.0
 */

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

class Solution {

    String language[] = {"cpp","java","python","-"};
    String position[] = {"backend", "frontend","-"};
    String career[] =     {"junior","senior","-"};
    String soulfood[] = {"chicken","pizza","-"};
    String joker = "-";

    public void setMap(HashMap<String, ArrayList<Integer>> map) {
        for(int a=0; a<language.length; a++) {
            for(int b=0; b<position.length; b++) {
                for(int c=0; c<career.length; c++) {
                    for(int d=0; d<soulfood.length; d++) {
                        map.put(language[a]+position[b]+career[c]+soulfood[d], new ArrayList<Integer>());
                    }
                }
            }
        }
    }
    //모든 16가지 경우 전부 다
    public void inputVal(HashMap<String, ArrayList<Integer>> map, String info, int cutPoint, int value) {
        String[] token = (info.substring(0, cutPoint-1)).split(" ");
        map.get(token[0] + token[1] + token[2]+ token[3]).add(value);
        map.get(token[0] + token[1] + token[2]+ joker).add(value);
        map.get(token[0] + token[1] + joker+ token[3]).add(value);
        map.get(token[0] + joker + token[2]+ token[3]).add(value);
        map.get(joker + token[1] + token[2]+ token[3]).add(value);
        map.get(token[0] + token[1] + joker+ joker).add(value);
        map.get(token[0] + joker + token[2]+ joker).add(value);
        map.get(joker + token[1] + token[2]+ joker).add(value);
        map.get(token[0] + joker + joker+ token[3]).add(value);
        map.get(joker + token[1] + joker+ token[3]).add(value);
        map.get(joker + joker + token[2]+ token[3]).add(value);
        map.get(token[0] +joker + joker+ joker).add(value);
        map.get(joker + joker + token[2]+ joker).add(value);
        map.get(joker + token[1] + joker+ joker).add(value);
        map.get(joker + joker + joker+ token[3]).add(value);
        map.get(joker + joker + joker+ joker).add(value);
    }


    public int[] solution(String[] info, String[] query) {

        int[] answer = new int[query.length];
        HashMap<String, ArrayList<Integer>> infoMap = new HashMap<>();
        setMap(infoMap);

        for(int i = 0; i<info.length; i++) {
            int cutPoint = info[i].lastIndexOf(" ")+1;
            int value = Integer.parseInt(info[i].substring(cutPoint));
            inputVal(infoMap, info[i], cutPoint, value);
        }

        for (Map.Entry<String, ArrayList<Integer>> entry : infoMap.entrySet()) {
            Collections.sort(entry.getValue());
        }

        for (int i=0; i < query.length; i++) {
            int cutPoint = query[i].lastIndexOf(" ")+1;
            int value = Integer.parseInt(query[i].substring(cutPoint));
            String key = query[i].substring(0,cutPoint-1).replaceAll(" and ", "");

            ArrayList<Integer> output = infoMap.get(key);
            int idx = Collections.binarySearch(output, value);
            if(idx >= 0) {
                for(int a=idx-1; a>=0; a--) {
                    if(output.get(idx) - output.get(a) > 0) break;
                    else idx = a;
                }
                answer[i] = output.size()-idx;
            }else {
                answer[i] = output.size()+idx+1;
            }
            //System.out.println(answer[i]);
        }
        return answer;
    }
}