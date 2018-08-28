package first;
import java.util.*;
/**
 * Created by expert on 7/10/18.
 */
public class Employeemain {

    public static void main(String[] args) {

        Employee emp1=new Employee("ann",15000,"cse");
        Employee emp2=new Employee("manu",17000,"ece");
        ArrayList<Employee>al=new ArrayList();
        //Employee[] earr={emp1,emp2};
        al.add(emp1);
        al.add(emp2);



//        for(Employee obj:al){
//            System.out.println(obj.empname+" "+obj.salary+" "+obj.dept);
//        }

        Iterator itr=al.iterator();//to iterate
        while(itr.hasNext()){//next points to the next element

            Employee obj=(Employee) itr.next();
            if(obj.empname.equals("manu")){

                al.remove(obj);
                break;
            }
            System.out.println(obj.dept+" "+obj.empname+" "+obj.salary);
        }



    }

}
