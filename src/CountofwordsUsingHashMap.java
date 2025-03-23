import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CountofwordsUsingHashMap {
    public static void main(String[] args) {
        HashMap<String,Integer> map=new HashMap<>();
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the String");
        String str=sc.nextLine();
       String[] arr=str.split(" ");
       for(int i=0;i<arr.length;i++)
       {
           if(map.containsKey(arr[i]))
           {
               map.put(arr[i],map.get(arr[i])+1);
           }
           else{
               map.put(arr[i],1);

           }
       }
       for(Map.Entry<String,Integer> entry:map.entrySet())
       {
           if(entry.getValue()>1)
           {
               System.out.println(entry.getKey()+"->"+entry.getValue());
           }
       }
    }
}
