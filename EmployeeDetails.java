package  finalkeyword;

public final class EmployeeDetails {
//Blank final variable
	final int id;
	//parameterized constructor
	EmployeeDetails(int idNum){
		// Blank final variable must be initialized in constructor
		id = idNum;
	}
	void getDetails() {
		System.out.println("Id of the Employee is " + id);
		
	}
	public static void main(String[] args) {
		EmployeeDetails emp = new EmployeeDetails(154);
		emp.getDetails();

	}

}
