package aulajava;
import java.util.Scanner;

public class TesteJava {
    public static void main(String[] args){
        int numero1;
        int numero2;
        int soma;

        Scanner valor = new Scanner(System.in);

        System.out.println("Entre com o primeiro número:");
        numero1 = valor.nextInt();

        System.out.println("Entre com o segundo número:");
        numero2 = valor.nextInt();

        soma = numero1 + numero2;

        System.out.println("O resultado da soma de " + numero1 + " e " + numero2 + " é:" + soma);

    }
}
