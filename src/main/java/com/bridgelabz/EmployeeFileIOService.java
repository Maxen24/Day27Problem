package com.bridgelabz;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

/*/UC-4 Create an Employee Payroll
        Service to store Employee
        Payroll into a File - Create Employee Payroll Class of id, name and Salary -
        Populate Test Employee Payroll Object - Write Employee Payroll to File Use File IO -
        Count Number of Entries to ensure the Operation worked
*/
public class EmployeeFileIOService {
    public static String PAYROLL_FILE_NAME="payroll-file.txt";
    public void writeData(List<EmployeePayrollData> employeePayrollList) {
        System.out.println("Its Working");
        StringBuffer empBuffer = new StringBuffer();
        employeePayrollList.forEach(employee -> {
            String employeeDataString = employee.toString().concat("\n");
            empBuffer.append(employeeDataString);
        });

        //UC-5 Ability for Employee Payroll Service to print
        //the Employee Payrolls -
        // Using File IO print the lines in the Payroll File - Count Number of Entries to ensure the Operation worked
        try {
            Files.write(Paths.get(PAYROLL_FILE_NAME), empBuffer.toString().getBytes());

        } catch (IOException e) {

        }
    }

    public void printData(){
        try {
            Files.lines(new File("payroll-file.txt").toPath()).forEach(System.out::println);
        }catch(IOException e){

        }
    }
}
