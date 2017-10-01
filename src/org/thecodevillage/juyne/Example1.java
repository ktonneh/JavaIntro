package org.thecodevillage.juyne;

import org.thecodevillage.common.MyFunctions;
import org.thecodevillage.intro.Car;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

/**
 * Created by Elkibet on 9/26/2017.
 */
public class Example1 {

    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        try{
            List<Car> myCars=new ArrayList<>();
            int noOfCars = 0;
            System.out.println("Enter number of students");
            noOfCars = scanner.nextInt();
            int counter =0;
            if (noOfCars > 0){
                while(counter < noOfCars){
                    Car car=new Car();
                    System.out.println("Enter Name of Car "+ counter);
                    car.setName(scanner.next());

                    System.out.println("Enter Color of Car "+ counter);
                    car.setColor(scanner.next());
                    myCars.add(car);
                    counter++;
                }

                System.out.println(myCars.size());

            } else {
                System.out.println("No of Students should be 1 and above");
            }
        } catch (NumberFormatException e){
            e.printStackTrace();
            System.out.println("Only Integers are required");
        } catch (InputMismatchException ex){
            System.out.println("Only Integers Inputs are required");
            ex.printStackTrace();
        }


        MyFunctions.printName("Hildah");

      ;

        MyFunctions.printReturnName(MyFunctions.printReturnName("Nicko"),8);

        //#Code1
        //Car carYangu=new Car("Legacy","Red");
        Car car2=new Car();
        car2.setName("Gari");
        car2.setColor("Yellow");
        //carYangu.setN

        List<Car> listGari=new ArrayList<>();
        listGari.add(car2);

        //#Code2
        List<Car> listGari2=new ArrayList<>();
        //Car ngari=;
        listGari2.add(new Car("legacy","Gree"));

        //##Using Constructors
        listGari2.add(new Car("Toyota",40,"Green",120,200));
        listGari2.add(new Car("Toyota",40,"Green",120,200));
        listGari2.add(new Car("Toyota",40,"Green",120,200));
        listGari2.add(new Car("Toyota",40,"Green",120,200));






    }
}
