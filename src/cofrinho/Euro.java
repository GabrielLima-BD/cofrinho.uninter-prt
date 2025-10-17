package cofrinho;

// Classe que representa o Euro
public class Euro extends Moeda {
    
    // Coloquei uma cotacao fixa de 5.50 reais (valor aproximado)
    private static final double COTACAO = 5.50;
    
    // Construtor
    public Euro(double valor) {
        super(valor);
    }
    
    // Mostro as informacoes do Euro
    @Override
    public void info() {
        System.out.println("Euro (EUR): € " + String.format("%.2f", valor));
    }
    
    // Converto o valor em euro pra Real multiplicando pela cotacao
    @Override
    public double converterParaReal() {
        return valor * COTACAO;
    }
}
