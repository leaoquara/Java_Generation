package ExercicioHeran�a;

public class Main {
	
	public static void main(String[] args) {
		
		System.out.println("---------------------------------------------\n");
		
		Cachorro spike = new Cachorro();
		
		spike.nome = "Toto";
		spike.idade = 13;
		
			System.out.println("Qual o nome dele ? " + spike.nome);
			System.out.println("Quantos anos ele tem ? " + spike.idade + " anos");
			System.out.println("Que som ele faz ? " + spike.emitirSom());
			System.out.println("Ele est� correndo ! " + spike.correr() + "\n");
		
			System.out.println("--------------------------------------------\n");
		Cavalo Cavalu = new Cavalo();
		
		Cavalu.nome = "Cavalu";
		Cavalu.idade = 19;
		
			System.out.println("Qual o nome dele ? " + Cavalu.nome);
			System.out.println("Quantos anos ele tem ? " + Cavalu.idade + " anos");
			System.out.println("Que som ele faz ? " + Cavalu.emitirSom());
			System.out.println("Ele est� correndo ! " + Cavalu.correr() + "\n");
			
			System.out.println("--------------------------------------------\n");
		Preguica flashmark2 = new Preguica();
		
		flashmark2.nome = "Flash mark2";
		flashmark2.idade = 5;
		
			System.out.println("Qual o nome dele ? " + flashmark2.nome);
			System.out.println("Quantos anos ele tem ? " + flashmark2.idade + " anos");
			System.out.println("Que som ele faz ? " + flashmark2.emitirSom());
			System.out.println("Ele est� correndo ! " + flashmark2.correr() + "\n");
			
			System.out.println("---------------------------------------------\n");
	}
}