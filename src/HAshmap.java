import java.util.HashMap;

public class HAshmap {
    public static void main(String[] args) {
        HashMap<Integer,String> map=new HashMap<>();
        map.put(1,"bhanu");
        map.put(2,"prasad");
        map.put(3,"yeligeti");
        map.put(2,"Achyuth");

        System.out.println("The Total Map is:"+map);
        System.out.println("The map Size is:"+map.size());
        System.out.println(map.keySet());
        System.out.println(map.get(2));
        System.out.println(map.isEmpty());
        System.out.print(map.containsKey(1));
        System.out.print(map.containsValue("bhanu"));

    }
}
