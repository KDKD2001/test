package Enum;

public class TestNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Season[] values = Season.values();
		
		for(Season season:values) {
			System.out.println(season.getName()+ " : " + season.getDesc());
		}
	}

}
