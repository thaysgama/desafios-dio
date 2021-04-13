package Intermediario.EntrevistaEmbaracosa;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class EntrevistaEmbaracosa {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String entrada;
        while ((entrada = br.readLine()) != null) {
            boolean repeticao = false;
            for (int i = 0; i <= entrada.length()-1; i++) {
                if (entrada.substring(0, i).endsWith(entrada.substring(i))) {
                    System.out.println(entrada.substring(0, i));
                    repeticao = true;
                }
            }
            if (!repeticao)
                System.out.println(entrada);

        }
    }
}