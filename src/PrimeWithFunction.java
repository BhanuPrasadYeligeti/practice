import java.util.ArrayList;
import java.util.Scanner;

public class PrimeWithFunction {
    public static int findPrimes(int count,int i)
   {
            if(count<=2)
            {
                return i;

            }
        return 0;
    }
    public static ArrayList<Integer> prime(int n) {
        ArrayList<Integer> arr = new ArrayList<>();
        for (int i = 2; i < n; i++) {
            int count = 0;
            for (int j = 1; j <= i; j++) {
                if (i % j == 0) {
                    count += 1;
                }
            }
            arr.add(findPrimes(count, i));
        }

        return arr;

    }
    public static void main(String[] args) {
        int n;
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the n value");
        n=sc.nextInt();


ArrayList<Integer> arr1=new ArrayList<>(prime(n));

            int c = 0;
            for (int p = 0; p < arr1.size(); p++) {

                for (int j = p+1; j < arr1.size(); j++) {
                    if (arr1.get(p) + arr1.get(j) == n) {
                        System.out.println(arr1.get(p) + "+" + arr1.get(j) + "->" + n);
                        c += 1;

                    }

                }

            }
            if (c == 0) {
                System.out.print("the given value doesn't contains values");
            }


    }
}
