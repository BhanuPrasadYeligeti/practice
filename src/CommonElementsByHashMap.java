import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Map;
//{1, 2, 3, 4, 5,};
//{4, 5, 6, 7, 8};
//output:4,5
public class CommonElementsByHashMap {
    public static void main(String[] args) {
        int [] arr={1, 2, 3, 4, 5,};
        int[]  arr1={4, 5, 6, 7, 8};
        LinkedHashSet<Integer> set1=new LinkedHashSet<>();
        LinkedHashSet<Integer>   set2=new LinkedHashSet<>();
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<arr.length;i++)
        {
            set1.add(arr[i]);
        }
        for(int i=0;i<arr1.length;i++)
        {
            set2.add(arr1[i]);
        }
    for(int i:set1){
        map.put(i,1);
    }
        for(int i:set2){
            if(map.containsKey(i))
            {
                map.put(i,map.get(i)+1);
            }
            else{
                map.put(i,1);
            }
        }
        System.out.print("The Common Elemnets are :");
        for(Map.Entry<Integer,Integer> entry: map.entrySet())
        {
            if(entry.getValue()>=2)
            {
                System.out.print(entry.getKey()+" ");
            }
        }
    }
}
