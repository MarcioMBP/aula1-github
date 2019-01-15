package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Date;

public class Data {

	public static void main(String[] args) throws ParseException {
		
		SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy");
		SimpleDateFormat sdf2 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		
		Date x1 = new Date();
		Date y1 = sdf1.parse("28/01/2017");
		Date y2 = sdf2.parse("25/12/2018 15:42:07");
		Date y3 = Date.from(Instant.parse("2019-01-10T23:40:07Z"));
		
		System.out.println(y1);
		System.out.println(y2);
		System.out.println(sdf1.format(y1));
		System.out.println(sdf2.format(y2));
		System.out.println(sdf2.format(x1));
		System.out.println(sdf2.format(y3));
		

	}

}
