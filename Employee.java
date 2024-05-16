package com.example.hr;

public  class Employee {

    int id;
    double salary;
    String name;

    public void printname() {
        System.out.println("Name : " + name);
    }
    public void printsalary() {
        System.out.println("Salary :" + salary);
    }
    public void printid() {
        System.out.println("ID :" + id);
    }
    public void Details(int i, double s, String n) {
        id = i;
        salary = s;
        name = n;
    }
}