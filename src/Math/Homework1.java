package Math;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
public class Homework1 {

	public static void main(String[] args)throws ParseException {
		// TODO Auto-generated method stub
	

			Scanner sc=new Scanner(System.in);

			System.out.println("请输入北京时间");

			String a=sc.nextLine();

			//字符串转化日期格式

			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH-mm-ss");
			Date d = sdf.parse(a);
			Calendar c = Calendar.getInstance();
			c.setTime(d);
			
			c.add(Calendar.HOUR_OF_DAY,-7);
			System.out.println("巴黎时间："+c.get(Calendar.YEAR)+"年"+(c.get(Calendar.MONTH)+1)+"月"+c.get(Calendar.DAY_OF_MONTH)+"日  "+c.get(Calendar.HOUR_OF_DAY)+"时"+c.get(Calendar.MINUTE)+"分"+c.get(Calendar.SECOND)+"秒");

		

			c.add(Calendar.HOUR_OF_DAY,-5);
			System.out.println("纽约时间："+c.get(Calendar.YEAR)+"年"+(c.get(Calendar.MONTH)+1)+"月"+c.get(Calendar.DAY_OF_MONTH)+"日  "+c.get(Calendar.HOUR_OF_DAY)+"时"+c.get(Calendar.MINUTE)+"分"+c.get(Calendar.SECOND)+"秒");

			}
}
