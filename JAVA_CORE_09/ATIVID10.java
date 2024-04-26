package LIST_9;


import java.util.Scanner;

public class ATIVID10 {

	
	
	
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite o dividendo: ");
        int dividendo = scanner.nextInt();
        
        System.out.print("Digite o divisor: ");
        int divisor = scanner.nextInt();
        
        int quociente = 0;
        
        while (dividendo >= divisor) {
            dividendo -= divisor;
            quociente++;
        }
        
        System.out.println("Resultado da divisão: " + quociente);
        
        scanner.close();
    }
}
	
	
	
	

