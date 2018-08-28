package second;

/**
 * Created by expert on 7/3/18.
 */
public class PolyEx {
    //method overloading
    public void display(){
        System.out.println("display function");

    }
    public void display(String msg){
        System.out.println(msg);
    }

    public static void main(String[] args) {
        PolyEx p=new PolyEx();
        p.display();
        p.display("helloo");

    }

}
