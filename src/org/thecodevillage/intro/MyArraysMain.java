package org.thecodevillage.intro;

/**
 * Created by Elkibet on 10/7/2017.
 */
public class MyArraysMain {

    public static void main(String[] args){
        //ArrayList, List

        //students then out
        int[] ids=new int[10];
//        int ids[]=new int[10];
        int ids1[] = {23,40,60};
        ids[0] = 20;
        ids[1] = 50;
        ids[2] = 100;

        //System.out.println(ids[0]+","+ids[1]+","+ids[2]);

        //Loops
        //for loop

        //if

        if(ids1.length > 0){
            int sum=0;
            for (int i=0; i < ids1.length; i++){
                System.out.println(ids1[i]);
                sum += ids1[i];
            }

            System.out.println(sum);

            //while
//            int counter=0;
//            while(counter < ids.length){
//                System.out.println(ids[counter]);
//                counter++;
//            }


            //do while
//            counter = 0;
//             do {
//                 System.out.println(ids[counter]);
//                 counter++;
//             } while (counter < ids.length);





        } else{
            System.out.println(" Array has no items##");
        }






    }
}
