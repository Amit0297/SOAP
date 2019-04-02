package com.conversion.metric.client;


import javax.swing.JOptionPane;

import com.conversion.metric.Converter;
import com.conversion.metric.ConverterServiceLocator;

public class Client {
	
	public static void main(String[] args) {
		
		ConverterServiceLocator locator = new ConverterServiceLocator();
		try {
			
			Converter convert = locator.getConverter();
			int value = Integer.parseInt(JOptionPane.showInputDialog("Enter Value"));
			String unit1 = JOptionPane.showInputDialog("Enter unit 1");
			String unit2 = JOptionPane.showInputDialog("Enter unit 2");
			
			String return_stmt = convert.convert(value, unit1, unit2);
			
			JOptionPane.showMessageDialog(null, return_stmt);
			
		}catch(Exception e) {
			e.printStackTrace();
			JOptionPane.showMessageDialog(null, "Unaable to reach Service" + e.getMessage());
			
		}
		
	}

}
