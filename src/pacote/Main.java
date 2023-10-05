package pacote;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);
		
		double n1, n2, n3, n4, m;
		
		System.out.println("-----------------------------");
		System.out.println("Calculadora de Média de Notas");
		System.out.println("-----------------------------");
		
		System.out.println("Escolha a quantidade de notas");
		System.out.println("1 - para 2 notas");
		System.out.println("2 - para 3 notas");
		System.out.println("3 - para 4 notas");
		System.out.print("Digite aqui: ");
		int quantnotas = leia.nextInt();
		System.out.println("-----------------------------");
		
		switch (quantnotas) {
		case 1:
			System.out.print("Digite a primeira nota: ");
			n1 = leia.nextDouble();
			System.out.print("Digite a segunda nota: ");
			n2 = leia.nextDouble();
			
			m = DuasNotas.DuasN(n1,n2);
			
			System.out.println("-----------------------------");
			System.out.println("A média das notas é "+m);
			break;
		case 2:
			System.out.print("Digite a primeira nota: ");
			n1 = leia.nextDouble();
			System.out.print("Digite a segunda nota: ");
			n2 = leia.nextDouble();
			System.out.print("Digite a terceira nota: ");
			n3 = leia.nextDouble();
			
			m = TresNotas.TresN(n1,n2,n3);
			
			System.out.println("-----------------------------");
			System.out.println("A média das notas é "+m);
			break;
		case 3:
			System.out.print("Digite a primeira nota: ");
			n1 = leia.nextDouble();
			System.out.print("Digite a segunda nota: ");
			n2 = leia.nextDouble();
			System.out.print("Digite a terceira nota: ");
			n3 = leia.nextDouble();
			System.out.print("Digite a quarta nota: ");
			n4 = leia.nextDouble();
			
			m = QuatroNotas.QuatroN(n1,n2,n3,n4);
			
			System.out.println("-----------------------------");
			System.out.println("A média das notas é "+m);
			break;
		default:
			System.out.println("Você não digitou um valor da tabela.");
		}
		
	}

}
