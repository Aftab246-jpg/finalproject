package Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import DT0.EmployeeDTO;
import EmployeeRepo.EmployeeRepo;

@Service
public class EmployeeIMP implements EmployeeService
{
	 @Autowired
	    private EmployeeRepo employeeRepo;
	    @Override
	    public String addEmployee(EmployeeDTO employeeDTO)
	       {
	 
	        EmployeeDTO employee = new EmployeeDTO(
	                employeeDTO.getEmployeeid(),
	                employeeDTO.getEmployeename(),
	                employeeDTO.getAddress(),
	                employeeDTO.getMobile()
	        );
	        employeeRepo.save(employee);
	        return employee.getEmployeename();
	    }
	
	
	
}