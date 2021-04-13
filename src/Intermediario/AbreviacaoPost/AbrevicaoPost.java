package Intermediario.AbreviacaoPost;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.*;


public class AbrevicaoPost {
    protected static HashMap<String, Integer> palavraMaiorQueDois;
    protected static TreeMap<Character, String> abreviacao;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String entrada;

        while (!".".equals((entrada = br.readLine()))) { //Lê entrada somente diferente de ponto.

            StringTokenizer st = new StringTokenizer(entrada);
            palavraMaiorQueDois = new HashMap<>();
            abreviacao = new TreeMap<>();

            while (st.hasMoreTokens()) {
                String proximaPalavra = st.nextToken();

                //Ignora as palavras menores ou iguais a dois caracteres.
                if (proximaPalavra.length() <= 2) continue;
                    palavraMaiorQueDois.put(proximaPalavra, palavraMaiorQueDois.containsKey(proximaPalavra) ? palavraMaiorQueDois.get(proximaPalavra) + 1 : 1);
                    //Insere num hashmap todas as palavras maiores que três caracteres e o numero de vezes que elas aparecem.
                    abreviacao.put(proximaPalavra.charAt(0), melhorPalavraAbreviada(proximaPalavra));

            } imprimirPost(entrada);
        }
    }

    private static String melhorPalavraAbreviada (String proximaPalavra){

        //retorne a palvra se não existe abrevicação para ela
        if (!abreviacao.containsKey(proximaPalavra.charAt(0))) {
            return proximaPalavra;
        }
        // cria variáveis para comparar qual a maior quantidade de caracteres abreviados
        // variável multiplica a quantidade de letras da palavra menos dois, que é a abreviação, pela quantidade de vezes que a palavra repete
        int caracteresReduzidosNovo = palavraMaiorQueDois.get(proximaPalavra) * (proximaPalavra.length() - 2);
        String abreviacaoAtual = abreviacao.get(proximaPalavra.charAt(0));
        int caracteresReduzidos = palavraMaiorQueDois.get(abreviacaoAtual) * (abreviacaoAtual.length() - 2);
        return caracteresReduzidosNovo > caracteresReduzidos ? proximaPalavra : abreviacaoAtual;
    }

    private static void imprimirPost (String entrada){

        // cria lista para substituir as palavras por suas respectivas abreviações
        List<String> listaAbreviacoes = new ArrayList<>();

        for (Character c : abreviacao.keySet()){
            String palavraAbreviada = abreviacao.get(c);
            entrada = entrada.replaceAll("\\b" + palavraAbreviada +"\\b",  c + ".");
            // inclui o dicionario das abreviações na lista
            listaAbreviacoes.add(c + ". = " + palavraAbreviada);
        }
        System.out.println(entrada.trim());
        System.out.println(listaAbreviacoes.size());
        listaAbreviacoes.forEach(System.out::println);
    }
}