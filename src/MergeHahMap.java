import java.util.HashMap;
import java.util.Map;
//Adding The HashMap2 Key Value pairs To the HashMap1
public class MergeHahMap {
    public static void main(String[] args) {
        HashMap<String, Integer> map1 = new HashMap<>();
        map1.put("John", 20);
        map1.put("Alice", 15);

        HashMap<String, Integer> map2 = new HashMap<>();
        map2.put("John", 30);
        map2.put("Bob", 25);
        map2.put("Alice",15);
        for(String word:map2.keySet())
        {

            if(map1.containsKey(word))
            {
                map1.put(word,map2.get(word)+map1.get(word));
            }
            else{
                map1.put(word,map2.get(word));
            }
        }
        System.out.print(map1);

    }
}
