package controller;

public class InverteStringController {

	public InverteStringController() {
		super();
	}
	
	public String inverterString(String s) {
		  // Condi��o de parada
		  if (s.length() == 0) {
		    return s;
		  }
		  // Fun��o para o termo n em fun��o do termo anterior
		  else {
		    return inverterString(s.substring(1)) + s.charAt(0);
		  }
		}

}
