package cofrinho;

import java.util.ArrayList;

// Classe que gerencia o cofrinho
// Aqui eu guardo todas as moedas num ArrayList
public class Cofrinho {
    
    // Usei ArrayList porque facilita adicionar e remover
    // E posso guardar qualquer tipo de moeda (polimorfismo)
    private ArrayList<Moeda> listaMoedas;
    
    // Construtor - cria o ArrayList vazio
    public Cofrinho() {
        this.listaMoedas = new ArrayList<>();
    }
    
    // Adiciona uma moeda no cofrinho
    public void adicionar(Moeda moeda) {
        listaMoedas.add(moeda);
        System.out.println(">> Moeda adicionada com sucesso!");
    }
    
    // Remove uma moeda especifica
    // Uso o equals que sobrescrevi na classe Moeda
    public void remover(Moeda moeda) {
        if (listaMoedas.remove(moeda)) {
            System.out.println(">> Moeda removida com sucesso!");
        } else {
            System.out.println("** Moeda nao encontrada no cofrinho.");
        }
    }
    
    // Lista todas as moedas que tem no cofrinho
    // Aqui acontece o polimorfismo - cada moeda mostra sua info diferente
    public void listagemMoedas() {
        if (listaMoedas.isEmpty()) {
            System.out.println("O cofrinho esta vazio!");
            return;
        }
        
        System.out.println("\n========== MOEDAS NO COFRINHO ==========");
        for (int i = 0; i < listaMoedas.size(); i++) {
            System.out.print((i + 1) + ". ");
            listaMoedas.get(i).info(); // Polimorfismo aqui!
        }
        System.out.println("========================================\n");
    }
    
    // Calcula quanto tem no total convertendo tudo pra Real
    public double totalConvertido() {
        double total = 0;
        
        // Pra cada moeda, converto pra Real e somo
        for (Moeda moeda : listaMoedas) {
            total += moeda.converterParaReal(); // Polimorfismo de novo!
        }
        
        return total;
    }
}
