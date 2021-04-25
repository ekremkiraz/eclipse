package konu2Ders1;

public class Main {

	public static void main(String[] args) {

		Course course = new Course(1, 1, "Yazýlým Geliþtirici Yetiþtirme Kampý (C# + ANGULAR)", 72.2);
		Course course2 = new Course(2, 1, "Yazýlým Geliþtirici Yetiþtirme Kampý (JAVA + REACT)", 32);

		Instructor instructor = new Instructor(1, "Engin Demiroð");

		Course[] courses = { course, course2 };

		for (Course result : courses) {
			System.out.println(result.courseName+" "+result.completionTime);
		}
		
		System.out.println("**********************************");
		
		Instructor[] instructors= {instructor};
		
		for (Instructor result2 : instructors) {
			System.out.println(result2.InstructorName);
		}
		
		CourseManager courseManager = new CourseManager();
		
		courseManager.add(course);
		courseManager.add(course2);
		courseManager.delete(course);

	}

}
