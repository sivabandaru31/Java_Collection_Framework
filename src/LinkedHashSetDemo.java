import java.util.Iterator;
import java.util.LinkedHashSet;


public class LinkedHashSetDemo {
    public static void main(String[] args) {
        LinkedHashSet<String> set=new LinkedHashSet();
        set.add("sivakrishna");
        set.add("microsoft");
        set.add("google");
        set.add("microsoft");
       // System.out.println(set);
        //set.forEach(System.out::println);
        Iterator<String> itr= set.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }

}
