package cofrinho;

import java.util.ArrayList;

// Classe que gerencia o cofrinho
// Aqui eu guardo todas as moedas num ArrayList
public class Cofrinho {
    
    // Usei ArrayList porque facilita adicionar e remover
    // E posso guardar qualquer tipo de moeda (polimorfismo)
    private ArrayList<Moeda> listaMoedas; // lista onde as moedas ficam guardadas
    
    // Construtor - cria o ArrayList vazio
    public Cofrinho() {
        this.listaMoedas = new ArrayList<>();
    }
    
    // Adiciona uma moeda no cofrinho
    public void adicionar(Moeda moeda) {
        listaMoedas.add(moeda);
        System.out.println(">> Moeda adicionada com sucesso!");
    }
    
    // Remove um valor de determinado tipo de moeda
    // Agora funciona como cofrinho de verdade - pode tirar qualquer valor que tenha
    public void remover(Moeda moedaRemover) {
        double valorRemover = moedaRemover.getValor(); // quanto o usuario quer tirar
        double saldoDisponivel = 0; // quanto existe desse tipo de moeda
        
        // Calculo quanto tem desse tipo de moeda no cofrinho
        for (Moeda m : listaMoedas) {
            if (m.getClass() == moedaRemover.getClass()) {
                saldoDisponivel += m.getValor();
            }
        }
        
        // Verifico se tem saldo suficiente
        if (saldoDisponivel < valorRemover) {
            System.out.println("** Saldo insuficiente! Voce tem apenas " + 
                             moedaRemover.getClass().getSimpleName() + " " + 
                             String.format("%.2f", saldoDisponivel));
            return;
        }
        
        // Remove o valor das moedas (vai tirando das maiores ate completar)
    double valorRestante = valorRemover; // vai diminuindo ate zerar
        
        for (int i = listaMoedas.size() - 1; i >= 0 && valorRestante > 0; i--) {
            Moeda m = listaMoedas.get(i);
            
            if (m.getClass() == moedaRemover.getClass()) {
                if (m.getValor() <= valorRestante) {
                    valorRestante -= m.getValor();
                    listaMoedas.remove(i);
                } else {
                    // Se a moeda e maior que o valor restante, diminui o valor dela
                    m.valor -= valorRestante;
                    valorRestante = 0;
                }
            }
        }
        
        System.out.println(">> Valor removido com sucesso!");
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
