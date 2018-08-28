package first;

/**
 * Created by expert on 6/29/18.
 */
public class StringEx {
    public static void main(String[] args) {
        String s="hello";
//        String obj=new String("hello world");
//        String s1="hello";
//        s=s.concat("world");
//        StringBuffer s3=new StringBuffer("java");
//        s3.append("hi");
//        System.out.println(s3);
        String s1="hello";
        String s2="abc";
        //String s3="HELLO";
       // boolean b=s.equals(s3);
        //System.out.println(b);
        //System.out.println(s.equalsIgnoreCase(s3));
        //System.out.println(s.equals(s3));
        //System.out.println(s==s1);
        //System.out.println(s==s2);
        String s3="bcd";
        String s4="bef";
        String s5="hello world";
        System.out.println(s3.compareTo(s2));//s3>s2 result +ve integer
        System.out.println(s2.compareTo(s3));//s3<s2 result -ve integer,if equal zero
        System.out.println(s4.compareTo(s3));
        System.out.println(s5.trim());//to eliminate leadimg and trailing space
        System.out.println(s5.length());
        System.out.println(s5.substring(0,5));
        System.out.println(s5.substring(5,10));
        System.out.println(s.charAt(1));


    }
}
