package com.loiane.cursojava.aula13;

public class OperadoresAritmeticos {

	public static void main(String[] args) {
 
		int resultado = 1 + 2;
		System.out.println(resultado);

		resultado = resultado - 1;
		System.out.println(resultado);
		
		resultado = resultado * 2;
		System.out.println(resultado);
		
		resultado = resultado / 2 ;
		System.out.println(resultado);
		
		resultado = resultado + 8 ;
		System.out.println(resultado);
		
		resultado = resultado %  7;
		System.out.println(resultado);
		
		resultado = resultado + 1;
		System.out.println(resultado);
		
		// equivalentes (ambos acrescentam + 1 no resultado)
		
		resultado++;
		System.out.println(resultado);
		
		//5
		
		System.out.println(resultado++);
		
		// imprime o resultado que está ate ali, no caso o 5, mesma coisa que:
		System.out.println(resultado);
		//resultado = resultado + 1;                                           5+1 = 6
		//resultado += 1 ;
		
		
		System.out.println(++resultado);
		//mesma coisa que
		// resultado +=1;                                                     6+1 =7
		//System.out.println(resultado);
		
		// faz o incremento ++ , imprime resultado com o incremento já = 7 
		
		resultado --;
		System.out.println(resultado);
		
		
		System.out.println(resultado--);
		System.out.println(--resultado);
		
		
		
		
	}

}
