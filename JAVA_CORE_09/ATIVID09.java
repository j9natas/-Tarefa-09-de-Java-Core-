package LIST_9;

import java.util.Scanner;


public class ATIVID09 {

	
	
	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        
	        int maior = Integer.MIN_VALUE;
	        int menor = Integer.MAX_VALUE;
	        
	        System.out.println("Digite valores positivos inteiros (ou um valor negativo para encerrar):");
	        
	        while (true) {
	            System.out.print("Digite um valor: ");
	            int valor = scanner.nextInt();
	            
	            if (valor < 0) {
	                break; 
	            }
	            
	            if (valor > maior) {
	                maior = valor; 
	            }
	            
	            if (valor < menor) {
	                menor = valor; 
	            }
	        }
	        
	        if (maior == Integer.MIN_VALUE && menor == Integer.MAX_VALUE) {
	            System.out.println("Nenhum valor positivo foi informado.");
	        } else {
	            System.out.println("Maior valor informado: " + maior);
	            System.out.println("Menor valor informado: " + menor);
	        }
	        
	        scanner.close();
	    }
	}
	
	
	
	
	
	
	
	
	
	

