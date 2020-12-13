import java.util.Scanner;

public class ex1 {
	public static void main (String [] args) {
		Scanner teclado = new Scanner(System.in);
		
		double matriz [][] = new double[4][4], contador = 0;
		
		for(int i = 0 ; i < matriz.length ; i++) {
			for(int j = 0 ; j< matriz.length ; j++) {
				System.out.println("Digite um número");
				matriz[i][j] = teclado.nextDouble();
				
					if(matriz[i][j] > 10) {
						contador = contador + 1;
					}
				
			}	
		}
		
		for(int i = 0 ; i < matriz.length ; i++) {
			for(int j = 0 ; j < matriz.length ; j++) {		
			System.out.print(matriz[i][j]+"\t");		
			}
			
			System.out.println(" ");
		}
		
		
		System.out.println("quantidade de números maiores que 10: " + contador);
				
	}
}
