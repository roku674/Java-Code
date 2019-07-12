package Week8;

import java.util.Comparator;

public class A1Comparator implements Comparator<Student>{

	@Override
	public int compare(Student s1, Student s2) {
		if(s1.getA1() < s2.getA1()) return 1; 
		if(s1.getA1() > s2.getA1()) return -1;
		return 0;
	}

}
