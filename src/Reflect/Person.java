package Reflect;

public class Person {
	
	private String name;
	public int age;
	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public static String getDesc() {
		return desc;
	}

	public static void setDesc(String desc) {
		Person.desc = desc;
	}


	static String desc = "我是中国人";
	
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	
	public static void info() {
		System.out.println("中国人");
	}
	
	public void show(String desc) {
		System.out.println("我是："+desc);
	}
	
	public Person() {
		System.out.println("!!!");
	}
	

	public String toString() {
		return "Person[name="+name+", age="+age+"]";
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
