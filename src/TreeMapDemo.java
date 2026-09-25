import com.sun.source.tree.Tree;

import java.util.HashMap;
import java.util.TreeMap;
import java.util.Map;

public class TreeMapDemo {
    public static void main(String[] args) {
        TreeMap<Integer,String> tm=new TreeMap<>();
        Map<Integer,String> map=Map.of(12,"om",1,"rahul",10, "Aaksh");
//        tm.put(1,"Microsoft");
//        tm.put(2,"google");
//        tm.put(3,"Amazon");
        tm.putAll(map);
        System.out.println(tm);
        tm.forEach((k,v)-> System.out.println("key= "+k+"value="+v));
        tm.put(24,"microsoft");
        System.out.println("-----------------------------------------");
        tm.forEach((k,v)-> System.out.println("key= "+k+"value="+v));
        System.out.println(tm.get(12));

    }
}
