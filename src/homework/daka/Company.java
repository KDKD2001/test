package homework.daka;

import java.util.ArrayList;
import java.util.Iterator;



public class Company implements Iterable<Employee>{
	
	 private ArrayList<Employee>employee;
	 private ArrayList<DakaInfo>database;
	 	 
	 
	public Company() {
		
		this.employee = new ArrayList<Employee>();
		this.database = new ArrayList<DakaInfo>();
	}
	
	public String getEmployee(int id) {
		
		for(Employee Employee:this.employee) {
			if(Employee.getId()==id) {
				 return "您要查找的员工如下"+Employee.toString();
			}
		}
		return "无此ID员工";
	}
	
	 public void addEmployee(Employee Employee) {
		 
  	   this.employee.add(Employee);
  	   DakaInfo a=new DakaInfo(Employee.getId());
  	   this.database.add(a);
  	   System.out.println("id为"+Employee.getId()+"姓名为"+Employee.getName()+"的信息已添加");
     }
	 
	 public void removeEmployee(Employee Employee) {
		 
		 this.employee.remove(Employee);
		 DakaInfo a=new DakaInfo(Employee.getId());
	  	   this.database.remove(a);
		 System.out.println("id为"+Employee.getId()+"姓名为"+Employee.getName()+"的信息已删除");
	 }
	 
	 public void showEmployee() {
		 
		 System.out.println("员工信息如下");
		 for(Employee Employee:this.employee) {
			 Employee.toString();
		 }
	 }
	 
	 boolean existemployee(int id) {
		 for(Employee Employee:this.employee) {
				if(Employee.getId()==id) {
					 return true;
				}
				 	}
		return false;}
	 
	 public DakaInfo getDakainfo(int id) {
		 for(DakaInfo Dakainfo:this.database) {
				if(Dakainfo.ID==id) {
					 return Dakainfo;
				}
	 } return null;
		 }
	 
	@Override
	public Iterator<Employee> iterator() {
		// TODO Auto-generated method stub
		return null;
	}

}
