package com.uttara.testdate;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

public class Test {
	public static void main(String[] args)
	{
		Set s=new HashSet();
		s.add("abc");
		s.add("xyz");
		s.add("abc");
		System.out.println(s);
		
		
		/*SimpleDateFormat sdf=new SimpleDateFormat("dd/MM/yyyy");
		Date date=null;
		try {
			date = sdf.parse("02/01/1997");
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(date);
		Date d=new Date();
		String da=sdf.format(d);
		System.out.println(da);*/
		
	}
}
