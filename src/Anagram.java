import java.util.HashMap;
import java.util.Map;

public class Anagram {
    public static void main(String[] args) {

        HashMap<Character, Integer> map = new HashMap<>();
        map.put('a', 2);
        map.put('b', 3);
        map.put('c', 19);
        map.put('j', 6);

        HashMap<Character, Integer> ma = new HashMap<>();
        ma.put('a', 2);
        ma.put('b', 3);
        ma.put('c', 19);
        ma.put('j', 6);


        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            for (Map.Entry<Character, Integer> en : ma.entrySet()) {

                if (en.getValue().equals(entry.getValue()) && en.getKey().equals(entry.getKey())) {
                    System.out.print(entry.getKey() + " " + entry.getValue() + " ");
                }
            }
        }
    }
}
