
public class Student extends Person implements Consumer{
	
	private String school;
	

	public Student(String school) {
		this.school = school;
	}
	
	public void study() {
		System.out.println("学生在"+school+"学习");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student student = new Student("东北大学");
		student.study();
	}

	@Override
	public void useCredit() {
		// TODO Auto-generated method stub
		
	}

}
