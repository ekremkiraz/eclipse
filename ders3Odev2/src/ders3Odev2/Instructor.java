package ders3Odev2;

public class Instructor extends BasePerson {
	

 public Instructor() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Instructor(int id, String firstName, String lastName, String email, int age,int courseId) {
		super(id, firstName, lastName, email, age);
		this.courseId=courseId;
	}

private int courseId;

public int getCourseId() {
	return courseId;
}

public void setCourseId(int courseId) {
	this.courseId = courseId;
}
}
