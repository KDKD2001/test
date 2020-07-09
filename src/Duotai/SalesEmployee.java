package Duotai;

public class SalesEmployee extends ColaEmployee{
	
	double monthSales;
	double rate;
	double salary;
	
	public void getSalary() {
		salary=monthSales*rate;
		System.out.println(salary);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
