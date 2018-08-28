package second;

/**
 * Created by expert on 7/3/18.
 */
public class Student {
    int id;
    String name;

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public static void main(String[] args) {

        Student s=new Student(1,"sam");
        Student s1=new Student(2,"roy");

        int[] a={1,2,3};
        String ss[]={"abc","def"};
        Student sarray[]={s,s1};
        for(Student obj:sarray){
            System.out.println(obj.id+" "+obj.name);
        }
    }
}
