package cofrinho;

// Classe base pra todas as moedas
// Fiz ela abstrata porque nao faz sentido criar uma moeda generica
public abstract class Moeda { // modelo base para outras moedas
    
    // Guardei o valor como protected pra poder usar nas classes filhas
    protected double valor;
    
    // Construtor que recebe o valor da moeda
    public Moeda(double valor) {
        this.valor = valor;
    }
    
    // Metodo abstrato pra mostrar info da moeda
    // Cada tipo de moeda vai implementar do seu jeito
    public abstract void info();
    
    // Metodo abstrato pra converter pra Real
    // Cada moeda tem sua cotacao
    public abstract double converterParaReal();
    
    // Pega o valor atual da moeda
    public double getValor() {
        return valor;
    }
    
    // Fiz o equals pra conseguir comparar moedas
    // Precisa disso pro metodo remover funcionar direito
    // Comparo o tipo (getClass) e o valor
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;
        if (getClass() != obj.getClass()) return false; // Tem que ser o mesmo tipo (Real, Dolar, Euro)
        Moeda outra = (Moeda) obj;
        return Double.compare(outra.valor, valor) == 0;
    }
}
