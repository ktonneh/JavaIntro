package org.thecodevillage.intro;

import org.thecodevillage.common.MyFunctions;
import org.thecodevillage.common.Rectangle;

/**
 * Created by Elkibet on 10/3/2017.
 */
public class RectangleMain {

    public static void main(String[] args){
        int length = 0;
        int width = 0;

        int area = 0;
        int perimeter = 0;

        length = 20;
        width = 50;




//        Scanner scanner=new Scanner(System.in);
//        System.out.println("Please enter the length##");
//        length = scanner.nextInt();
//
//        System.out.println("Please enter the width##");
//        width = scanner.nextInt();



        System.out.println("Area is: "+area);
        System.out.println("Perimeter is: "+perimeter);

       //area = length * width;

        //perimeter = 2*(length + width);

        System.out.println("Area is: "+area);
        System.out.println("Perimeter is: "+perimeter);

        area = MyFunctions.calculateArea(length,width);



        perimeter = MyFunctions.calculatePerimeter(length,width);

        System.out.println("Area is: "+area);
        System.out.println("Perimeter is: "+perimeter);


        /**
         * playing with rectangle object
         * we have created getters and setters
         * we have also created 2 constructors
         */
        Rectangle object1=new Rectangle(length,width);
        Rectangle object2=new Rectangle();

        object2.setLength(length);
        object2.setWidth(width);
        area = MyFunctions.calculateArea(object2.getLength(),object2.getWidth());

        System.out.println("Area is: "+area);


        object1 = MyFunctions.calculateArea(object1);

        object2 = MyFunctions.calculateArea(object2);

        System.out.println("Object 1 Area is: "+object1.getArea());
        System.out.println("Object 2 Area is: "+object2.getArea());




    }
}
