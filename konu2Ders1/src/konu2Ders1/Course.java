package konu2Ders1;

public class Course {

	public Course(int id, int instructorId, String courseName, double completionTime) {

		this.id = id;
		this.instructorId = instructorId;
		this.courseName = courseName;
		this.completionTime = completionTime;
	}

	int id;
	int instructorId;
	String courseName;
	double completionTime;

}
