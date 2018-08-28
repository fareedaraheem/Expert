package test;

import java.util.ArrayList;

/**
 * Created by expert on 8/14/18.
 */
public class Secondmax {

    public static void main(String[] args) {

        int max = 0;
        int smax = 0;
        int a[] = {293, 45, 1, 7, 34, 11, 99, 12};
        max = a[0];
        smax=a[0];
        for (int i = 0; i < a.length; i++) {
            //for (int j = 1; j < a.length; j++) {
                if (a[i] > max) {
                    // smax=max;
                    max = a[i];
                }
                else if(a[i]>smax){
                    smax=a[i];
                }




            }

//            smax=a[0];
//        for(int j=0;j<a.length;j++) {
//            if ((a[j] > smax) && (a[j] < max)) {
//                smax = a[j];
//            }


            System.out.println(max);
            System.out.println(smax);


            // System.out.println(smax);


            int l = a.length / 2;
            System.out.println(l);

            ArrayList<Integer> al = new ArrayList();

            System.out.println("first array:");
            for (int i = 0; i < (a.length) / 2; i++) {
                al.add(a[i]);
            }


            for (Integer i1 : al) {
                System.out.println(i1);
            }

            ArrayList<Integer> al2 = new ArrayList();
            System.out.println("second array");
            for (int i = (a.length) / 2; i < a.length; i++) {
                al2.add(a[i]);

            }

            for (Integer i2 : al2) {
                System.out.println(i2);
            }
        }
    }

