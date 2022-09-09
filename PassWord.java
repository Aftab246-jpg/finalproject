import java.util.*;
public class PassWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
char x,y;
Scanner s=new Scanner(System.in);
System.out.println("Enter a password:");
x=s.next().charAt(0);
System.out.println("Confirm you Password:");
y=s.next().charAt(0);
if (x!=y)
	try
{
		throw new Exception();
	
}
catch(Exception e) {
	System.out.println("The passsword is incorrect");
}
else 
	System.out.println("Hello");
	}
	

}
