import java.util.Scanner;

public class Stringcount {
    public static void main(String[] args) {
        String str =" ";
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the string");
        str=sc.nextLine();

        String[] arr = str.split(" ");


        for (int i = 0; i < arr.length; i++) {
            int count = 1;
                if(arr[i]=="")
                {
                    continue;
                }

            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i].equals(arr[j])) {
                    count++;
                    arr[j] = "";
                }
            }

            if (count > 1 && !arr[i].equals("")) {
                System.out.println(arr[i] + ": " + count);

            }
            if(count==1)
            {
                System.out.print("please enter correct value");
                break;
            }


        }

    }

}
