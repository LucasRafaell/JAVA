package entities;

public class Aluno {
	
	public String nome;
	public double _1tri;
	public double _2tri;
	public double _3tri;
	
	public double finalGrade() {
		return (_1tri + _2tri + _3tri);		
	}
	
	public void resultado(double nota) {
		if(nota > 60.00) {
			System.out.println("PASS");
		} else {
			System.out.println("FAILED");
			System.out.printf("MISSING %.2f POINTS", (60.00 - nota));
		}
	}
	
}
