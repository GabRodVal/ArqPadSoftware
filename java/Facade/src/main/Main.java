package main;

import sala.SalaFacade;

public class Main {
	
	public static void main(String[] args) {
		SalaFacade salaAutomatica = new SalaFacade();
		salaAutomatica.ligarSala();
		salaAutomatica.desligarSala();
		salaAutomatica.ligarSala();
		salaAutomatica.ligarSala();
		salaAutomatica.desligarSala();
		salaAutomatica.desligarSala();
		
	}

}
