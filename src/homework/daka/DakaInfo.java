package homework.daka;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;





public class DakaInfo  {
	
     int ID;
     Date firstTime;
     Date lastTime;
     Date now=new Date();
     boolean start=false;
     boolean end=false;
     private ArrayList<String>database;
     private ArrayList<String>daydatabase;
     
	public DakaInfo(int iD) {
		this.database = new ArrayList<String>();
		this.daydatabase = new ArrayList<String>();
		this.ID = iD;
	}
	
	public boolean isStart() {
		return start;
		
	}
	
	public void setStart(boolean start) {
		
		this.start = start;
		this.firstTime=new Date();
		
		SimpleDateFormat p=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String a="签到时间:"+p.format(firstTime);
		daydatabase.add(p.format(firstTime));		
		database.add(a);
	}
	
	public boolean isEnd() {
		return end;
	}
	
	public void setEnd(boolean end) {
		this.end = end;
		this.lastTime=new Date();
		
		SimpleDateFormat p=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String a="签退时间:"+p.format(lastTime);		
		daydatabase.add(p.format(lastTime));
		database.add(a);
	}
	
	public String getTime() {
		
		for(String a:database) {
			System.out.println(a);
		}
		System.out.println();
		return null;
	}
	
	public boolean noExist(String s) {
		for(String a:daydatabase) {
			
			if(s.equals(a))	
				return false;}
		return true;
	}
	
	public void setStart(){
		start=false;
		}
	
	public void setEnd() {
		end=false;
		}
}

