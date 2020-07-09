package Math;
import java.util.Calendar;
public class TestCalendar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calendar c = Calendar.getInstance();
		
		System.out.println(c.get(Calendar.YEAR)+" "+(c.get(Calendar.MONTH)+1)+" "+c.get(Calendar.DAY_OF_MONTH));
		
		c.set(2000,1,2);
		
		System.out.println(c.get(Calendar.YEAR)+" "+(c.get(Calendar.MONTH))+" "+c.get(Calendar.DAY_OF_MONTH));
	}

}
