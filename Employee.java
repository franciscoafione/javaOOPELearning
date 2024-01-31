package javaOOPELearning;

public class Employee {
    private String name;
    private int age;
    private double salary;
    private String location;

    public Employee(String theName, int theAge, double theSalary, String theLocation){
        this.name = theName;
        this.age = theAge;
        this.salary = theSalary;
        this.location = theLocation;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getSalary() {
        return salary;
    }

    public String getLocation() {
        return location;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public void raiseSalary(double percentajeIncrease){
        double increase = (this.salary * percentajeIncrease) / 100;
        this.salary += increase;
    }

}
