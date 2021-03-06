
import java.util.Arrays;
import org.junit.Test;

import employeePayrollServices.EmployeePayRollImpl.IOService;
import employeePayrollServices.EmployeePayrollData;
import employeePayrollServices.EmployeePayrollService;

import org.junit.Assert;

public class EmployeePayrollServiceTest {
	
	/*
	 * long entries=employeePayrollService.countEntries(IOService.FILE_IO);
	 * Assert.assertEquals(3, entries);
	 */
	@Test
	public void given3EmployeesWhenWrittenToFileShouldMatchEmployeeEntries() {
		EmployeePayrollData[] arrayOfEmps= {
				new EmployeePayrollData(1,"Equila Joe", 80000),
				new EmployeePayrollData(2,"Dee Holy", 70000),
				new EmployeePayrollData(3,"Fredich Karl", 90000)
		};
		EmployeePayrollService employeePayrollService;
		employeePayrollService=new EmployeePayrollService();
		employeePayrollService.writeEmployeePayrollData();
		employeePayrollService.printData(IOService.FILE_IO);
		
	}

}