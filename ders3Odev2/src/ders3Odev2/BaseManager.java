package ders3Odev2;

public class BaseManager {

	public void add(BasePerson basePerson) {
		System.out.println("Eklendi..."+basePerson.getFirstName());

	}

	public void remove(BasePerson basePerson) {
		System.out.println("Silindi..."+basePerson.getFirstName());

	}

	public void update(BasePerson basePerson) {
		System.out.println("Güncellendi..."+basePerson.getFirstName());


	}

}
