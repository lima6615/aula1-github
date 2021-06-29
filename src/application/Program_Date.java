package application;

import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Program_Date {

	public static void main(String [] args) throws ParseException {
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		
		Date x1 = new Date();
		
		Date y1 = sdf.parse("15/03/2021");
		Date y2 = sdf1.parse("15/02/2019  15:42:07");
		
		
		System.out.println("x1: "+ sdf1.format(x1));
		System.out.println("y1: "+ sdf.format(y1));
		System.out.println("y2: "+ sdf1.format(y2));
		
	
	
	}
}
