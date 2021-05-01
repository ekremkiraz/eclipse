package ders3Odev2;

public class Student extends BasePerson {

	public Student() {
		super();

	}

	public Student(int id, String firstName, String lastName, String email, int age, String city, int courseId) {
		super(id, firstName, lastName, email, age);
		this.city = city;
		this.courseId = courseId;

	}

	String city;
	int courseId;

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public int getCourseId() {
		return courseId;
	}

	public void setCourseId(int courseId) {
		this.courseId = courseId;
	}
}
