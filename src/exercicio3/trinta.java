package exercicio3;

import java.util.Scanner;

public class trinta {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Entre com seu salário");
        double amount = sc.nextDouble();

        System.out.println("Entre com o valor da prestação");
        double value = sc.nextDouble();

        double max = amount * 0.3;

        if(value >= max){
            System.out.println("Não há margem para emprestimo");
        } else {
            System.out.println("Emprestimo aceito");
        }
    }
}
