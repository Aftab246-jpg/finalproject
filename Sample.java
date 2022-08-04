
class Parent
{
	void run() {
		System.out.println("parent");
	}
}

	public class Sample extends Parent{
		void run() {
			System.out.println("Derived");
		}
		
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
  Parent p =new  Parent();
  p.run();
	}

}
