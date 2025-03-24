import java.util.Scanner;
//input=a2b3 the output:aabbb
public class Printcharacter {
    public static void main(String[] args) {
        String str="";
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the string:");
        str=sc.next();
        char[] arr=str.toCharArray();
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]-'0'>1 &&arr[i]-'0'<9)
            {
                for(int j=0;j<arr[i]-'0';j++) {
                    System.out.print(arr[i - 1]);
                }
            }
        }
    }
}
