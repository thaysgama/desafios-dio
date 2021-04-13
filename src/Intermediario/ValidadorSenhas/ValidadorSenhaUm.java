package Intermediarios.ValidadorSenhas;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class ValidadorSenhaUm {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String senha;

        while ((senha = br.readLine()) != null) {
            boolean numero = false;
            boolean letraMaiuscula = false;
            boolean letraMinuscula = false;
            boolean tamanho = senha.length() >= 6 && senha.length() <= 32;
            // checa se tem caractere especial
            boolean pontuacao = !senha.matches("^(?=.*[-+_!@#$%^&*., ?]).+$");

            for (int i = 0; i < senha.length(); i++) {

                if (Character.isDigit(senha.charAt(i))) {
                    numero = true;
                } else if (Character.isUpperCase(senha.charAt(i))) {
                    letraMaiuscula = true;
                } else if (Character.isLowerCase(senha.charAt(i))) {
                    letraMinuscula = true;
                }
            }

            if ((numero && letraMaiuscula && letraMinuscula && pontuacao && tamanho))
            {
                System.out.println("Senha valida.");
            }
            else {
                System.out.println("Senha invalida.");
            }
        }
    }
}
