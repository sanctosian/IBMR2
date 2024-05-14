import java.util.ArrayDeque;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> lista = new ArrayList<>(5);
        ArrayDeque<Integer> pilha = new ArrayDeque<>(5);
        ArrayDeque<Integer> fila = new ArrayDeque<>(10);

        System.out.println("Inserindo os números 1, 2, 3, 4, 5 na lista");
        for (int i = 1; i <= 5; i++) {
            lista.add(i);
        }
        System.out.println(lista);
        System.out.println("--------------------------------------------");

        System.out.println("Removendo os dados da célula inicial da lista");
        while (!lista.isEmpty()) {
            int elemento = lista.remove(0);
            System.out.println(lista);
        }
        System.out.println("Lista vazia!");
        System.out.println("--------------------------------------------");

        System.out.println("Inserindo os dados da lista na pilha");
        for (int i = 1; i <= 5; i++) {
            pilha.push(i);
        }
        System.out.println(pilha);
        System.out.println("--------------------------------------------");

        System.out.println("Removendo os dados da pilha");
        pilha.clear();
        System.out.println(pilha);
        System.out.println("--------------------------------------------");

        System.out.println("Inserindo os dados da pilha na fila");
        for (int i = 1; i <= 5; i++) {
            fila.add(i);
        }
        System.out.println(fila);
        System.out.println("--------------------------------------------");

        System.out.println("Adicionando os números 6, 7, 8, 9, 10 na lista");
        for (int i = 6; i <= 10; i++) {
            lista.add(i);
        }
        System.out.println(lista);
        System.out.println("--------------------------------------------");

        System.out.println("Removendo os dados das células iniciais da lista");
        while (!lista.isEmpty()) {
            int elemento = lista.remove(0);
            System.out.println(lista);
        }
        System.out.println("Lista vazia!");
        System.out.println("--------------------------------------------");

        System.out.println("Inserindo os dados da lista na pilha");
        for (int i = 6; i <= 10; i++) {
            pilha.push(i);
        }
        System.out.println(pilha);
        System.out.println("--------------------------------------------");

        System.out.println("Removendo os dados da pilha");
        pilha.clear();
        System.out.println(pilha);
        System.out.println("--------------------------------------------");

        System.out.println("Inserindo os dados da pilha na fila");
        for (int i = 6; i <= 10; i++) {
            fila.add(i);
        }
        System.out.println(fila);
    }
}