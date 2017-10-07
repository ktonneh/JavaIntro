package org.thecodevillage.common;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Elkibet on 9/17/2017.
 */
public class MyFunctions {
    public static final Double PI = 3.142;

    public static int divide(int a,int b){
        return a/b;
    }


    public static double divide(double a,double b){
        return a/b;
    }


    public static void printName(String name){
        System.out.println("Name: "+name);
    }

    public static String printReturnName(String name){
        System.out.println("Name: "+name);
        return name;
    }

    public static void printReturnName(String name,int age){
        System.out.println("Name: "+name+"\tAge: "+age);
    }

    public static int calculateArea(int length,int width){
//        int area=0;
//        area = ;
        return length * width;
    }

    public static int calculatePerimeter(int length, int width){
        return 2*(length+width);
    }


    public static Rectangle calculateArea(Rectangle rectangle){
        int area=0;
        area = rectangle.getLength() * rectangle.getWidth();
        rectangle.setArea(area);
        return rectangle;
    }


    public static List<Rectangle> calculateArea(List<Rectangle> rectangleList){
        int area=0;
        area = rectangleList.get(0).getLength() * rectangleList.get(0).getWidth();
        rectangleList.get(0).setArea(area);
        List<Rectangle> myList=new ArrayList<>();
//        myList.add(rectangle);
        return myList;
    }


    //caculate area of a circle
    //perimetr of a circle

    //myCycle - radius
    //area()
    //permetr()
    //
    //MyCircleMain-main


}
