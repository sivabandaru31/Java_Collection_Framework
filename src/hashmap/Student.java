package hashmap;
import java.util.Objects;

public class Student {
    int rollNo;
    String name;
    int age;
    double marks;
    String address;

    public Student(int rollNo,String name,int age,double marks,String address){
        this.rollNo=rollNo;
        this.name=name;
        this.age=age;
        this.marks=marks;
        this.address=address;

    }
    @Override
    public int hashCode(){
        //return Objects.hash(rollNo);//write like tthis ih have more parameters
        return rollNo;
    }

    @Override
    public boolean equals(Object o){
        if(this == o) return true;//save memory address
        if(!(o instanceof  Student)) return false;//different type
        Student that=(Student) o;//safe to cast
        return this.rollNo==that.rollNo;
    }

    @Override
    public String toString(){
        return "["+rollNo+" "+name+" "+" "+age+" "+
                marks+" "+address+" ]";
    }
}
