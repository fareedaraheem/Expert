package second;
import java.util.*;

/**
 * Created by expert on 7/2/18.
 */
public class Sample {
    //public static void main(String[] args) {
//        int a[]=new int[3];
//        int b[]={1,2,3};
//        int []c=new int[4];
//        c[0]=1;
//        c[1]=2;
//        c[2]=4;
//        c[3]=3;
//        int[] d=new int[]{5,9,10,20};
//        int length=c.length;
//        System.out.println(length);
//        for(int i=0;i<=c.length-1;i++){
//            System.out.println(c[i]);
//        }
//        char ch[]={'a','b','c','d'};
//        String[] str={"one","two","three"};
//        for(int i=0;i<=ch.length-1;i++){
//            System.out.println(ch[i]+" ");
//
//        }
//        for(int i=0;i<=str.length-1;i++){
//            System.out.println(str[i]+" ");
//
//        }
//        for(String obj:str){//for each loop
//            System.out.print(obj+" ");
//        }
        //..........................
//        int a[]=new int[5];
//        Scanner s=new Scanner(System.in);
//        System.out.println("Enter the items:");
//        for(int i=0;i<=a.length-1;i++) {
//             a[i] = s.nextInt();
//        }
//        for(int i=0;i<=a.length-1;i++){
//            System.out.println(a[i]+" ");
//        }
        //...................
        public void display(int x[]) {
            for (int i = 0; i < x.length; i++) {
                System.out.println(x[i]);
            }
            System.out.println("after sorting:");
            for (int i = 0; i <= x.length - 1; i++) {
                for (int j = i + 1; j <= x.length - 1; j++) {
                    if (x[i] > x[j]) {
                        int temp = x[i];
                        x[i] = x[j];
                        x[j] = temp;
                    }
                }
            }
            for (int i = 0; i < x.length; i++) {
                System.out.println(x[i]);
            }
        }

    public static void main(String[] args) {
        Sample s=new Sample();
        int[] d=new int[]{4,6,7,1};
        s.display(d);
        int b[][]={{10,2,3},{9,6,7}};
        int row=b.length;
        int col=b[0].length;
        System.out.println(row);
        System.out.println(col);
//        for(int i=0;i<row;i++){
//            for(int j=0;j<col;j++){
//                if(b[i][j]>b[i][j+1]) {
//                    int temp = b[i][j];
//                    b[i][j] = b[i][j + 1];
//                    b[i][j + 1] = temp;
//                }
//            }
//            System.out.println(" ");
//        }
        for(int i=0;i<row;i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(b[i][j] + " ");
            }
            System.out.println(" ");
        }
        System.out.println("after sorting..");
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                for(int k=j+1;k<col;k++)

                    if (b[i][j] > b[i][k ]) {
                        int temp = b[i][j];
                        b[i][j] = b[i][k];
                        b[i][k] = temp;
                    }

            }

        }
        for(int i=0;i<row;i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(b[i][j] + " ");
            }
            System.out.println(" ");
        }
        int c[][]=new int[3][3];
    }
}
