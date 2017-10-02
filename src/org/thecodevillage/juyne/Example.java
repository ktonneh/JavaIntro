package org.thecodevillage.juyne;

import org.thecodevillage.intro.Car;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Example {

    public static void main(String[] args){
        System.out.println("Hello World!!");

        SimpleDateFormat format=new SimpleDateFormat("dd/MM/yyyy");
        Date myDate = new Date();

        System.out.println(format.format(myDate));
    }

    public static void insert(Car myCar){

        //insert(myCar.getAmount(),myCar);

    }

}


