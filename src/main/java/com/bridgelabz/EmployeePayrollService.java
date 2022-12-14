package com.bridgelabz;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmployeePayrollService {

    private List<EmployeePayrollData> employeePayrollList;

    /*
     * Create a default constructor
     */
    public EmployeePayrollService() {

    }

    /*
     * create a parameterized Constructor name as EmployeePayrollService
     * EmployeePayrollList in all data stored about employee
     */
    public EmployeePayrollService(List<EmployeePayrollData> employeePayrollList) {

        /*
         *  The "this" keyword is used to refer to the current object.
         */
        this.employeePayrollList = employeePayrollList;
    }

    /*
     * Create a method name as write
     * Method to print data back to console
     */
    private void write() {
        /*
         * Display the employee data in store in employeePayrollList
         */
        System.out.println("Given Employee Data is : " + employeePayrollList);
    }

    /*
     * Create a method name as readEmployeeData
     * Method to take data from console
     */
    private void readEmployeeData(Scanner sc) {
        /*
         * Enter 1st name employee
         */
        System.out.println("Enter your Name: ");
        String name = sc.nextLine();
        /*
         * Enter employee id for ex- 1 or 2 like that
         */
        System.out.println("Enter your ID: ");
        int id = sc.nextInt();
        /*
         * Enter employee salary ,For ex - 5000 like that
         */
        System.out.println("Enter your Salary: ");
        double salary = sc.nextDouble();
        /*
         * Create object for  EmployeePayrollData class and object name is empData
         */
        EmployeePayrollData empData = new EmployeePayrollData(id, name, salary);
        /*
         * Add the all data to employeePayrollList in empData
         */
        employeePayrollList.add(empData);
    }

    /*
     * Create a main method, all program execute in main method
     */
    public static void main(String[] args) {

        /*
         * Create a scanner class object
         */
        Scanner sc = new Scanner(System.in);
        /*
         * Create arraylist, crete a object name as employeePayrollList
         */
        ArrayList<EmployeePayrollData> employeePayrollList = new ArrayList<EmployeePayrollData>();

        /*
         * Crete object name as employeePayrollService
         */
        EmployeePayrollService employeePayrollService = new EmployeePayrollService(employeePayrollList);
        /*
         * Calling readEmployeeData method from object name as employeePayrollService
         */
        employeePayrollService.readEmployeeData(sc);
        /*
         * Calling write method from object name as employeePayrollService
         */
        employeePayrollService.write();
    }
}