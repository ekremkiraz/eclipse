package ders3Odev2;

public class User extends BasePerson {
	public User() {
		
	}
	
	public User(int id, String firstName, String lastName, String email, int age, String usercode) {
		super(id, firstName, lastName, email, age);
		this.usercode = usercode;
	}

	private  String  usercode;

	public String getUsercode() {
		return usercode;
	}

	public void setUsercode(String usercode) {
		this.usercode = usercode;
	}

    }
