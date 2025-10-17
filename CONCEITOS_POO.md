# 📚 Explicação dos Conceitos de POO no Projeto Cofrinho

## 🔹 1. HERANÇA

### O que é?
Herança é um mecanismo que permite que uma classe herde atributos e métodos de outra classe.

### Como foi aplicado no projeto?

**Classe Pai (Superclasse):**
```java
public abstract class Moeda {
    protected double valor;
    // métodos abstratos
}
```

**Classes Filhas (Subclasses):**
```java
public class Real extends Moeda { ... }
public class Dolar extends Moeda { ... }
public class Euro extends Moeda { ... }
```

### Benefícios no projeto:
- ✅ As classes `Real`, `Dolar` e `Euro` herdam o atributo `valor`
- ✅ Não precisa repetir código comum em cada moeda
- ✅ Facilita manutenção: mudanças na classe `Moeda` afetam todas as moedas

---

## 🔹 2. POLIMORFISMO

### O que é?
Polimorfismo significa "muitas formas". Permite que objetos de classes diferentes sejam tratados de forma uniforme, mas se comportem de maneiras específicas.

### Como foi aplicado no projeto?

**Exemplo 1 - Método info():**
Cada moeda exibe suas informações de forma diferente:

```java
// Real
public void info() {
    System.out.println("Real (BRL): R$ " + valor);
}

// Dolar
public void info() {
    System.out.println("Dólar (USD): $ " + valor);
}

// Euro
public void info() {
    System.out.println("Euro (EUR): € " + valor);
}
```

**Exemplo 2 - Método converterParaReal():**
Cada moeda converte de forma diferente:

```java
// Real - retorna o próprio valor
public double converterParaReal() {
    return valor;
}

// Dolar - multiplica pela cotação
public double converterParaReal() {
    return valor * 5.00;
}

// Euro - multiplica pela cotação
public double converterParaReal() {
    return valor * 5.50;
}
```

**Exemplo 3 - ArrayList polimórfico:**
```java
private ArrayList<Moeda> listaMoedas;
```

Este ArrayList pode armazenar objetos de qualquer tipo que seja `Moeda`:
- ✅ Pode adicionar objetos `Real`
- ✅ Pode adicionar objetos `Dolar`
- ✅ Pode adicionar objetos `Euro`

### Benefícios no projeto:
- ✅ **Flexibilidade:** O cofrinho aceita qualquer tipo de moeda
- ✅ **Código limpo:** Não precisa criar listas separadas para cada moeda
- ✅ **Extensibilidade:** Fácil adicionar novas moedas (Libra, Iene, etc.)

---

## 🔹 3. ABSTRAÇÃO

### O que é?
Abstração é o processo de esconder detalhes complexos e mostrar apenas o essencial. Classes abstratas não podem ser instanciadas diretamente.

### Como foi aplicado no projeto?

```java
public abstract class Moeda {
    // Não posso fazer: new Moeda(10.0) ❌
    
    // Métodos abstratos - obrigam as subclasses a implementar
    public abstract void info();
    public abstract double converterParaReal();
}
```

### Por que usar abstração aqui?
- ✅ Não faz sentido criar uma "moeda genérica"
- ✅ Toda moeda deve ter um tipo específico (Real, Dólar, Euro)
- ✅ Garante que todas as moedas implementem os métodos essenciais

---

## 🔹 4. ENCAPSULAMENTO

### O que é?
Encapsulamento é proteger os dados de uma classe, controlando o acesso através de métodos.

### Como foi aplicado no projeto?

**Atributo protegido:**
```java
protected double valor;  // Não é público
```

**Acesso controlado:**
```java
public double getValor() {
    return valor;  // Só permite leitura
}
```

**Lista privada no Cofrinho:**
```java
private ArrayList<Moeda> listaMoedas;  // Não acessível diretamente
```

### Benefícios:
- ✅ Protege os dados internos
- ✅ Controla como os dados são acessados e modificados
- ✅ Evita alterações indevidas

---

## 🎯 RESUMO: Como tudo funciona junto

### Cenário de uso:

1. **Criação de moedas (Herança + Polimorfismo):**
```java
Moeda m1 = new Real(50.0);      // Real herda de Moeda
Moeda m2 = new Dolar(20.0);     // Dolar herda de Moeda
Moeda m3 = new Euro(15.0);      // Euro herda de Moeda
```

2. **Adicionando ao cofrinho (Polimorfismo):**
```java
cofrinho.adicionar(m1);  // Aceita Real
cofrinho.adicionar(m2);  // Aceita Dolar
cofrinho.adicionar(m3);  // Aceita Euro
```

3. **Listando moedas (Polimorfismo em ação):**
```java
for (Moeda moeda : listaMoedas) {
    moeda.info();  // Cada moeda exibe de forma diferente!
}
// Saída:
// Real (BRL): R$ 50.00
// Dólar (USD): $ 20.00
// Euro (EUR): € 15.00
```

4. **Calculando total (Polimorfismo em ação):**
```java
for (Moeda moeda : listaMoedas) {
    total += moeda.converterParaReal();  // Cada uma converte diferente!
}
// Real: 50.00 * 1.00 = 50.00
// Dolar: 20.00 * 5.00 = 100.00
// Euro: 15.00 * 5.50 = 82.50
// Total = R$ 232.50
```

---

## ✅ Checklist de Conceitos Aplicados

- ✅ **Herança:** Real, Dolar e Euro herdam de Moeda
- ✅ **Polimorfismo:** Mesmo método, comportamentos diferentes
- ✅ **Abstração:** Moeda é abstrata, não pode ser instanciada
- ✅ **Encapsulamento:** Atributos protegidos, acesso controlado
- ✅ **ArrayList:** Estrutura de dados para armazenar coleção
- ✅ **Override:** Métodos sobrescritos nas subclasses
- ✅ **Comentários:** Código bem documentado

---

**Este documento serve como guia de estudo e referência para entender os conceitos de POO aplicados no projeto.**
