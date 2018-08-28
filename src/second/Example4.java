package second;

/**
 * Created by expert on 7/6/18.
 */
public class Example4 extends AbstractEx {

    @Override
    public void add(int x, int y) {
        int sum=x+y;
        System.out.println(sum);
    }

    @Override
    public String showMessage(String message) {
        return message;
    }

    public static void main(String[] args) {

        Example4 obj=new Example4();
        obj.add(1,2);
        obj.display();
        System.out.println( obj.showMessage("hello"));
        AbstractEx e=new Example4();
        e.add(3,5);
    }
}
