package org.thecodevillage.juyne;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Example {

    public static void main(String[] args){
        System.out.println("Hello World!!");

        SimpleDateFormat format=new SimpleDateFormat("dd/MM/yyyy");
        Date myDate = new Date();

        System.out.println(format.format(myDate));

       System.out.println("Name: "+showName());


        List<Student> studentList=new ArrayList<>();
        Student student1= new Student();
        student1.setName("Hildah");
        student1.setAge(20);

        Student student2= new Student();
        student2.setName("John");
        student2.setAge(25);

        studentList.add(student1);
        studentList.add(student2);

        outputStudentDetails(student1.getName(),student1.getAge());
        outputStudentDetails("Hildah",20);
        outputStudentDetails(student1);


        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter no of students ");
        int noOfStudents = scanner.nextInt();

        for (int i=0; i < noOfStudents; i++){
            Student student=new Student();

            System.out.println("Enter name of student "+ i+1);
            student.setName(scanner.next());


            System.out.println("Enter age of student "+ i+1);
            student.setAge(scanner.nextInt());
            studentList.add(student);

            //call your db function
            //myDb.nameOfFunctio(student)
        }


        for (int i=0; i < studentList.size(); i++){
//            outputStudentDetails(studentList.get(i));
            outputStudentDetails(studentList.get(i).getName(), studentList.get(i).getAge());
        }

    }

    public static void insert(){

        //insert(myCar.getAmount(),myCar);

    }

    public static String showName(){

        return "Elly";
    }

    public static void outputStudentDetails(String name, int age){
        System.out.println("Name: "+name);
        System.out.println("Age: "+age);
    }

    public static void outputStudentDetails(Student student){
        System.out.println("Name: "+student.getName());
        System.out.println("Age: "+student.getAge());
    }

}


