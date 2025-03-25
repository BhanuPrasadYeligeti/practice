import java.util.HashMap;
import java.util.Map;
//we are printing the  maximum key value pair
public class Maximumkeyvaluepair {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("John", 20);
        map.put("Bhanu", 995);
        map.put("Bob", 25);
        map.put("Alice",15);
        int max=map.get("John");
        String str=" ";
        for(Map.Entry<String,Integer> entry:map.entrySet())
        {
            if(entry.getValue()>max)
            {
                max= entry.getValue();
                str= entry.getKey();
            }

        }
        System.out.print(str+""+max);

    }
}
