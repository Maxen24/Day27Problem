package com.bridgelabz;

import java.util.List;

/*/Create an Employee Payroll
        Service to store Employee
        Payroll into a File - Create Employee Payroll Class of id, name and Salary -
        Populate Test Employee Payroll Object - Write Employee Payroll to File Use File IO -
        Count Number of Entries to ensure the Operation worked
*/
public class EmployeeFileIOService {
    public static String PAYROLL_FILE_NAME="payroll-file.txt";
    public void writeData(List<EmployeePayrollData> employeePayrollList){
        StringBuffer empBuffer=new StringBuffer();
        employeePayrollList.forEach(employee ->{ String employeeDataString=employee.toString().concat("\n");
            empBuffer.append(employeeDataString);
        } );
    }
}
