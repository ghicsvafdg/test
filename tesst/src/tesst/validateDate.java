package tesst;

import java.text.*;
import java.time.DateTimeException;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;
public class validateDate {
	public static void main(String[] args) throws ParseException {
		DateFormat format = new SimpleDateFormat("dd/MM/yyyy");
		format.setLenient(false);
		Scanner sc = new Scanner(System.in);
		System.out.println("enter date: ");
		String a = sc.next();
		String date = a;
//		Calendar low = Calendar.getInstance();
//		low.add(Calendar.YEAR, 50);
//		Calendar up = Calendar.getInstance();
//		up.add(Calendar.YEAR, -50);
//        Date check;
//		try {
//			check = format.parse(date);
//			 if (check.before(up.getTime())
//						&& check.after(low.getTime())) {
//
//		        	System.out.println(date);
//				} else {
//					
//				}
//		} catch (ParseException e) {
//			e.printStackTrace();
//		}
		format.parse(date);
		String get = date;
		
        
        System.out.println(get);
        
	}
}
