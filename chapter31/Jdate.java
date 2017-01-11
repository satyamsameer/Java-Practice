import java.util.*;
public class Jdate{
	public static void main(String args[]){
		int day,month,year,sec,min,hr;
		GregorianCalendar g=new GregorianCalendar();
		day=g.get(Calendar.DAY_OF_MONTH);
		month=g.get(Calendar.MONTH);
		year=g.get(Calendar.YEAR);
		sec=g.get(Calendar.SECOND);
		min=g.get(Calendar.MINUTE);
		hr=g.get(Calendar.HOUR);
		System.out.println("Current full date : "+day+"-"+month+"-"+year);
		System.out.println("Current full time :"+hr+":"+min+":"+sec);
	}
}