class Rose {

public static void main (String args[]) {

try{

int x[]= {};

System.out.println(x.length);

for(int j=0; j<=x.length;j++) {

System.out.println(x[j+1]);

}}catch(IndexOutOfBoundsException ne)

{

ne.printStackTrace();

}

catch(Exception e) {

System.out.println("Hi");

}

}

}