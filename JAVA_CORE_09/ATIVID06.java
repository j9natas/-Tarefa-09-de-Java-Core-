package LIST_9;


import java.util.Scanner;

public class ATIVID06 {

	
	
	
	
	
	  public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        
	        int totalValores = 0;
	        int somatorio = 0;
	        
	        while (true) {
	            System.out.print("Digite um valor (negativo para encerrar): ");
	            int valor = scanner.nextInt();
	            
	            if (valor < 0) {
	                break; 
	            }
	            
	            totalValores++;
	            somatorio += valor;
	        }
	        
	        if (totalValores == 0) {
	            System.out.println("Nenhum valor foi inserido.");
	        } else {
	            double media = (double) somatorio / totalValores;
	            System.out.println("Total de valores lidos: " + totalValores);
	            System.out.println("Somatório dos valores: " + somatorio);
	            System.out.println("Média aritmética: " + media);
	        }
	        
	        scanner.close();
	    }
	}
	
	
	
	
	
	
	
	
	
	
	
