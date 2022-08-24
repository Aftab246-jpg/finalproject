
public class StrCmp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String s1="a/b/c";
String[]a1=s1.split("/");
System.out.println("Split string using only regex");
for (String string :a1);{
System.out.println(string);

	}
	String[]a2= s1.split("/",2);
	System.out.println("Split string using regex and limit:");
	for (String string:a2) {
		System.out.println(string);
	}
	
	}
}
