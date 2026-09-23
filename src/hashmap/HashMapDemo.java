package hashmap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class HashMapDemo {
    public static void main(String[] args) {


        HashMap<Integer, Student> map = new HashMap<>();
        Student s1 = new Student(1, "sivakrishna", 20, 98.0, "narasaraopet");
        Student s2 = new Student(2, "raja", 22, 99.0, "narasaraopet");
        Student s3 = new Student(3, "basha", 21, 97.0, "narasaraopet");
        List<Student> list=List.of(s1,s2,s3);
        for(Student s:list){
            map.put(s.rollNo,s);
        }
       // System.out.println(map);
        map.forEach((k,v)-> System.out.println("key"+k+"value"+v));
        System.out.println("........................................");
        map.put(45,new Student(45,"amulya",20,100,"narasaraopet" ));
        map.forEach((k,v)-> System.out.println("key"+k+"value"+v));
        System.out.println("........................................");
        map.putIfAbsent(45,new Student(45,"siva",20,99,"narasaraopet"));
        map.forEach((k,v)-> System.out.println("key"+k+"value"+v));
    }
}
