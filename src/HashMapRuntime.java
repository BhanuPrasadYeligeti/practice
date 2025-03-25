import java.util.HashMap;
import java.util.Scanner;

public class HashMapRuntime {
    public static void main(String[] args) {
        HashMap<String,Integer> map=new HashMap<>();
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter n number of Values");
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            System.out.print("enter key");
            String key=sc.next();
            System.out.print("enter Value");
            int value=sc.nextInt();
            map.put(key,value);
        }
        System.out.print(map);
    }
}
