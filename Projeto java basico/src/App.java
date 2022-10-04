import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite seu nome: ");
        String name = sc.nextLine();
        System.out.println("Qual sua idade: ");
        int age = sc.nextInt();
        System.out.println("Digite seu sexo: (M ou F)");
        String gender = sc.next();

        System.out.println("Bem vindo " + name);
        System.out.println("Idade: " + age);
        System.out.println("Sexo: " + gender);     
    
        sc.close();
    }
}
