package second;

/**
 * Created by expert on 7/5/18.
 */
public class AccessEx {
    private int a=10;
    protected int c=14;
    public int b=11;
    private String name;
    public void setName(String name){
        this.name=name;
    }
    public String getName(){
        return name;
    }
    public static void main(String[] args) {
        AccessEx ob=new AccessEx();
       // System.out.println(ob.a);


    }
}
