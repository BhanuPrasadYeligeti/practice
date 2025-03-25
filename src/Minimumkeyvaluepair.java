import java.util.HashMap;
import java.util.Map;
/*Were are printing the Minimum key value pair*/
public class Minimumkeyvaluepair {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("John", 20);
        map.put("Bhanu", 995);
        map.put("Bob", 25);
        map.put("Alice",15);
        int min=map.get("John");
        String str=" ";
        for(Map.Entry<String,Integer> entry:map.entrySet())
        {
            if(entry.getValue()<min)
            {
                min= entry.getValue();
                str = entry.getKey();
            }

        }
        System.out.print(str+""+min);

    }
}
