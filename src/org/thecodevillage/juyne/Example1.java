package org.thecodevillage.juyne;

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


    }
}
