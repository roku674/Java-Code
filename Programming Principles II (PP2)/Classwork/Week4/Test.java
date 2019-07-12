package Week4;

public class Test {
public static void main(String[] args) {
A a = new A(null);
a.print();
}
}

class A {
String s;

A(String s) {
this.s = s;
}

void print() {
System.out.println(s);
}
}