import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Anagram {
    public static void main(String[] args) {
        String str = "";
        String str1 = "";
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the string1");
        str=sc.next();
        System.out.println("enter the string2");
        str1=sc.next();

        if (str.length() != str1.length()) {
            System.out.print("Enter correct anagram");
            return;
        }

        HashMap<Character, Integer> map1 = new HashMap<>();
        HashMap<Character, Integer> map2 = new HashMap<>();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            map1.put(ch, map1.getOrDefault(ch, 0) + 1);
        }
        for (int i = 0; i < str1.length(); i++) {
            char ch = str1.charAt(i);
            map2.put(ch, map2.getOrDefault(ch, 0) + 1);
        }

        if (map1.equals(map2)) {
            System.out.print("Yes, these are anagrams: " + str + " " + str1);
        } else {
            System.out.print("Not an Anagram");
        }
    }
}
