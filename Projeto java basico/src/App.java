import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner leitor = new Scanner(System.in);

		int[] elementos = { 64, 137, -16, 43, 67, 81, -90, 212, 10, 75 };
		int entrada = leitor.nextInt();
		int i = 0;	

		while (i < elementos.length && elementos[i] != entrada)
		      i++;
		
			if (i < elementos.length && elementos[i] == entrada)
			      System.out.println("Achei " + entrada+" na posicao "+i);
			    else 
			      System.out.println("Numero " +entrada+" nao encontrado!");
			}
		}
