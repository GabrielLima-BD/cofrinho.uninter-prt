package cofrinho;

// Classe que representa o Euro
public class Euro extends Moeda { // representa valores em euro
    
    // Coloquei uma cotacao fixa de 5.50 reais (valor aproximado)
    private static final double COTACAO = 5.50;
    
    // Construtor
    public Euro(double valor) {
        super(valor);
    }
    
    // Mostra as informacoes do Euro (sem usar simbolo para evitar erro de encoding no console)
    @Override
    public void info() {
        System.out.println("Euro (EUR): EUR " + String.format("%.2f", valor));
    }
    
    // Converte o valor em euro pra Real multiplicando pela cotacao
    @Override
    public double converterParaReal() {
        return valor * COTACAO;
    }
}
