package org.thecodevillage.intro;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Elkibet on 10/7/2017.
 */
public class MyCarMain {

    public static void main(String[] args){
        List<Car> kaList=new ArrayList<>();

//        writeOutput(myCar);
//        writeOutput(myCar2);
//        writeOutput(myCar3);

        kaList.add(new Car("Toyota","Green"));
        kaList.add(new Car("Subaru","Yellow"));
        kaList.add(new Car("Probox","Red"));

       writeOutput(kaList);


        List<Car>  g=getCars(kaList);


    }


    public static void writeOutput(Car kaGari){
        System.out.println("Name: "+kaGari.getName());
        System.out.println("Color: "+kaGari.getColor());
    }

    public static void writeOutput(List<Car> carList){
//        for (Car car: carList){
//            writeOutput(car);
//        }

        for (int p=0; p < carList.size();p++) {
            writeOutput(carList.get(p));
        }
    }

    public static List<Car> getCars(List<Car> list){
        List<Car> mylist=new ArrayList<>();
        for (Car car: list){
           mylist.add(car);
        }
        return mylist;
    }
}
