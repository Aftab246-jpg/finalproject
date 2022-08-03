package staticpolymorphsim;

public class Addition {
	void sum(int a, int b)
	{
		int c=a+b;
		System.out.println("Addition of two number:" +c);
	}
	void sum(int a, int b,int d)
	{
		int c=a+b+d;
		System.out.println("Addition of three number:"+c);
	}

	public static void main(String[] args) {
		Addition obj=new Addition();
		obj.sum(30, 40);
		obj.sum(85,45, 70);

	}

}
