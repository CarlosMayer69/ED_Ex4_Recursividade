package view;

import controller.InverteStringController;

public class Principal {

	public static void main(String[] args) {
		
		InverteStringController is = new InverteStringController();
		String s = "teste";
		String inverterString = is.inverterString(s);
		
		System.out.println(inverterString);

	}

}

