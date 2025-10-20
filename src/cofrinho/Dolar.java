package cofrinho;

// Classe que representa o Dolar
public class Dolar extends Moeda { // representa valores em dolar
    
    // Coloquei uma cotacao fixa de 5 reais (valor aproximado)
    private static final double COTACAO = 5.00;
    
    // Construtor
    public Dolar(double valor) {
        super(valor);
    }
    
    // Mostra as informacoes do Dolar (sem acento para evitar erro no console)
    @Override
    public void info() {
        System.out.println("Dolar (USD): $ " + String.format("%.2f", valor));
    }
    
    // Converto o valor em dolar pra Real multiplicando pela cotacao
    @Override
    public double converterParaReal() {
        return valor * COTACAO;
    }
}
