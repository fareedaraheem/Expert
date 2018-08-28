package first;

/**
 * Created by expert on 6/29/18.
 */
public class Pattern {
    public void printpattern(int n){
        for(int i=0;i<5;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print(j+" ");

            }
            System.out.println(" ");
        }

    }
    public static void main(String[] args) {
        Pattern p=new Pattern();
        p.printpattern(5);
    }
}
