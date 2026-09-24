package hashmap;

import java.util.HashMap;
import java.util.Map;

public class HashMapMutableKeyDemo {
    public static void main(String[] args) {
        Map<Student ,String> map=new HashMap<>();
        Student s1=new Student(1,"sivakrishna",20,89,"narasaraopet");
        Student s2=new Student(2,"raja",21,98,"narasaraopet");
        Student s3=new Student(3,"basha",22,87,"narasaraopet");
        Student s4=new Student(1,"sivakrishna",20,89,"narasaraopet");

        map.put(s1,"A");
        map.put(s2,"B");
        //map.put(s4,"B  ");
        // using BiConsumer
        map.forEach((k,v)->System.out.println("key= "+k+" value= "+v));
        s1.rollNo=45;
        System.out.println(map.get(s1));

    }
}
