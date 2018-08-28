package second;

/**
 * Created by expert on 7/4/18.
 */
public class Accountholder extends Bank {
    int accno;
    String name;
    float amount;

    public Accountholder(String bankname,int ifsc,String branch,int accno, String name, float amount) {
        super(bankname,ifsc,branch);
        this.accno = accno;
        this.name = name;
        this.amount = amount;
    }
    public static void display(Accountholder[] accarray){

        for(Accountholder obj:accarray){


        System.out.println("Bankname:  "+obj.bankname+" IFSC:  "+obj.ifsc+" Branch:  "+obj.branch+" Account no: "+obj.accno+"  Accountholder: "+obj.name+"  Amount: "+obj.amount);
    }}
    public static void display(int accno,Accountholder[] accarray){
        for(Accountholder obj:accarray){
            if(obj.accno==accno){
                System.out.println("Accno: "+accno+" name: "+obj.name+" Amount: "+obj.amount);
            }

        }


    }

    public static void deposit(int accno,int amount,Accountholder[] accarray){

        for(Accountholder obj:accarray){
            if(obj.accno==accno){
                obj.amount+=amount;
                System.out.println("Accno: "+obj.accno+" Balance: "+obj.amount);
            }
        }
    }


    public static void retrieve(int accno,int amount,Accountholder[] accarray){
        for(Accountholder obj:accarray){
            if(obj.accno==accno){
                obj.amount-=amount;
                System.out.println("Accno: "+obj.accno+" Balance: "+obj.amount);
            }
        }

    }

    public static void main(String[] args) {
        Accountholder a=new Accountholder("SBI",1111,"kottayam",1000,"Angel",5000f);
        Accountholder a1=new Accountholder("Federal",2222,"Ekm",2000,"Ram",900f);
        Accountholder a2=new Accountholder("Axis",3333,"Alapuzha",3000,"anju",40021f);
        Accountholder accarray[]={a,a1,a2};

            display(accarray);
            display(2000,accarray);
            deposit(1000,10,accarray);
            retrieve(3000,10,accarray);
        }
    }

