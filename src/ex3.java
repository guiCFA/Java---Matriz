
public class ex3 {

	public static void main(String [] args) {
		
		int matriz [][] = new int [5][10];
		
		for(int i = 0 ; i < matriz.length ; i++) {
			for(int j = 0 ; j < matriz[i].length ; j++) {
				
				//converntendo double para inteiro, pois Math.pow retorna um double 
				matriz[i][j] = (int) Math.pow(j, 2);
			}
		}
		

		for(int i = 0 ; i < matriz.length ; i++) {
			for(int j = 0 ; j < matriz[i].length ; j++) {
				
				System.out.print(matriz[i][j]+"\t");
			}
			System.out.println(" ");
		}
		
		
		
	}
}
