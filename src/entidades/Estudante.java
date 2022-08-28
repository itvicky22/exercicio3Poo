package entidades;

public class Estudante {
	public String nome;
	public double n1;
	public double n2;
	public double n3;
	
	public double soma_notas() {
		double s = n1 + n2 + n3;
		return s;
	}
	
}
