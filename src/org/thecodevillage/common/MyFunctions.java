package org.thecodevillage.common;

/**
 * Created by Elkibet on 9/17/2017.
 */
public class MyFunctions {

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
}
