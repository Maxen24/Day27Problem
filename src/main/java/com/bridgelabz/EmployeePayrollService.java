package com.bridgelabz;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.*;

        //UC -1 Create an Employee Payroll Service to Read and Write Employee
        //Payroll to a Console - Create Employee Payroll Class of id, name and Salary

    public class EmployeePayrollService {

        public enum IOService {
            CONSOLE_IO, FILE_IO, DB_IO, REST_IO
        }

        private List<EmployeePayrollData> employeePayrollList;

        public EmployeePayrollService() {
        }

        public EmployeePayrollService(List<EmployeePayrollData> employeePayrollList) {
            this.employeePayrollList = employeePayrollList;
        }

        private void readEmployeePayrollData(Scanner consoleInputReader) {

            System.out.println("Enter the Employee Id : ");
            int id = consoleInputReader.nextInt();
            System.out.println("Enter the Employee Name : ");
            String name = consoleInputReader.next();
            System.out.println("Enter the Employee Salary : ");
            double salary = consoleInputReader.nextDouble();

            employeePayrollList.add(new EmployeePayrollData(id, name, salary));
        }

        private void writeEmployeePayrollData(IOService ioService) {
            if (ioService.equals(IOService.CONSOLE_IO)){
                System.out.println("\nWriting Employee Payroll Roster to Console\n" + employeePayrollList);
            }
            else if (ioService.equals(IOService.FILE_IO)){
                new EmployeeFileIOService().writeData(employeePayrollList);
            }



        }

            public static void main (String[]args){

                System.out.println("---------- Welcome To Employee Payroll Application ----------\n");
                ArrayList<EmployeePayrollData> employeePayrollList = new ArrayList<EmployeePayrollData>();
                EmployeePayrollService employeePayrollService = new EmployeePayrollService(employeePayrollList);
                Scanner consoleInputReader = new Scanner(System.in);

                employeePayrollService.readEmployeePayrollData(consoleInputReader);
                employeePayrollService.writeEmployeePayrollData(IOService.FILE_IO);

            }

        }


