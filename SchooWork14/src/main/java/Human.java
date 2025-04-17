

public class Human {
	private String name;
	private int iAge;
	public Human(String name, int age){
		this.name = name;
		this.iAge = iAge;
		
	}
	/*
	 * nameフィールﾄﾞのgetter/setter
	 */
	private void setName(String name) {
		this.name=name;
	}
	public String getName() {
		return name;
	}
	/*
	 * ageフィールドのgetter/setter
	 */
	private void setAge(int age) {
		this.iAge = age;
	}
	public int getAge() {
		return iAge;
	}

}
