import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
Scanner entrada = new Scanner(System.in);
		Cone p = new Cone();
		System.out.println("Raio: ");
		double raio = entrada.nextDouble();
		p.setRaio(raio);
		System.out.print("Altura da pir�mide: ");
		double h = entrada.nextDouble();
		System.out.print("Tipo de tinta : 1,2 ou 3: ");
		int tipo = entrada.nextInt();
		p.setH(h);
		p.setTipo(tipo);
		
		
		System.out.println("Raio: " + p.getRaio());
		System.out.println("Altura: " + p.getH());
		System.out.println("Tipo de tinta: " + p.getTipo());
		System.out.println("---------------------------");
		System.out.println("Geretriz: " + p.g());
		System.out.println("---------------------------");
		System.out.println("�rea do Fundo: " + p.areafundo());
		System.out.println("�rea Lateral Cone: " + p.arealateral() );
		System.out.println("�rea total: " + p.areatotal());
		System.out.println("---------------------------");
		System.out.println("Litros: " + p.litros());
		System.out.println("Latas: "+ p.latas());
		System.out.println("---------------------------");
		System.out.println("Pre�o Total: "+ p.preco());
		
		entrada.close();
	}

}