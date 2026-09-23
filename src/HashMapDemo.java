import java.util.*;

public class HashMapDemo {
    public static void main(String[] args) {
        Map<Integer,String> map=new HashMap<>() ;
        map.put(31,"siva");
        map.put(18,"raja");
        map.put(3,"basha");
        map.put(2,"nec");
        System.out.println(map);
        map.put(31,"amulya");
        System.out.println(map);
       // map.remove(3);
        System.out.println(map);
        System.out.println(map.get(31));
//        System.out.println(map.containsKey(31));
//        System.out.println(map.containsValue("siva"));


        System.out.println("iterating through keySet()..");
        Set <Integer> keys=map.keySet();
        Iterator<Integer>  itr=keys.iterator();
        while(itr.hasNext()){//using Iterator
            int key=itr.next();
            if(key%2==0){
              //  itr.remove();
                System.out.println(key);
            }
        }
        //System.out.println(map);
//        for (Integer key:keys) {//without iterater it will give wxception concerent modification exception
//            if (key == 45) {
//                keys.remove(key);
//                //System.out.println(key + " " + map.get(key));
//            }
//
//        }
        System.out.println(map);
       // System.out.println(keys);


        System.out.println("iterate through entrySet() :");
        System.out.println(map);
        Set<Map.Entry<Integer,String>> entries =map.entrySet();
        Iterator<Map.Entry<Integer,String>> itre=entries.iterator();//
        while(itre.hasNext()){
            Map.Entry<Integer,String> entry=itre.next();
            if(entry.getKey()==3){
                itre.remove();
            }
        }
        //System.out.println(entries);
//        for(Map.Entry<Integer,String> entry:entries){//without iterator
//            if(entry.getKey()==3){
//                map.put(3,"divya");
//                //entry.setValue("divya");
//            }
//            //System.out.print(entry.getKey()+" "+entry.getValue());
//        }
       System.out.println(map);

        System.out.println("sorting the hash map...");
        List<Map.Entry<Integer,String>> list=new ArrayList<>(map.entrySet());
        list.sort(Map.Entry.comparingByKey());
        LinkedHashMap<Integer,String> sortedMap=new LinkedHashMap<>();
        for(Map.Entry<Integer,String> entry:list){
            sortedMap.put(entry.getKey(),entry.getValue());
        }


        System.out.println("iterating through Values().. ");
       Collection<String> values= map.values();
        System.out.println(values);
        Iterator<String> it=values.iterator();
        while(it.hasNext()){
            String value=it.next();
            if(value.startsWith("b"));
            it.remove();
        }
        System.out.println(map);


        values.removeIf(abc-> abc.startsWith("b"));
    }
}
