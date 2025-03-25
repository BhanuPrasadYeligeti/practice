import java.util.HashMap;
import java.util.Map;

public class StringstaringwithAlphabets {
    public static void main(String[] args) {
        String[] arr={"a","fa","aa","bb","b","z","zebra","ff","j"};
        HashMap<Character,String> map=new HashMap<>();
        for(String word:arr)
        {
            char c=word.charAt(0);
            if(map.containsKey(c))
            {
                map.put(c,map.get(c)+"  "+word+"  ");
            }
            else {
                map.put(c,word);
            }
        }
        for(Map.Entry<Character,String> entry:map.entrySet()){
            System.out.println(entry.getKey()+"->"+entry.getValue()+" ");
        }




    }
}
