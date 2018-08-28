package second;

/**
 * Created by expert on 7/4/18.
 */
public class Faculty extends Dept {
    int facid;
    String name;

    public Faculty(int deptid,String deptname,int facid, String name) {
        super(deptid,deptname);
        this.facid = facid;
        this.name = name;
    }
    public void printdetails(){
        System.out.println("dept id: "+super.deptid+" dept name: "+super.deptname+" Facid: "+facid+" Fac name: "+name );
    }

    public static void main(String[] args) {
        Faculty f=new Faculty(1,"cse",11,"anu");
        f.printdetails();
    }
}
