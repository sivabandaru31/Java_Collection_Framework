import java.util.Comparator;
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


        Comparator<Book> byTitle=(b1,b2)->b1.name.compareTo(b2.name);
        TreeSet<Book> set=new TreeSet<>(byTitle);
        Book b1=new Book("java",2,"jamsgoslin");
        Book b2=new Book("python",1,"Guido van Rossum");
        Book b3=new Book("python",1,"Guido van Rossum");
        set.add(b1);
        set.add(b2);
        set.add(b3);
        System.out.println(set);
    }
}
