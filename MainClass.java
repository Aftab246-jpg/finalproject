package finalproject;

public class MainClass {
public static void main(String[]args) {
	Y y=new Y();
}
}
class X {
	public  X (int i) {
		System.out.println(1);
	}
}
class Y extends X
{
	public Y() {
		super(66);
		System.out.println("2");
	}
}
