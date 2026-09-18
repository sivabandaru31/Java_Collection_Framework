import java.util.Comparator;
import java.util.NavigableSet;
import java.util.SortedSet;
import java.util.TreeSet;


//Customs Object
class Book /*implements Comparable<Book>*/{
    String name;
    String author;
    int bookid;

public  Book(String name,int bookid,String author){
    this.name=name;
    this.bookid=bookid;
    this.author=author;
}
@Override
    public String toString(){
    return name+" "+bookid+" "+author;
}
//@Override
//    public int compareTo(Book that){
//    return  Integer.compare(this.bookid,that.bookid);
//}


}

public class TreeSetDemo {
    public static void main(String[] args) {
//        TreeSet<Integer> set=new TreeSet<>();
//        set.add(40);
//        set.add(30);
//        set.add(20);
//        set.add(10);
//        System.out.println(set);
//        TreeSet<String> set=new TreeSet<>();
//        set.add("Microsoft");
//        set.add("Google");
//        set.add("Amazon");
//        System.out.println(set);


//        Comparator<Book> byTitle=(b1,b2)->b1.name.compareTo(b2.name);
//        TreeSet<Book> set=new TreeSet<>(byTitle);
//        Book b1=new Book("java",2,"jamsgoslin");
//        Book b2=new Book("python",1,"Guido van Rossum");
//        Book b3=new Book("python",1,"Guido van Rossum");
//        set.add(b1);
//        set.add(b2);
//        set.add(b3);
//        System.out.println(set);

        //implementing TreeSET Methods
        NavigableSet<Integer> set=new TreeSet<>();
        set.add(23);
        set.add(5);
        set.add(89);
        set.add(25);
        set.add(45);
        set.add(50);
//        System.out.println(set);
//        System.out.println(set.ceiling(23));
//        System.out.println(set.floor(23));
//        System.out.println(set.lower(23));
//        System.out.println(set.higher(23));
//        System.out.println(set.pollFirst());
//        System.out.println(set.pollLast());
//        SortedSet<Integer> sortedset=set.subSet(23,50);
//        sortedset.add(30);
//        System.out.println(sortedset);
//        System.out.println(set);
//        SortedSet<Integer> sortedHeadset=set.headSet(25);
//        System.out.println(sortedHeadset);
//        SortedSet<Integer> sortedTailset=set.tailSet(25);
//        System.out.println(sortedTailset);
        NavigableSet<Integer> navigableHeadset =set.headSet(25,true);
        System.out.println(navigableHeadset);

    }
}
