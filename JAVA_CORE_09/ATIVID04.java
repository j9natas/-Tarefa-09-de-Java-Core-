package LIST_9;




public class ATIVID04 {

	
	
	 public static void main(String[] args) {
	        int totalQuadros = 64;
	        long somatorio = 0;
	        
	      
	        for (int i = 1; i <= totalQuadros; i++) {
	            somatorio += Math.pow(2, i - 1);
	        }
	        
	        System.out.println("O somatório do número de grãos de trigo é: " + somatorio);
	    }
	}
	
	

