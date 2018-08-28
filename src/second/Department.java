package second;

/**
 * Created by expert on 6/27/18.
 */
public class Department {
    int did;
    String deptname;
    public Department(int d, String name){
        did=d;
        deptname=name;
    }
    public void details(){
        System.out.println("Department id="+did+" Department name="+deptname);
    }

}
