package com.framework.CRM.rough;

import java.text.SimpleDateFormat;
import java.util.Date;

public class rough {

	public static void main(String[] args) {
		
		String date = "12/15/2018";

		Date d = new Date(date);

		SimpleDateFormat formatedate = new SimpleDateFormat("E MMM dd yyyy");
		String finaldate = formatedate.format(d);

		System.out.println(finaldate);
		
		//Wed Dec 19 2018
		//Wed Dec 19 2018

		
	}
}
