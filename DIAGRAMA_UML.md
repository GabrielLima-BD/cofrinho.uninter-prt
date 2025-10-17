# 📐 Diagrama de Classes UML - Cofrinho

## Representação Visual da Estrutura

```
┌─────────────────────────────────────────┐
│        <<abstract>>                     │
│            Moeda                        │
├─────────────────────────────────────────┤
│ # valor: double                         │
├─────────────────────────────────────────┤
│ + Moeda(valor: double)                  │
│ + getValor(): double                    │
│ + <<abstract>> info(): void             │
│ + <<abstract>> converterParaReal(): double │
│ + equals(obj: Object): boolean          │
└─────────────────────────────────────────┘
                   △
                   │
                   │ (herança)
       ┌───────────┼───────────┐
       │           │           │
       │           │           │
┌──────┴──────┐ ┌──┴─────────┐ ┌──────┴──────┐
│    Real     │ │   Dolar    │ │    Euro     │
├─────────────┤ ├────────────┤ ├─────────────┤
│ (sem        │ │ - COTACAO  │ │ - COTACAO   │
│  atributos  │ │   = 5.00   │ │   = 5.50    │
│  novos)     │ │            │ │             │
├─────────────┤ ├────────────┤ ├─────────────┤
│ + Real()    │ │ + Dolar()  │ │ + Euro()    │
│ + info()    │ │ + info()   │ │ + info()    │
│ + converter │ │ + converter│ │ + converter │
│   ParaReal()│ │   ParaReal()│ │   ParaReal()│
└─────────────┘ └────────────┘ └─────────────┘




┌─────────────────────────────────────────┐
│           Cofrinho                      │
├─────────────────────────────────────────┤
│ - listaMoedas: ArrayList<Moeda>         │
├─────────────────────────────────────────┤
│ + Cofrinho()                            │
│ + adicionar(moeda: Moeda): void         │
│ + remover(moeda: Moeda): void           │
│ + listagemMoedas(): void                │
│ + totalConvertido(): double             │
└─────────────────────────────────────────┘
                   △
                   │
                   │ (usa)
                   │
┌─────────────────────────────────────────┐
│           Principal                     │
├─────────────────────────────────────────┤
│ (sem atributos)                         │
├─────────────────────────────────────────┤
│ + main(args: String[]): void            │
│ - adicionarMoeda(): void                │
│ - removerMoeda(): void                  │
└─────────────────────────────────────────┘
```

---

## Legenda

| Símbolo | Significado |
|---------|-------------|
| `+` | Público |
| `-` | Privado |
| `#` | Protegido |
| `<<abstract>>` | Classe ou método abstrato |
| `△` | Herança (extends) |
| `◇` | Composição/Agregação (has-a) |

---

## Relacionamentos

### 1. Herança (Generalização)
```
Moeda ←─── Real
      ←─── Dolar
      ←─── Euro
```

**Explicação:** Real, Dolar e Euro herdam de Moeda

---

### 2. Composição
```
Cofrinho ◆──→ Moeda
```

**Explicação:** Cofrinho contém uma lista de Moedas (ArrayList)

---

### 3. Dependência
```
Principal ····→ Cofrinho
Principal ····→ Moeda (e suas subclasses)
```

**Explicação:** Principal usa Cofrinho e cria objetos Moeda

---

## Detalhamento das Classes

### 📦 Classe Abstrata: Moeda

```java
public abstract class Moeda {
    protected double valor;
    
    public Moeda(double valor)
    public double getValor()
    public abstract void info()
    public abstract double converterParaReal()
    public boolean equals(Object obj)
}
```

**Responsabilidade:** Definir a estrutura base para todas as moedas

---

### 💵 Classe: Real

```java
public class Real extends Moeda {
    public Real(double valor)
    public void info()
    public double converterParaReal()
}
```

**Responsabilidade:** Representar moedas em Real brasileiro

**Conversão:** valor × 1.00

---

### 💲 Classe: Dolar

```java
public class Dolar extends Moeda {
    private static final double COTACAO = 5.00;
    
    public Dolar(double valor)
    public void info()
    public double converterParaReal()
}
```

**Responsabilidade:** Representar moedas em Dólar americano

**Conversão:** valor × 5.00

---

### 💶 Classe: Euro

```java
public class Euro extends Moeda {
    private static final double COTACAO = 5.50;
    
    public Euro(double valor)
    public void info()
    public double converterParaReal()
}
```

**Responsabilidade:** Representar moedas em Euro

**Conversão:** valor × 5.50

---

### 🏦 Classe: Cofrinho

```java
public class Cofrinho {
    private ArrayList<Moeda> listaMoedas;
    
    public Cofrinho()
    public void adicionar(Moeda moeda)
    public void remover(Moeda moeda)
    public void listagemMoedas()
    public double totalConvertido()
}
```

**Responsabilidade:** Gerenciar coleção de moedas

**Estrutura de dados:** ArrayList<Moeda> (polimorfismo)

---

### 🎮 Classe: Principal

```java
public class Principal {
    public static void main(String[] args)
    private static void adicionarMoeda(Scanner, Cofrinho)
    private static void removerMoeda(Scanner, Cofrinho)
}
```

**Responsabilidade:** Interface do usuário via menu interativo

---

## Fluxo de Execução

```
1. Principal.main()
   │
   ├─→ Cria Scanner
   ├─→ Cria Cofrinho
   │
   └─→ Loop do Menu
       │
       ├─→ [1] adicionarMoeda()
       │   └─→ Cofrinho.adicionar(Moeda)
       │       └─→ ArrayList.add()
       │
       ├─→ [2] removerMoeda()
       │   └─→ Cofrinho.remover(Moeda)
       │       └─→ ArrayList.remove()
       │
       ├─→ [3] Cofrinho.listagemMoedas()
       │   └─→ Para cada moeda:
       │       └─→ moeda.info() (polimorfismo)
       │
       ├─→ [4] Cofrinho.totalConvertido()
       │   └─→ Para cada moeda:
       │       └─→ moeda.converterParaReal() (polimorfismo)
       │
       └─→ [5] Sair
```

---

## Princípios SOLID Aplicados

### ✅ S - Single Responsibility (Responsabilidade Única)
- Cada classe tem uma responsabilidade clara
- `Moeda` → representa moeda
- `Cofrinho` → gerencia coleção
- `Principal` → interface com usuário

### ✅ O - Open/Closed (Aberto/Fechado)
- Aberto para extensão: fácil adicionar novas moedas
- Fechado para modificação: não precisa alterar Moeda ou Cofrinho

### ✅ L - Liskov Substitution (Substituição de Liskov)
- Qualquer subclasse de Moeda pode substituir Moeda
- `ArrayList<Moeda>` funciona com Real, Dolar ou Euro

### ✅ I - Interface Segregation (Segregação de Interface)
- Interface mínima e coesa
- Apenas métodos necessários

### ✅ D - Dependency Inversion (Inversão de Dependência)
- Cofrinho depende da abstração `Moeda`
- Não depende das implementações concretas

---

## Padrões de Projeto Identificados

### 🎯 Template Method (implícito)
- Classe abstrata `Moeda` define o template
- Subclasses implementam detalhes específicos

### 🎯 Strategy (implícito)
- Cada moeda tem sua estratégia de conversão
- Método `converterParaReal()` implementado diferentemente

---

## Multiplicidade

```
Principal  1 ─────→ 1  Cofrinho
Cofrinho   1 ─────→ *  Moeda
Moeda      1 ◄───── *  {Real, Dolar, Euro}
```

- 1 Principal usa 1 Cofrinho
- 1 Cofrinho contém * (zero ou mais) Moedas
- Moedas podem ser Real, Dolar ou Euro

---

✅ **Diagrama completo e explicado!**
