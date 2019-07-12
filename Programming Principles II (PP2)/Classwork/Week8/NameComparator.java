package Week8;

import java.util.Comparator;

public class NameComparator implements Comparator<Student> {

	@Override
	public int compare(Student s1, Student s2) {
		return ((s1.getLname()+s1.getFname()).compareTo(s2.getLname()+s2.getFname()));
	}

}
