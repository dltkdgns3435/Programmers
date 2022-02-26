import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.PriorityQueue;

public class test {
    public static void main(String[] arg) {
    }

    public int sup(String[][] clothes) {
        HashMap<String, Integer> map = new HashMap<>();
        HashSet<String> keys = new HashSet<>();

        for(String[] clothe : clothes){
            if(map.containsKey(clothe[0])){
                map.put(clothe[0], map.get(clothe[0]) + 1);
            }
            else {
                map.put(clothe[0], 1);
                keys.add(clothe[0]);
            }
        }
        int result = 1;
        for(String key : keys){
            result *= map.get(key);
        }


        return result + clothes.length;
    }
}
