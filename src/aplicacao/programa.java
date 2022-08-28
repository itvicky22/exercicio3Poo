package aplicacao;

import java.util.Locale;
import java.util.Scanner;

import entidades.Estudante;

public class programa {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner ler = new Scanner(System.in);
		
		Estudante aluno = new Estudante();
		
		System.out.println("Nome e as 3 notas: ");
		aluno.nome = ler.nextLine();
		aluno.n1 = ler.nextDouble();
		aluno.n2 = ler.nextDouble();
		aluno.n3 = ler.nextDouble();
		
		double soma = aluno.soma_notas();
		if(soma >= 60) {
			System.out.printf("Grade Final = %.2f\nPassou", soma);
		}
		else {
			System.out.printf("Grade Final = %.2f\nFalhou\nFaltou %.2f pontos", soma, 60 - soma); 
		}
		ler.close();
	}
	

}
