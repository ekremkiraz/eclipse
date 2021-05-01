package ders3Odev2;

public class Main {

	public static void main(String[] args) {

		User ekrem = new User(1, "Ekrem", "Kiraz", "ekremkiraz@gmail.com", 36, "eko");

		User eda = new User();
		eda.setId(2);
		eda.setFirstName("Eda");
		eda.setLastName("Kiraz");
		eda.setEmail("edakiraz27@hotmail.com");
		eda.setAge(34);
		eda.setUsercode("eda");

		Instructor egitmen = new Instructor(1, "engin", "demir", "engin@yok", 35, 1);

		Student student = new Student(1, "Selim Ege", "Kiraz", "YOK", 8, "Gaziantep", 3);

		System.out.println(ekrem.getFirstName());
		System.out.println(eda.getFirstName());
		System.out.println(egitmen.getFirstName());
		System.out.println(student.getFirstName());
		
		UserManager userManager = new UserManager();
		InstructorManager instructorManager = new InstructorManager();
		
		userManager.add(eda);
		instructorManager.add(egitmen);
		
	}

}
