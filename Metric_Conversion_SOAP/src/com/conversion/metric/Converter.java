package com.conversion.metric;
import javax.jws.WebMethod;
import javax.jws.WebService;

import com.values.conversion.Currency;
import com.values.conversion.Distance;
import com.values.conversion.Weight;

@WebService
public class Converter {
	int return_val;
	String return_str;
	
	public Converter() {
		this.return_val = 0;
		this.return_str = "";
	}
	
	@WebMethod
	public String convert(int value, String unit1, String unit2) {
		
		if((unit1.equals("Dollar"))&&(unit2.equals("Rs"))) {
			
			return_val = new Currency(value).getValue();
		}
		
		
		if((unit1.equals("Km"))&&(unit2.equals("M"))) {
			
			return_val = new Distance(value).getValue();
		}
		
		if((unit1.equals("Kg"))&&(unit2.equals("G"))) {
			
			return_val = new Weight(value).getValue();
		}
		
		
		//return new Metric(return_val, unit2);
		return_str = ""+return_val+" "+unit2;
		return return_str;
		
		
	}
	

}
