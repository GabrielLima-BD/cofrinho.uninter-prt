package cofrinho;

// Classe base pra todas as moedas
// Fiz ela abstrata porque nao faz sentido criar uma moeda generica
public abstract class Moeda {
    
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
    
    // Getter simples pro valor
    public double getValor() {
        return valor;
    }
    
    // Fiz o equals pra conseguir comparar moedas
    // Precisa disso pro metodo remover funcionar direito
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Moeda moeda = (Moeda) obj;
        return Double.compare(moeda.valor, valor) == 0;
    }
}
