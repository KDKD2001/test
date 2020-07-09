package homework.daka;

import java.io.*;
import java.util.*;
import java.text.*;

public class Main {
	
	private BufferedReader stdIn = new BufferedReader(new InputStreamReader(System.in));
	private PrintWriter stdOut =new PrintWriter(System.out,true); 
	private PrintWriter stdErr =new PrintWriter(System.err,true); 
	
	private Company company;
	
	public Main(Company company) {
	
		this.company = company;
	}
	
	int getNumber() {
		
    	  Scanner in=new Scanner(System.in);
          int a=in.nextInt();
          return a;
      }
	
	public void sighin(int a) {
		
  	  if(company.existemployee(a)){ 
  		  
  	  DakaInfo b=company.getDakainfo(a);
  	  Date now=new Date();
  	  SimpleDateFormat s=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
   	  String t=s.format(now);
   	  
      if(b.noExist(t)) {
  	    b.setStart();
  	    b.setEnd();
  	    
  		if (b.isStart())
  	    	System.out.println("今天已打卡");
  	    else {b.setStart(true);
  	    System.out.println("卡号："+a+"的员工打卡成功");}
  	  
  	    }
    	else {
  		
  		System.out.println("今天已经打过卡了");   	} 
    }
  	    else System.out.println("无此ID员工");
  	  
    }
    
    public void sighoff(int a) {
    	
  	  if(company.existemployee(a)) {
  	  DakaInfo b=company.getDakainfo(a);
  	  Date now=new Date();
  	  SimpleDateFormat s=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
  	  String t=s.format(now);
  
  	  if (b.isStart())
  		  {b.setEnd(true);
  		  System.out.println("卡号："+a+"的员工签退成功");
  		  }
  		  
	      else { System.out.println("卡号："+a+"的员工今天还没有签到，无法签退");  	    }
  	  }
  	     else System.out.println("无此ID员工");

    }
    public String check(int a) {
  	   if(company.existemployee(a)) {
  		  
  		  DakaInfo b=company.getDakainfo(a);
  		  return b.getTime();
  	  }else 
  		  return"无此ID员工";
    }
	
	private int getChoice() throws IOException{
		
		int input;
		
		do {
			try {
				stdErr.println();
				stdErr.print("----打卡系统----\n"
						+"[0] 退出\n"
						+"[1] 签到\n"
						+"[2] 签退\n"  
						+"[3] 显示签到信息\n"
						+"请输入执行操作");
				stdErr.flush();
				
				input = Integer.parseInt(stdIn.readLine());
				
				stdErr.println();
				
				if(0 <= input && 3 >= input) {
					break;
				}else {
					stdErr.println("无效的输入");
				}
			}catch(NumberFormatException nfe) {
					stdErr.println(nfe);
				}
			}while(true);
			
			return input;
		
	}
	
	private void run() throws IOException{
		
		int choice = getChoice();
		
		while (choice>-1&&choice<4) {
			
			if(choice == 0) {
				
				System.out.println("已成功退出");
				System.exit(0);
				
			}else if(choice == 1) {
				
				System.out.println("请输入签到员工ID");
                int a=getNumber();
                sighin(a);
                
			}else if(choice == 2) {
				
				System.out.println("请输入签到员工ID");
          	    int a=getNumber();
          	    sighoff(a);
          	    
			}else if(choice == 3) {
				
				System.out.println("请输入签到员工ID");
          	    int a=getNumber();
          	    check(a); 
			}
			choice = getChoice();
		}
	}

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		
		   Company company=new Company();
		 
	       Employee a=new Employee(1,"Tom");
	       Employee b=new Employee(2,"Jack");
	       Employee c=new Employee(3,"Bob");
	       Employee d=new Employee(4,"Lucy");
	       Employee e=new Employee(5,"Alice");
	       
	       company.addEmployee(a);
	       company.addEmployee(b);
	       company.addEmployee(c);
	       company.addEmployee(d);
	       company.addEmployee(e);
	       
	       Main main=new Main(company);
	       main.run();
	}

}
