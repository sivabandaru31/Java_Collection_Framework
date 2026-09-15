import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
public class IteratorDemo {
    public static void main(String[] args) {
       // List<Integer> list=new ArrayList<>(List.of(1,2,3,45,5));
        //System.out.println(list);
//        for(int num:list){
//            if(num==3){
//                list.set(list.indexOf(1),10);
//               // list.remove(Integer.valueOf(1));
//            }
//
//        }
//        System.out.print(list+" ");

//        Iterator<Integer> itr=list.iterator();
//        for(Iterator<Integer> itr=list.iterator();itr.hasNext();){
//            //System.out.print(itr.next()+" ");
//            int num=itr.next();
//            if(num==3){
//                itr.remove();
//            }
//        }
       // System.out.println(list);

//        while(itr.hasNext()){
//           int num= itr.next();
//            System.out.print(num+" ");
//        }

        SivaCollection siva=new SivaCollection();
        for(String S:siva){
            System.out.print(S+" ");

        }
    }
}


class SivaCollection implements  Iterable<String>{
    private String[] data={"c","c++","java"};
    public String[]  getData(){
        return data;

    }
    @Override
    public Iterator<String> iterator(){
        return Arrays.asList(data).iterator();
    }
}
