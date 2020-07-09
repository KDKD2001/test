package Jihe;


import java.util.*;

public class Ex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set s = new HashSet();
		
		s.add(123);
		Ex1 p = new Ex1();
		s.add(p);
		s.add("Tom");
		s.add("Tom");//地址相同
		
		Ex1 p2 = new Ex1();
		s.add(p2);
		
		Iterator it =  s.iterator();
		
		while(it.hasNext()) {
			Object o = it.next();
			System.out.println(o);
		}
		
	}

}
