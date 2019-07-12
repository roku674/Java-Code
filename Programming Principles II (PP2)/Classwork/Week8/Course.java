package Week8;

import java.util.ArrayList;
import java.util.Collections;

public class Course {
	private String courseName;
	private ArrayList<Student> students;
	
	public Course(String courseName) {
		this.courseName = courseName;
		students = new ArrayList<Student>(); 
		
	}

	private String getCourseName() {
		return courseName;
	}

	boolean addStudent(Student s) {
		if(students.contains(s)) return false;
		students.add(s);
		return true;
		
	}
	
	public void disByA1Scores() {
		Collections.sort(students, new NameComparator());
		for (int i = 0; i < students.size(); i++) {
			System.out.println(students.get(i) + " " + students.get(i).getA1());
		}
		
	}
}
