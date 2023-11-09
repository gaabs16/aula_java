package aulajava;
import java.util.Scanner;

public class MediaJava {
    public static void main(String[] args) {
        float numero1, numero2, numero3, numero4, media;

        Scanner nota = new Scanner(System.in);

        System.out.println("Entre com o primeiro número:");
        numero1 = nota.nextFloat();

        System.out.println("Entre com o segundo número:");
        numero2 = nota.nextFloat();

        System.out.println("Entre com o terceiro número:");
        numero3 = nota.nextFloat();

        System.out.println("Entre com o quarto número:");
        numero4 = nota.nextFloat();

        media = (numero1 + numero2 + numero3 + numero4)/4;

        System.out.println("o media das 4 notas é: " + media);

        if(media>5){
            System.out.println("aluno aprovado!");
        }else if(media==5){
            System.out.println("aluno recuperacao!");
        }else{
            System.out.println("aluno de reprovado!");
        }
    }
}
