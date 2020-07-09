package Reflect;

import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;

import org.junit.Test;

public class TestReflect {
////	@Test
////	public void test3()throws Exception{
////		Class clazz = Class.forName("Relection.Person");
////		Object obj = clazz.newInstance();
////		Person p = (Person)obj;
////		
////		Field f1 = clazz.getDeclaredField("name");
////		f1.setAccessible(true);
////		f1.set(p, "张三");
////		
////		Field f2 = clazz.getField("age");
////		f2.set(p, 18);
////		
////		System.out.println(f2.get(p));
////		System.out.println(p);
////	}
//	
//	@Test	
//	public void test2() throws Exception{
////		Class clazz = Class.forName("Reflection.Person");
////	    Class clazz2 = Person.class;
//		Class clazz = Person.class;
//		Constructor cons = clazz.getDeclaredConstructor(String.class,int.class);
//		cons.setAccessible(true);
////		Object obj = clazz.newInstance("Tom","man",20);
//
//		
//		Person p = (Person)cons.newInstance("Tom",20);
//		System.out.println(p);
//	}
	@Test
	public void test1() throws Exception{
		Class clazz = Class.forName("reflection.Person");

//		Object obj = clazz.newInstance();
		
		Person p = new Person();
	    Person t = (Person)p;
		System.out.println(t);
	}

	
}
