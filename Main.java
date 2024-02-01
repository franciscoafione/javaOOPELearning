package javaOOPELearning;

import java.util.Scanner;



public class Main {

    public static Employee createEmployee(){
        //It creates a new Employee.
        Scanner scanner = new Scanner(System.in);
        Employee employee;
        String name, location;
        int age;
        double salary;
    
        try{
            System.out.println("Name:");
            name = scanner.nextLine();
            System.out.println("Age:");
            age = scanner.nextInt();
            System.out.println("Salary:");
            salary = scanner.nextDouble();
            System.out.println("Location:");
            location = scanner.nextLine();
        } finally{
            scanner.close();
        }

        employee = new Employee(name, age, salary, location);
        
        return employee;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        Employee empA, empB;
        char option;

        System.out.println("Welcome, let's create two eemployes:");
        System.out.println("Employee 1:");
        empA = createEmployee();
        System.out.println("Employee 2:");
        empB = createEmployee();


        System.out.println("Select wich employee is going to have a raise (a/b)");
        try{
            option = sc.next().charAt(0);

            do{
                if (option == 'a'){
                    empA.raiseSalary(15.0);
    
                    System.out.println("Well, done!");
                    System.out.println(empA + "'s salary was actualized to: $" + empA.getSalary());
                } else if (option == 'b'){
                    empB.raiseSalary(15.0);
    
                    System.out.println("Well, done!");
                    System.out.println(empB + "'s salary was actualized to: $" + empB.getSalary());
                } else {
                    System.out.println("Invalid option. try again.");
                }
            } while (option != 'a' && option != 'b');
        } finally{
            sc.close();
        }

    }
}