package second;

/**
 * Created by expert on 7/6/18.
 */
public class ExceptionEx {

    public static void first(){
        second();

    }public static void second(){
        third();
    }
    public static void third(){
        throw new ArithmeticException("exception");
    }

//    public static void main(String[] args) {
//
//        int a[5];
//        String s=null;
//        try{
//            System.out.println(a[6]);
//            s.length();
//            int y=2/0;
//        }catch(ArithmeticException e){
//            System.out.println("exception caught");
//        }
//        catch(NullPointerException e){
//            System.out.println("nullpointer exception");
//        }
//        catch(Exception e){
//            System.out.println("Array Index out of bound exception");
//        }
//        System.out.println("Rest of the code");
//    }
public static void main(String[] args) {
    try{
        first();
        //add(40,30);
    }
    catch(Exception e){
        System.out.println("exception caught");
    }
}
}
