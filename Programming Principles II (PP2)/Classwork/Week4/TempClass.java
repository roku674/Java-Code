package Week4;

public class TempClass {
int x;

public void Test(String t) {
System.out.println("Test");
}

@SuppressWarnings("null")
public static void main(String[] args) {
TempClass test = null;
System.out.println(test.x);
}
}