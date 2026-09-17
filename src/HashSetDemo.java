import java.util.HashSet;
import java.util.Objects;


class Customer{
    String name;
    int id;

    public Customer(String name,int id){
        this.id=id;
        this.name=name;
    }
    @Override
    public int hashCode(){
        return Objects.hash(name,id);
    }

    @Override
    public boolean equals(Object obj) {
        if(this==obj) return true;
        if(!(obj instanceof Customer)) return false;
        Customer that=(Customer) obj;
        return this.name.equals(that.name) && that.id==that.id;
    }

    @Override
    public String toString(){
        return name+" - "+id;
    }

}
public class HashSetDemo {
    public static void main(String[] args) {
        HashSet<Customer> set = new HashSet<>();
        Customer c1=new Customer("Amulya",1);
        Customer c2=new Customer("Noushine",2);
        Customer c3=new Customer("Divay",3);
        Customer c4=new Customer("Amulya",1);
        String str="Amulya";
        System.out.println(c1.equals(c4));
        set.add(c1);
        set.add(c2);
        set.add(c3);
        set.add(c4);
        System.out.println(set);
//        set.add(10);
//        set.add(20);
//        set.add(30);
//        set.add(40);
//        set.add(90);
//        set.add(50);
//        System.out.println(set);
    }

}
