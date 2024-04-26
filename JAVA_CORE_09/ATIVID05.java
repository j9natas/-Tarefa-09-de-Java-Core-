package LIST_9;

import java.util.Scanner;

public class ATIVID05 {

	
	
	
	
	
	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        int totalValores = 15;
	        long somatorioFatorial = 0;
	        
	        for (int i = 1; i <= totalValores; i++) {
	            System.out.print("Digite o valor " + i + ": ");
	            int valor = scanner.nextInt();
	            
	            long fatorial = calcularFatorial(valor);
	            somatorioFatorial += fatorial;
	        }
	        
	        System.out.println("O somatório da fatorial dos valores lidos é: " + somatorioFatorial);
	        
	        scanner.close();
	    }
	    
	    public static long calcularFatorial(int n) {
	        if (n == 0 || n == 1) {
	            return 1;
	        } else {
	            long fatorial = 1;
	            for (int i = 2; i <= n; i++) {
	                fatorial *= i;
	            }
	            return fatorial;
	        }
	    }
	}
	
	
	
	
	
	
	
	

