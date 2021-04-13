package Aritmetico.Divisores;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Divisores {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        //declare suas variaveis
        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        int C = Integer.parseInt(st.nextToken());
        int D = Integer.parseInt(st.nextToken());
        br.close();

        int menorPossivel=-1;

        //A é divisor de C também
        if (C % A ==0) {
            //simplificar pra pegar o menor numero
            for (int i = 0; i < C/A; i++) {
                int n = A*i;
                //B não é divisor de n, n não é divisor de D e n é divisor de C.
                if (n % B !=0 && D % n !=0 && C % n ==0){
                    menorPossivel = n;
                    break;
                }

            }

        }
        System.out.println(menorPossivel);

    }
}
