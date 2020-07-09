package Jihe;

import java.util.*;

public class TestMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map m1 = new HashMap();
		
		m1.put("Tom", 18);
		m1.put("John", 20);
		
		Set s1 = m1.keySet();
		
		Iterator it = s1.iterator();
		
		while(it.hasNext()) {
			Object key = it.next();
			Object value = m1.get(key);
			System.out.println(value);
		}
	}

}
