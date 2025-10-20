package cofrinho;

// Classe que representa a moeda Real (nossa moeda)
public class Real extends Moeda { // representa valores em real (BRL)
    
    // Construtor
    public Real(double valor) {
        super(valor);
    }
    
    // Mostro as informacoes do Real
    @Override
    public void info() {
        System.out.println("Real (BRL): R$ " + String.format("%.2f", valor));
    }
    
    // Como ja eh Real, so retorna o proprio valor
    @Override
    public double converterParaReal() {
        return valor;
    }
}
