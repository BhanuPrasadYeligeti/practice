import java.util.Scanner;
import java.util.ArrayList;

public class Primepair {
    public static void main(String[] args) {
        int n;
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the n value");
        n=sc.nextInt();
        ArrayList<Integer> arr=new ArrayList<>();
        int k=0;
        for(int i=2;i<n;i++)
        {
            int count=0;
            for(int j=1;j<=i;j++)
            {
                if(i%j==0)
                {
                    count+=1;
                }
            }
            if(count<=2)
            {
                arr.add(i);

            }
        }
        int c=0;
        for(int i=0;i<arr.size();i++)
        {

            for(int j=i+1;j<arr.size();j++)
            {
                if(arr.get(i)+arr.get(j)==n)
                {
                    System.out.println(arr.get(i)+"+" +arr.get(j)+"->"+n);
                    c+=1;
                }

            }

        }
        if(c==0)
        {
            System.out.print("the given value doesn't contains values");
        }

    }
}
