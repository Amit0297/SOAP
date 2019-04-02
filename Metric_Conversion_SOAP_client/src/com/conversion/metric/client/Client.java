package com.conversion.metric.client;

import java.util.Scanner;

import javax.swing.JOptionPane;

import com.conversion.metric.Converter;
import com.conversion.metric.ConverterServiceLocator;

public class Client {
	
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		ConverterServiceLocator locator = new ConverterServiceLocator();
		try {
			
			Converter convert = locator.getConverter();
			int value = sc.nextInt();
			String unit1 = sc.nextLine();
			String unit2 = sc.nextLine();
			
			String return_stmt = convert.convert(value, unit1, unit2);
			
			System.out.println("Returned value "+ return_stmt);
			
		}catch(Exception e) {
			e.printStackTrace();
			JOptionPane.showMessageDialog(null, "Unaable to reach Service" + e.getMessage());
			
		}
		sc.close();
	}

}
