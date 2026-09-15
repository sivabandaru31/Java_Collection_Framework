import java.util.ArrayList;
import java.util.List;
import java.util.Collections;
//import java.util.*;

public class Introduction {
    public static void main(String[] args) {
       // Collections
       //ArrayList list=new ArrayList();
        ArrayList<Integer> list=new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        ArrayList<Integer> list1=new ArrayList<>(List.of(1,2,3,4,5,6));
        System.out.println(list1 );
//        list1.add(1);
//        list1.add(2);
//        list1.add(30);


       //list.addAll(list1);
       //list.removeAll(list1);
       //list.retainAll(list1);
       //list.addAll(list1);
      // list.remove(0);
//        System.out.println(list);
//        list.addAll(1,list1);
//        System.out.println(list);
//        System.out.println(list.contains(9));
//
        List<Integer> list3=list.subList(1,3);
        System.out.println("sub list is "+list3);
        list3.add(89);
        System.out.println("modified list :"+list3);


        System.out.println(list);
        //list.add(0,5);
        list.set(1,9);
        System.out.println("modified list :"+list3);



//        System.out.println(list);
//
//        System.out.println(list);
//        //String name=(String)list.get(3);
//        list.add(0,25);
        //list.add(1,23);
        //System.out.println(list);


        for(int i=0;i<list.size();i++){
            System.out.print(list.get(i)+" ");
        }
        System.out.println();
        for(int num: list){
            System.out.print(num+" ");
        }
    }
}
