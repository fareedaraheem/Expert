package second;

/**
 * Created by expert on 7/9/18.
 */
public class TypeCastEx {
    public static void main(String[] args) {
        byte b=10;
        int x=b;//upcasting or implicit type casting
        System.out.println(x);
        int z=10;
        float f=z;
        System.out.println(f);

        float f1=30.50f;
        int y=(int)f1;//downcasting or explicit type casting

        System.out.println(y);

        boolean b1=true;
        Integer i=Integer.valueOf(x);//autoboxing
        Integer i1=new Integer(x);
        int u=i;//unboxing
        Boolean obj=Boolean.valueOf(b1);
//        Float fx;
//        Double d;
//        Byte bb;
//        Long l1;

        String s="123";
        Integer intv=Integer.parseInt(s);
        System.out.println(intv);
        //String ss="abc";
        Float ff=Float.parseFloat(s);
        System.out.println(ff);

    }

}
