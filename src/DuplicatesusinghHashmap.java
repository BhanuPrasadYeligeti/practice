import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class DuplicatesusinghHashmap {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the size of the array");
        int n=sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Ente The Array values");
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }

        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i=0;i<arr.length;i++)
        {
            if(map.containsKey(arr[i]))
            {
                map.put(arr[i],map.get(arr[i])+1);
            }
            else {
                map.put(arr[i],1);
            }
        }

        for(Map.Entry<Integer,Integer> entry:map.entrySet())
        {
            if(entry.getValue()>=2)
            {
                System.out.println(entry.getKey()+"->"+ entry.getValue());
            }
        }
    }
}
