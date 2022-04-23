package com.bridgelabz;

import java.util.Random;

public class EmployeeWageBuilder {

    public static void main(String args[]) {
        System.out.println("Welcome to Employee Wage Computation");
        int IS_FULL_TIME = 2;
        int IS_PART_TIME = 1;
        int EMP_RATE_PER_HOUR = 20;
        int empHours = 0;
        int empWage = 0;
        Random random = new Random();
        int empCheck = random.nextInt(3);
        if (empCheck == IS_FULL_TIME) {
            empHours = 8;
            System.out.println("Employee is Present");
        } else if(empCheck == IS_PART_TIME) {
            empHours = 4;
            System.out.println("Employee is in Part Time");
        }
        else {
            empHours = 0;
            System.out.println("Employee is Absent");
        }
        empWage = empHours * EMP_RATE_PER_HOUR;
        System.out.println("The daily wages of an employee is : " + empWage);
    }
}
