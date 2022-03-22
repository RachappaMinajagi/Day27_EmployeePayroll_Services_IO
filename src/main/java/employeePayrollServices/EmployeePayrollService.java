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
 *UC3:-Create a Watch Service to watch particular directory along with all Files and
          Sub Directories - Using File IO Count Number of Entries in the file    
 *UC4:-Create an Employee Payroll Service to store Employee Payroll into a File 
 *     - Create Employee Payroll Class of id, name and Salary 
 *     - Populate Test Employee Payroll Object 
 *     - Write Employee Payroll to File Use File IO 
 *     - Count Number of Entries to ensure the Operation worked
 *UC5:- Ability for Employee Payroll Service to print the Employee Payrolls 
 *      - Using File IO print the lines in the Payroll File - Count Number of Entries to ensure the Operation   
 *UC6:- Ability for Employee Payroll Service to read the Employee Payroll File
        so that some analysis can be performed
        - Using the file IO Read the File 
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
	 * Create a Constructor
	 */

	public EmployeePayrollService(List<EmployeePayrollData> employeePayrollList) {
		employeePayrollList = new ArrayList<>();
		this.employeePayrollList = employeePayrollList;

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

	public void printData(IOService ioService) {
		if (ioService.equals(IOService.FILE_IO))
			new EmployeePayrollFileIOService().printData();

	}

	public long countEntries(IOService ioService) {
		long entries = 0;
		if (ioService.equals(IOService.FILE_IO))
			entries = new EmployeePayrollFileIOService().countEntries();
		return entries;
	}

}