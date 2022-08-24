import java.util.Locale;
public class StringFormatExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String s="jounradev.com";
//%s is used to append the string
System.out.println(String.format("This is %s",s));
//using locale as Locale.US
System.out.println(String.format(Locale.US,"%f",3.14));
	}

}
