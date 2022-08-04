
public class Employee {
	int id;
	String name;
	Address ad;
	public Employee(int id,String name,Address ad) {
		this.id =id;
		this.name =name;
		this.ad =ad;
	}
	void display() {
		System.out.println(id+""+name+""+ad.city+""+ad.state+""+ad.country);
		
	}
	

	public static void main(String[] args) {
	Address add=new Address("Mum","Maha" ,"India");
	Employee emp1=new Employee (101,"aaa",add);
    emp1.display();
	}

}
