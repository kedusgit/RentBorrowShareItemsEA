package edu.mum.cs544.formatter;

import java.util.Locale;

import org.springframework.expression.ParseException;
import org.springframework.format.Formatter;

import edu.mum.cs544.Domain.Phone;


public class PhoneFormatter implements Formatter<Phone> {

	  public String print(Phone phone, Locale locale) {
 	       return phone.getAreaCode() + "-" +  phone.getPrefix() + "-" + phone.getNumber();
	  }

	  public Phone parse(String source, Locale locale)
	   throws ParseException {
		  Phone isbNumber= null;
 
		  	Integer start = Integer.parseInt(source.substring(0, 3));
		  	Integer middle = Integer.parseInt(source.substring(4, 7));
		  	Integer end = Integer.parseInt(source.substring(8, 12));
		    isbNumber =  new Phone(start, middle, end);
 
		    return isbNumber;
	  }
}