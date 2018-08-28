package first;

import java.util.*;
/**
 * Created by expert on 7/11/18.
 */
public class Accholder extends Bank {

    int accno;
    String name;
    float amount;

    public Accholder(String bankname,int ifsc,String branch,int accno, String name, float amount) {
        super(bankname, ifsc, branch);
        this.accno = accno;
        this.name = name;
        this.amount = amount;

    }

    public static void display(ArrayList<Accholder> al){

        for(Accholder obj:al){


            System.out.println("Bankname:  "+obj.bankname+" IFSC:  "+obj.ifsc+" Branch:  "+obj.branch+" Account no: "+obj.accno+"  Accountholder: "+obj.name+"  Amount: "+obj.amount);
        }}

    public static void display(int accno,ArrayList<Accholder> al){

//        Iterator itr=al.iterator();
//        while(itr.hasNext()){
//            Accholder obj1=(Accholder) itr.next();
//            if(obj)
//        }
        for(Accholder obj:al) {
            if (obj.accno == accno) {

                al.remove(obj);
                break;

            }
        }
//            System.out.println();


        Iterator itr=al.iterator();
        while(itr.hasNext()){
            Accholder obj1=(Accholder) itr.next();

            System.out.println("Account no:"+obj1.accno+"name:"+obj1.name+"Amount"+obj1.amount);
        }

    }

    public static void deposit(int accno,int amount,ArrayList<Accholder> al){

        for(Accholder obj2:al){
            if(obj2.accno==accno){
                obj2.amount+=amount;
                System.out.println("Accno: "+obj2.accno+" Balance: "+obj2.amount);
            }
        }
    }


    public static void retrieve(int accno,int amount,ArrayList<Accholder> al){
        for(Accholder obj3:al){
            if(obj3.accno==accno){
                obj3.amount-=amount;
                System.out.println("Accno: "+obj3.accno+" Balance: "+obj3.amount);
            }
        }

    }

    public static void main(String[] args) {


        Accholder a=new Accholder("SBI",1111,"kottayam",1000,"Angel",5000f);
        Accholder a1=new Accholder("Federal",2222,"Ekm",2000,"Ram",900f);
        Accholder a2=new Accholder("Axis",3333,"Alapuzha",3000,"ann",200f);

        ArrayList<Accholder>al=new ArrayList();
        al.add(a);
        al.add(a1);
        al.add(a2);

        display(al);
        display(1000,al);
        deposit(2000,10,al);
        retrieve(3000,10,al);


    }
}

