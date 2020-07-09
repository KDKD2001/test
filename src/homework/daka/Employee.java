package homework.daka;

public class Employee {
	
	private int id;
	private String name;
	public Employee(int iD, String name) {

		this.id = iD;
		this.name = name;
	}

	public int getId() {
		return id;
	}
	
	public String getName() {
		return name;
	}
	
	public void setId(int iD) {
		this.id = iD;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String toString() {
		return "姓名为"+"name"+"的员工ID为"+"ID";
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}

}
