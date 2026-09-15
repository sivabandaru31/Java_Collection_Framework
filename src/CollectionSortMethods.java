import java.util.Collections;
import java.util.List;
import java.util.ArrayList;

 class Student implements Comparable<Student>{
    String name;
    double marks;
    int rollNo;

    public Student(int rollNo,String name,double marks){
        this.rollNo=rollNo;
        this.name=name;
        this.marks=marks;
    }
    @Override
     public int compareTo(Student that){
        return this.rollNo-that.rollNo;
    }
    @Override
     public String toString(){
        return rollNo+" "+name+" "+marks;
    }

//     @Override
//     public int compareTo(Student o) {
//         return 0;
//     }
 }
    public class CollectionSortMethods {
    public static void main(String[] args) {

        List<Student> studentsList=List.of(new Student(1,"sivakrishna",78),
                new Student(2,"raja",88),
                new Student(3,"basha",87)
        );

        List<Student> studentsAl=new ArrayList<>(studentsList);
        Collections.sort(studentsAl);
        System.out.println(studentsAl);






//        List<Integer>  numbers=List.of(34,1,67,3,10,-4,99);
//        List<String> names=List.of("divya","noushin","basha","amulya","raja","sivakrishna");
//        List<String> namesAl=new ArrayList<>(names);
//        Collections.sort(namesAl);
//        System.out.println(namesAl);
//        List<Integer> numbersAl=new ArrayList<>(numbers);
//        Collections.sort(numbersAl);
//        System.out.println(numbersAl);
    }
}
