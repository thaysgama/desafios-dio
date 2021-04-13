package Intermediarios.ValidadorSenhas;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class VerificadorSenhaDois {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String senha;
        while ((senha = br.readLine()) != null) {
            boolean tamanho = senha.length() >= 6 && senha.length() <= 32;
            // opcao abaixo checa minuscula, maiuscula, numero e caractere especial
            // boolean regexVerifica = senha.matches("^(?=.*[a-z])(?=." + "*[A-Z])(?=.*\\d)" + "(?=.*[-+_!@#$%^&*., ?]).+$");

            // checa se tem minuscula, maiuscula e numero
            boolean regexVerificaPresenca = senha.matches("^(?=.*[a-z])(?=." + "*[A-Z])(?=.*\\d).+$");
            // checa se não tem caractere especial
            boolean regexVerificaAusencia = !senha.matches("^(?=.*[-+_!@#$%^&*., ?]).+$");

            if (regexVerificaPresenca && regexVerificaAusencia && tamanho)
            {
                System.out.println("Senha valida.");
                }
            else {
                System.out.println("Senha invalida.");
            }
        }
    }
}