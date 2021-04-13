package Aritmetico.ContagemRegressiva;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.SortedMap;
import java.util.TreeMap;

public class ContagemRepetida {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> lista =new ArrayList<Integer>();

        int entrada =sc.nextInt();


        //entrada maior que 0 e a partir do valor dela decrementa e adiciona na lista
        while (entrada --> 0)
            lista.add(sc.nextInt());

        //cria map para contar quantas vezes numero aparece
        //Treemap ja monta valores ordenados
        SortedMap<Integer, Integer> contaQuant = new TreeMap<>();
        lista.forEach(id -> contaQuant.compute(id, (key,val) ->(val == null ? 1 : val+1)));


        contaQuant.entrySet().forEach(entry -> {
            System.out.printf("%d aparece %d vez(es)\n", entry.getKey(), entry.getValue());
        });

        sc.close();
    }
}