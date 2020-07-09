package Duotai;

public class HourlyEmployee extends ColaEmployee{
	
	int hourSalary;
	double monthWorkTime;
	double salary;
	
	public void getSalary() {
		if(monthWorkTime>160) {
			salary=(160*hourSalary)+(monthWorkTime-160)*hourSalary*1.5;
		}salary=hourSalary*monthWorkTime;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
