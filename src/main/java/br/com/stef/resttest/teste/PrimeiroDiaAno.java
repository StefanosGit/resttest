package br.com.stef.resttest.teste;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class PrimeiroDiaAno {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date data = new GregorianCalendar(2018,Calendar.JANUARY,1).getTime();
		System.out.println(data);
	}

}
