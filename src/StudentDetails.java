import java.util.*;

public class StudentDetails {
    public static void main(String[] args) {
//        HashMap<Integer, List<String>> map=new HashMap<>();
//        map.put(1, Arrays.asList("Bhanu","25","CSE"));
//        System.out.print(map);
        List<String> list=new ArrayList<>();
        HashMap<Integer,List<String>> map=new HashMap<>();
        String name;
        String branch;
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter Student name");
        name=scanner.next();
        list.add(name);
        System.out.print("Enter Branch Name");
        branch=scanner.next();
        list.add(branch);
        map.put(1,list);
        System.out.println(map);
        System.out.println(list);
    }
}
