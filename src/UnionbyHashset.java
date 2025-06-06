import java.util.HashSet;
import java.util.LinkedHashSet;

public class UnionbyHashset {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6};
        int[] arr1={2,3,4,12,7,8};
        HashSet<Integer> set=new HashSet<>();
        for(int i=0;i<arr.length;i++)
        {
            set.add(arr[i]);
        }
        for(int i=0;i<arr1.length;i++)
        {
            set.add(arr1[i]);
        }
        System.out.print(set);
        int[] arr2={1,2,3,4,5,6};
        int[] arr3={2,3,99,4,12,7,8};
        LinkedHashSet<Integer> set1=new LinkedHashSet<>();
        for(int i=0;i<arr2.length;i++)
        {
            set1.add(arr2[i]);
        }
        for(int i=0;i<arr3.length;i++)
        {
            set1.add(arr3[i]);
        }
        System.out.print(set1);

    }
}
