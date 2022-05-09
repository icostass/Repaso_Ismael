package Repaso;

import java.util.Scanner;

public class Repaso {

	public static void main(String[] args) {
		Scanner ent = new Scanner(System.in);
		int pk;
		
		System.out.println("Elige un pokemon inicial: " + "\n\t" + "1) Charmander" +
				"\n\t" + "2) Squirtle" + "\n\t" + "3) Bulbasaur");
			pk = ent.nextInt();
		
		//Haz un método con switch que ponga "Has elegido a X pokemon", sustituyendo la X por el pokemon elegido
			
		switch(pk) {
			case 1:
				System.out.println("Has elegido a Charmander");
				break;
			case 2:
				System.out.println("Has elegido a Squirtle");
				break;
			case 3:
				System.out.println("Has elegido a Bulbasaur");
				break;
			default:
				System.out.println("Pokemon incorrecto");
				break;
				
		}
	}

}
