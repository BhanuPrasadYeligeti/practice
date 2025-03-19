import java.util.HashMap;
import java.util.Map;
public class CountOfEach {
    public static void main(String[] args) {
        HashMap<Character,Integer> map=new HashMap<>();
        // map.put("bhanu",2);
        //   map.put("Satyam",21);
        //       map.put("Mamatha",24);
        //       System.out.print(map.get("bhanu")+3);
        String str="bhanupp";
        for(int i=0;i<str.length();i++)
        {
            if(map.containsKey(str.charAt(i)))
            {
                map.put(str.charAt(i),map.get(str.charAt(i))+1);
            }
            else{
                map.put(str.charAt(i),1);
            }
        }
        //  for (Map.Entry<Character, Integer> entry : map.entrySet()) {
        //     if(entry.getValue()==1){
        //         System.out.print(entry.getKey());
        //         break;
        //     }
        System.out.print("The count of each character is:");
        for(Map.Entry<Character,Integer>entry:map.entrySet())
        {
            System.out.print(entry.getValue()+" ");
        }
        System.out.println(map)  ;

    }
}
