package controller;

public class InverteStringController {

	public InverteStringController() {
		super();
	}
	
	public String inverterString(String s) {
		  // Condição de parada
		  if (s.length() == 0) {
		    return s;
		  }
		  // Função para o termo n em função do termo anterior
		  else {
		    return inverterString(s.substring(1)) + s.charAt(0);
		  }
		}

}
