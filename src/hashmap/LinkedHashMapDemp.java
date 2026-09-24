package hashmap;

import java.util.HashMap;
import java.util.Map;
import java.util.LinkedHashMap;

class LRUCache<k,v> extends LinkedHashMap<k,v>{
   private static  int maxentries;
   LRUCache(int maxentries){
       super(16,0.75f,true);
       this.maxentries=maxentries;
   }
   @Override
   protected boolean removeEldestEntry(Map.Entry<k,v> eldest){
       return size()>maxentries;
   }


}

public class LinkedHashMapDemp {
    public static void main(String[] args) {
        //Map<Integer,String> cache=new LinkedHashMap<>(16,0.75f,true);
        Map<Integer,String> cache=new LRUCache<>(3);
        cache.put(4,"svakrishna");
        cache.put(3,"raja");
        cache.put(2,"basha");
        cache.put(1,"amulya");
        System.out.println(cache);
        cache.get(4);
        System.out.println(cache);
        cache.get(1);
        System.out.println(cache);
        cache.put(5,"divya");
        System.out.println(cache);
    }
}
