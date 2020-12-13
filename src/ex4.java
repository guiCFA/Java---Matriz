import java.util.Scanner;

public class ex4 {
	public static void main(String [] args) {
		Scanner teclado = new Scanner(System.in);
		
		int matriz[][] = new int[3][3];
		
		for(int i = 0 ; i < matriz.length ; i++) {
			for(int j = 0 ; j < matriz.length ; j++) {
				System.out.println("Digite um número");
				matriz[i][j] = teclado.nextInt();
			}
		}
		
		System.out.println("Tabela Digitada");		
		
		for(int i = 0 ; i < matriz.length ; i++) {
			for(int j = 0 ; j < matriz.length ; j++) {
				System.out.print(matriz[i][j]+"\t");
			}
			System.out.println(" ");
		}
		
		//dando espaõ no console
		System.out.println(" ");		
		System.out.println("Tabela alterada");
		
		for(int i = 0 ; i < matriz.length ; i++) {
			for(int j = 0 ; j < matriz.length ; j++) {
				
				if(matriz[i][j] % 2 == 0) {
					matriz[i][j] = 1;
				} else {
					matriz[i][j] = -1;
				}
				
				System.out.print(matriz[i][j]+"\t");
			}
			System.out.println(" ");
		}
		
		
		
	}
}
