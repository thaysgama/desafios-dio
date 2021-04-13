package Aritmetico.AnaliseNumeros;
import java.io.IOException;
import java.util.Scanner;

public class AnaliseNumeros {


    public static void main(String[] args) throws IOException {
        Scanner leitor = new Scanner(System.in);

        int par = 0;
        int impar = 0;
        int positivo =0;
        int negativo = 0;
        int entrada[] = new int[5];


        while (leitor.hasNextInt()){
            for (int i = 0; i < entrada.length; i++) {
                entrada[i] = leitor.nextInt();
                if (entrada[i] % 2 == 0) par++;
                if (entrada[i] % 2 != 0) impar++;
                if (entrada[i] > 0) positivo++;
                if (entrada[i] < 0) negativo++;
            }

        System.out.println(par+" valor(es) par(es)");
        System.out.println(impar+" valor(es) impar(es)");
        System.out.println(positivo+" valor(es) positivo(s)");
        System.out.println(negativo+" valor(es) negativo(s)");
    }
    }

}