package LIST_9;

import java.util.Scanner;

public class ATIVID08 {

	
	
	
	
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double areaTotal = 0;
        String resposta = "SIM";

        while (resposta.equalsIgnoreCase("SIM")) {
            System.out.print("Digite o nome do cômodo: ");
            String nomeComodo = scanner.nextLine();

            System.out.print("Digite a largura do cômodo em metros: ");
            double largura = scanner.nextDouble();

            System.out.print("Digite o comprimento do cômodo em metros: ");
            double comprimento = scanner.nextDouble();

            double areaComodo = largura * comprimento;
            areaTotal += areaComodo;

            System.out.println("A área do cômodo " + nomeComodo + " é: " + areaComodo + " metros quadrados.");

            scanner.nextLine();

            System.out.print("Deseja calcular a área de outro cômodo? (SIM/NAO): ");
            resposta = scanner.nextLine();
        }

        System.out.println("A área total da residência é: " + areaTotal + " metros quadrados.");

        scanner.close();
    }
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
