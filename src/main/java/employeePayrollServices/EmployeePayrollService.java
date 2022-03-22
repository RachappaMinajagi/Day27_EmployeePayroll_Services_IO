package employeePayrollServices;

/**
 * UC1:- Create an Employee Payroll Service to Read and Write Employee 
 * Payroll to a Console - Create Employee Payroll Class of id, name and Salary
 * UC2:- Write a program to demonstrate File Operations like
         - Check File Exists
         - Delete File and Check File Not Exist
         - Create Directory
         - Create Empty File
         - List Files, Directories as well as Files with Extension
    UC3:-Create a Watch Service to watch particular directory along with all Files and
          Sub Directories - Using File IO Count Number of Entries in the file    
 */

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmployeePayrollService {
	public enum IOService {
		CONSOLE_IO, FILE_IO, DB_IO, REST_IO
	}

	private List<EmployeePayrollData> employeePayrollList = new ArrayList<>();;

	public EmployeePayrollService() {
		employeePayrollList = new ArrayList<>();
	}

	/**
	 * public EmployeePayrollService(List<EmployeePayrollData> employeePayrollList)
	 * { employeePayrollList=new ArrayList<>();
	 * 
	 * }
	 */

	public static void main(String[] args) {
		EmployeePayrollService employeePayrollService = new EmployeePayrollService();
		Scanner consoleInputReader = new Scanner(System.in);
		employeePayrollService.readEmployeePayrollData(consoleInputReader);
		employeePayrollService.writeEmployeePayrollData();

	}

	private void readEmployeePayrollData(Scanner consoleInputReader) {
		System.out.println("Enter Employee ID: ");
		int id = consoleInputReader.nextInt();
		System.out.println("Enter Employee Name: ");
		String name = consoleInputReader.next();
		System.out.println("Enter Employee Salary: ");
		double salary = consoleInputReader.nextDouble();
		employeePayrollList.add(new EmployeePayrollData(id, name, salary));
	}

	public void writeEmployeePayrollData() {
		System.out.println("\nWriting Employee Payroll to console\n" + employeePayrollList);
	}

}