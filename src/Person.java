
public class Person {
	String name;
	String age;
	String fatherName;
	String MotherName;
	
	public Person(String name, String age, String fatherName, String motherName) {
		super();
		this.name = name;
		this.age = age;
		this.fatherName = fatherName;
		MotherName = motherName;
	}
	public String getMotherName() {
		return MotherName;
	}
	public void setMotherName(String motherName) {
		MotherName = motherName;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	public String getFatherName() {
		return fatherName;
	}
	public void setFatherName(String fatherName) {
		this.fatherName = fatherName;
	}
	
	
}
