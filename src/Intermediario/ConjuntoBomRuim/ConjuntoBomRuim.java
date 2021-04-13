package Intermediario.ConjuntoBomRuim;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ConjuntoBomRuim {
     public static void main(String[] args) throws IOException {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int N = Integer.parseInt(br.readLine());

            //inicia só se numero for diferente de zero
            while (N != 0) {
                //cria uma lista com a entrada completa
                List<String> conjunto = new ArrayList<>();
                for (int i = 0; i < N; i++) {
                    conjunto.add(br.readLine());
                }

                //organiza lista
                conjunto = conjunto.stream().sorted().collect(Collectors.toList());
                String saida = "Conjunto Bom";

                //compara se uma palavra é prefixo de outra
                for (int i = 0; i < N - 1; i++) {
                    if (conjunto.get(i + 1).startsWith(conjunto.get(i))) {
                        saida = "Conjunto Ruim";
                    }
                }

                System.out.println(saida);
                N = Integer.parseInt(br.readLine());
            }
        }
    }
