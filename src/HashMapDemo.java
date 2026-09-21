import java.util.Map;
import java.util.HashMap;
public class HashMapDemo {
    public static void main(String[] args) {
        Map<Integer,String> map=new HashMap<>() ;
        map.put(31,"siva");
        map.put(18,"raja");
        map.put(3,"basha");
        System.out.println(map);
        map.put(31,"amulya");
        System.out.println(map);
        map.remove(3);
        System.out.println(map);
        System.out.println(map.get(31));
//        System.out.println(map.containsKey(31));
//        System.out.println(map.containsValue("siva"));
    }
}
