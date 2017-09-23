package org.thecodevillage.intro;

import org.thecodevillage.common.MyFunctions;

import java.util.Scanner;

public class Variables{



    public static void main(String[] args){
        double m,n, doubleResult=0;
        int a,b,intResult = 0;
        m = 80.85;
        n= 10.6;
        a = 80;
        b = 10;


//        Scanner scanner=new Scanner(System.in);
//        System.out.println("enter the first number");
//        a = scanner.nextInt();
//
//        System.out.println("enter the 2nd number");
//        b = scanner.nextInt();
//
//
//        //doubleResult = MyFunctions.divide(m,n);
//        intResult = MyFunctions.divide(a,b);
//        System.out.println("##"+intResult);

        Car someCar=new Car();
        String name="";
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter name of the car");
        name = scanner.nextLine();

        someCar.setName(name);
        System.out.println("enter no of wheels");
        someCar.setNoOfWheels(scanner.nextInt());
        int mm=3;

        System.out.println(mm > 5 ? true : false);




        System.out.println("Car Output");
        System.out.println("name:"+someCar.getName());
        System.out.println("wheels:"+someCar.getNoOfWheels());








    }



}