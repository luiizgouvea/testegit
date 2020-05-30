import java.util.Scanner;

public class Entrada {
    public static void main (String args[]){
        String nome;
        int idade;
        
        Scanner tec = new Scanner (System.in);

        System.out.println("Qual seu nome?");
        nome=tec.nextLine();
        System.out.println("Qual sua idade?");
        idade=tec.nextInt();

    }
    
}