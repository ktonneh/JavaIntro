package org.thecodevillage.intro;

import org.thecodevillage.common.MyFunctions;
import org.thecodevillage.common.Rectangle;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Elkibet on 10/10/2017.
 */
public class ArrayTena {


    public static void main(String[] args){
        int[] myData = {23,4,5,5,5,5};
        int[] mydataIngne= new int[10];

        //List/ArrayList
        //
        List<String> kaList=new ArrayList<>();
        kaList.add("Elkanah");
        kaList.add("Stanl");
        kaList.add("Hldah");
        kaList.add("Daicy");
        kaList.add("Mimi");
        kaList.add("sisi");

        for(int x=0; x < kaList.size(); x++){
            String myValue=kaList.get(x);
            System.out.println(myValue);
        }


        List<Integer> listYaIntegers=new ArrayList<>();
        listYaIntegers.add(11);
        listYaIntegers.add(18);
        listYaIntegers.add(16);
        listYaIntegers.add(56);
        listYaIntegers.add(3);

        int y=listYaIntegers.get(1);

        for(int x=0; x < listYaIntegers.size(); x++){
            int myValue=listYaIntegers.get(x);
            System.out.println(myValue);
        }


        //System.out.println(listYaIntegers.get());

        //
        List<Rectangle> lstRect=new ArrayList<>();
        Rectangle react=new Rectangle(40,50);
        react.setArea(MyFunctions.calculateArea(react.getLength(),react.getWidth()));
        lstRect.add(react);

        Rectangle r=lstRect.get(0);

        r.getArea();
        r.getLength();
        r.getWidth();

        lstRect.get(0).getLength();
        lstRect.get(0).getWidth();
        for(int x=0; x < lstRect.size(); x++){
            Rectangle myValue=lstRect.get(x);
            System.out.println(myValue.getArea());
            System.out.println(myValue.getLength());
            System.out.println(myValue.getWidth());
        }

        /**
         *
         * *
         * **
         * ***
         * *****
         */

        for (int x=1; x <= 10; x++){
            for (int j=1; j<= 10; j++){
                System.out.println(x +" X " +j +"\t= "+x*j);
            }
        }
    }



}
