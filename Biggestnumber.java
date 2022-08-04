import java.util.Scanner;
public class Biggestnumber {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int x,y,z;
Scanner s=new Scanner(System.in);
System.out.println("Enter the first number:");
x=s.nextInt();
System.out.println("Enter the second number:");
y=s.nextInt();
System.out.println("Enter the third:");
z=s.nextInt();
if (x>y&&x>z) {
	System.out.println("Largest number is :"+x);
}
else if(y>z) {
	System.out.println("Largest number is:"+y);
}
else
{
	System.out.println("largest number is:"+z);
}
	}

}
