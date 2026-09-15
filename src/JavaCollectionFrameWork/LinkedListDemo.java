package JavaCollectionFrameWork;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class LinkedListDemo {
    public static void main(String[] args) {
        LinkedList<Integer> list=new LinkedList<>();
        LinkedList<Integer> list1=new LinkedList<>(List.of(1,2,3,4,5,6,7));

        list.add(10);//AutoBoxing->premetive data type converted into WapperClass bject
        list.add(20);
        list.add(30);
        list.addFirst(50);
        //System.out.println(list);
        list.addAll(0,list1);

        Iterator<Integer> iterator=list.descendingIterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
        System.out.println(list);
    }
}
