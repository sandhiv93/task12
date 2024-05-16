package com.example.hrtest;

import com.example.hr.Employee;

public class EmployeeTest {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        Employee solve = new Employee();
        solve.Details(4024, 25000, "AnandhSrinivasan");
        solve.printid();
        solve.printname();
        solve.printsalary();
    }
}