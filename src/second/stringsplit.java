package second;
import java.util.Arrays;

/**
 * Created by expert on 7/9/18.
 */
public class stringsplit {
    public static void main(String[] args) {
        String s="hi,hello,how,r,u ";
        String[] a=s.split(",");

        for(String obj:a) {
            System.out.println(obj);
        }

            Object[] object={1,"asdf",10.0f};
            for(Object i:object){
                System.out.println(i);
            }

        int[] a1={9,4,5,1};
        Arrays.sort(a1);
        System.out.println("element is present at "+Arrays.binarySearch(a1,4));
        for (int x:a1){
            System.out.println(x);
        }

        String x="hello";
        char[] ch=x.toCharArray();
        for(char o:ch){
            System.out.println(o);
        }



    }
}
