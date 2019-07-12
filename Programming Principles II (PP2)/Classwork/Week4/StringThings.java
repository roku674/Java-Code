package Week4;

public class StringThings {

	public static void main(String[] args) {
		//String MyPoem = "i brn nimina laka winna na na bme naaa naaaaaaaa. I'm on top of the mountain puffin on clouds and n****s still beginnan";
		//System.out.print(MyPoem);
		
		String s1 = "Welcome to Java";
		String s2 = new String("Welcome to Java");
		String s3 = "Welcome to Java";
		
		System.out.println("Is s1==s2?: " + (s1==s2));
		System.out.println("Is s1==s3?: " + (s1==s3));
		System.out.println("Is s1 equal to s2?: " + s1.equals(s2));
		
		String s4 = s1.replace('e','q');
	    System.out.println(s4);
		System.out.println(s1);
		
		//String s5 = s1.replaceFirst( s1, s1);
		
		StringBuilder stringBuilder = new StringBuilder("Welcome to ");
		stringBuilder.insert(11, "Java");
		stringBuilder.delete(0, 0);
		System.out.print(stringBuilder);
		// TODO Auto-generated method stub

	}

}
