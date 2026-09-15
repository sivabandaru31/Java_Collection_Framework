import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.ArrayList;
//Comparing custom object using Comparable integerface
// class Student implements Comparable<Student>{
//    String name;
//    double marks;
//    int rollNo;
//
//    public Student(int rollNo,String name,double marks){
//        this.rollNo=rollNo;
//        this.name=name;
//        this.marks=marks;
//    }
//    @Override
//     public int compareTo(Student that){
//       // return this.rollNo-that.rollNo;
//       // return Integer.compare(this.rollNo,that.rollNo);//print Ascending order
//        //return Integer.compare(that.rollNo,this.rollNo);// print decending order
//        return Double.compare(this.marks,that.marks);
//    }
//    @Override
//     public String toString(){
//        return rollNo+" "+name+" "+marks;
//    }
//
////     @Override
////     public int compareTo(Student o) {
////         return 0;
////     }
// }



   //     Comparing custom object using Comparator
class Student {
    String name;
    double marks;
    int rollNo;

    public Student(int rollNo,String name,double marks){
        this.rollNo=rollNo;
        this.name=name;
        this.marks=marks;
    }
//    @Override
//    public int compareTo(Student that){
//        // return this.rollNo-that.rollNo;
//        // return Integer.compare(this.rollNo,that.rollNo);//print Ascending order
//        //return Integer.compare(that.rollNo,this.rollNo);// print decending order
//        return Double.compare(this.marks,that.marks);
//    }
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

        List<Student> studentsList=List.of(new Student(4,"sivakrishna",78),
                new Student(1,"raja",88),
                new Student(3,"basha",87)
        );

        List<Student> studentsAl=new ArrayList<>(studentsList);
        Comparator<Student> byRollNo=(s2,s1)->Integer.compare(s1.rollNo,s2.rollNo);
        studentsAl.sort(byRollNo);
//        Collections.sort(studentsAl);
        System.out.println(studentsAl);



        List<Integer>  numbers=List.of(34,1,67,3,10,-4,99);
        List<Integer> numbersAl=new ArrayList<>(numbers);
        Collections.sort(numbersAl,Collections.reverseOrder());
        System.out.println(numbersAl);

//        List<String> names=List.of("divya","noushin","basha","amulya","raja","sivakrishna");
//        List<String> namesAl=new ArrayList<>(names);
//        Collections.sort(namesAl);
//        System.out.println(namesAl);


//        System.out.println(numbersAl);
    }
}
