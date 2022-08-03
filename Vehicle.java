package vehicle;

public class Vehicle {
void run() {
	System.out.println("vehicle is runing");
}
	public static void main(String[] args) {
		Car c= new Car();
		c.run();
		Vehicle v=new Vehicle();
		v.run();
		Vehicle v1=new Car();
		v1.run();

	}

}
class Car extends Vehicle
{
	void run()
	{
		System.out.println("Car running");
	}
}
