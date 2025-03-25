import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class UnionHashmap {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(9,71, 2, 3, 4, 5,5,3));
        ArrayList<Integer> arr1 = new ArrayList<>(Arrays.asList(2,3,4,6,9,4));
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<arr.size();i++)
        {
            if(map.containsKey(arr.get(i)))
            {
                map.put(arr.get(i),map.get(arr.get(i))+1);
            }
            else{
                map.put( arr.get(i),1);
            }
        }
//        System.out.print(map);
        for(int i=0;i<arr1.size();i++)
        {
            if(map.containsKey(arr1.get(i)))
            {
                map.put(arr1.get(i),map.get(arr1.get(i))+1);
            }
            else{
                map.put( arr1.get(i),1);
            }
        }
        System.out.print(map.keySet());




    }
}
