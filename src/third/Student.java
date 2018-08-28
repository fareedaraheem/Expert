package third;

import org.jetbrains.annotations.NotNull;

import java.util.TreeSet;

/**
 * Created by expert on 7/16/18.
 */
public class Student implements Comparable<Student> {

int rollno;
String name;
int age;

    public Student(int rollno, String name, int age) {
        this.rollno = rollno;
        this.name = name;
        this.age = age;
    }


    public static void main(String[] args) {
        TreeSet<Student> obj=new TreeSet<Student>();
        obj.add(new Student(1,"anu",26));
        obj.add(new Student(2,"Maria",21));
        obj.add(new Student(3,"rukku",19));

        for(Student ob:obj){

            System.out.println(ob.rollno+" "+ob.name+" "+ob.age);
        }
    }


    @Override
    public int compareTo(@NotNull Student ob) {


        if (rollno > ob.rollno) {
            return 1;
        } else if (rollno < ob.rollno) {

            return -1;
        } else {
            return 0;
        }
    }
}
