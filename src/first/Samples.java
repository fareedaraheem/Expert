package first;

/**
 * Created by expert on 6/29/18.
 */
public class Samples {
    public static void main(String[] args) {
        int count=5;
        int count1=4;
        for(int i=0;i<5;i++){
            System.out.println(i);
        }
        while(count!=0){
            System.out.println("count="+count);
            count--;
        }
        do{
            System.out.println("count in do"+count1);
            count--;
        }while(count1!=0);
    }
}
