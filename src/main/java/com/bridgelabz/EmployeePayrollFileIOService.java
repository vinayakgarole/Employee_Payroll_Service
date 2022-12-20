package com.bridgelabz;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class EmployeePayrollFileIOService {

    private static String FILE_PATH = "C:\\Users\\Infinty system\\IdeaProjects\\Employee_Payroll_Service\\src\\main\\java\\com\\bridgelabz\\PayrollFile.txt";

    //write employee payroll date method
    public void writeData(List<EmployeePayrollData> employeeList) {
        StringBuffer employeeBuffer = new StringBuffer();
        employeeList.forEach(employee -> {
            String employeeString = employee.toString().concat("\n");
            employeeBuffer.append(employeeString);
        });
        try {
            Files.write(Paths.get(FILE_PATH), employeeBuffer.toString().getBytes());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    //printData method in try-catch block
    public void printData() {
        try {
            Files.lines(new File(FILE_PATH).toPath()).forEach(System.out::println);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    //CountEntries method which is of long type
    public long countEntries() {
        long entries = 0;//initialized variable
        try {
            entries = Files.lines(new File(FILE_PATH).toPath()).count();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return entries;
    }
}