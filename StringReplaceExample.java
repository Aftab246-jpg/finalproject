
public class StringReplaceExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String s="Hello World";
s=s.replace('i','m');
System.out.println("After Replacing I with m:");
System.out.println(s);
//replaceAll(String regex,String replacement)
String s1="Hello journaldev,Hello Pankej";
s1=s1.replaceAll("Hello", "Hii");
System.out.println("After Replaceing:");
System.out.println(s1);
//replaceFirst(String regex,String replacement)
String s2="Hello guys ,Hello world";
s2=s2.replaceFirst("Hello", "Hii");
System.out.println("After Replaceing:");
System.out.println(s2);
}
}
