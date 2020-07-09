package Math;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TestDataFormmat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss:SS");
		Date now = new Date();
		System.out.println(now);
		//将日期指定的格式，格式化
		String nowStr = sdf.format(now);
		System.out.println(nowStr);
		
		Date d = null;
		try {
			d = sdf.parse("2020-01-01 08:30:30:30");
		}catch(ParseException e) {
			e.printStackTrace();
		}
		System.out.println(d);
		
	}

}
