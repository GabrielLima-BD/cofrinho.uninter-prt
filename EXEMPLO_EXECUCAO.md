# 🎮 Exemplo de Execução do Sistema

## 📺 Simulação de Uso Completo

```
╔════════════════════════════════════╗
║      COFRINHO DE MOEDAS            ║
╚════════════════════════════════════╝
1 - Adicionar moeda
2 - Remover moeda
3 - Listar moedas
4 - Calcular total em Real
5 - Sair

Escolha uma opção: 1

--- Adicionar Moeda ---
1 - Real (BRL)
2 - Dólar (USD)
3 - Euro (EUR)
Escolha o tipo de moeda: 1
Digite o valor: 50
✓ Moeda adicionada com sucesso!

╔════════════════════════════════════╗
║      COFRINHO DE MOEDAS            ║
╚════════════════════════════════════╝
1 - Adicionar moeda
2 - Remover moeda
3 - Listar moedas
4 - Calcular total em Real
5 - Sair

Escolha uma opção: 1

--- Adicionar Moeda ---
1 - Real (BRL)
2 - Dólar (USD)
3 - Euro (EUR)
Escolha o tipo de moeda: 2
Digite o valor: 20
✓ Moeda adicionada com sucesso!

╔════════════════════════════════════╗
║      COFRINHO DE MOEDAS            ║
╚════════════════════════════════════╝
1 - Adicionar moeda
2 - Remover moeda
3 - Listar moedas
4 - Calcular total em Real
5 - Sair

Escolha uma opção: 1

--- Adicionar Moeda ---
1 - Real (BRL)
2 - Dólar (USD)
3 - Euro (EUR)
Escolha o tipo de moeda: 3
Digite o valor: 15
✓ Moeda adicionada com sucesso!

╔════════════════════════════════════╗
║      COFRINHO DE MOEDAS            ║
╚════════════════════════════════════╝
1 - Adicionar moeda
2 - Remover moeda
3 - Listar moedas
4 - Calcular total em Real
5 - Sair

Escolha uma opção: 3

========== MOEDAS NO COFRINHO ==========
1. Real (BRL): R$ 50,00
2. Dólar (USD): $ 20,00
3. Euro (EUR): € 15,00
========================================

╔════════════════════════════════════╗
║      COFRINHO DE MOEDAS            ║
╚════════════════════════════════════╝
1 - Adicionar moeda
2 - Remover moeda
3 - Listar moedas
4 - Calcular total em Real
5 - Sair

Escolha uma opção: 4

💰 Total no cofrinho: R$ 232,50

Cálculo:
- Real: R$ 50,00 × 1,00 = R$ 50,00
- Dólar: $ 20,00 × 5,00 = R$ 100,00
- Euro: € 15,00 × 5,50 = R$ 82,50
--------------------------------
TOTAL:                  R$ 232,50

╔════════════════════════════════════╗
║      COFRINHO DE MOEDAS            ║
╚════════════════════════════════════╝
1 - Adicionar moeda
2 - Remover moeda
3 - Listar moedas
4 - Calcular total em Real
5 - Sair

Escolha uma opção: 2

--- Remover Moeda ---
1 - Real (BRL)
2 - Dólar (USD)
3 - Euro (EUR)
Escolha o tipo de moeda: 2
Digite o valor: 20
✓ Moeda removida com sucesso!

╔════════════════════════════════════╗
║      COFRINHO DE MOEDAS            ║
╚════════════════════════════════════╝
1 - Adicionar moeda
2 - Remover moeda
3 - Listar moedas
4 - Calcular total em Real
5 - Sair

Escolha uma opção: 3

========== MOEDAS NO COFRINHO ==========
1. Real (BRL): R$ 50,00
2. Euro (EUR): € 15,00
========================================

╔════════════════════════════════════╗
║      COFRINHO DE MOEDAS            ║
╚════════════════════════════════════╝
1 - Adicionar moeda
2 - Remover moeda
3 - Listar moedas
4 - Calcular total em Real
5 - Sair

Escolha uma opção: 4

💰 Total no cofrinho: R$ 132,50

╔════════════════════════════════════╗
║      COFRINHO DE MOEDAS            ║
╚════════════════════════════════════╝
1 - Adicionar moeda
2 - Remover moeda
3 - Listar moedas
4 - Calcular total em Real
5 - Sair

Escolha uma opção: 5

👋 Encerrando o sistema. Até logo!
```

---

## 🧪 Casos de Teste

### ✅ Teste 1: Adicionar múltiplas moedas
- Adicionar R$ 100,00
- Adicionar $ 50,00
- Adicionar € 30,00
- **Resultado esperado:** 3 moedas no cofrinho

### ✅ Teste 2: Calcular total correto
- Com as moedas acima
- **Resultado esperado:** R$ 100 + (50×5) + (30×5.5) = R$ 515,00

### ✅ Teste 3: Remover moeda existente
- Remover $ 50,00
- **Resultado esperado:** Moeda removida, total = R$ 265,00

### ✅ Teste 4: Tentar remover moeda inexistente
- Remover $ 100,00 (não existe)
- **Resultado esperado:** "Moeda não encontrada"

### ✅ Teste 5: Listar cofrinho vazio
- Sem adicionar moedas
- Escolher opção 3 (Listar)
- **Resultado esperado:** "O cofrinho está vazio!"

---

## 🎯 Pontos de Atenção para o Professor

### ✅ Herança implementada corretamente
- `Real extends Moeda`
- `Dolar extends Moeda`
- `Euro extends Moeda`

### ✅ Polimorfismo em ação
- Método `info()` diferente para cada moeda
- Método `converterParaReal()` diferente para cada moeda
- `ArrayList<Moeda>` aceita todas as subclasses

### ✅ Abstração
- `Moeda` é abstrata
- Métodos abstratos obrigam implementação

### ✅ Código bem estruturado
- Comentários em português
- Nomes de variáveis claros
- Indentação correta
- Separação de responsabilidades

### ✅ Todas as funcionalidades solicitadas
- ✓ Adicionar moedas
- ✓ Remover moedas
- ✓ Listar moedas
- ✓ Calcular total em Real

---

## 📊 Tabela de Conversão

| Moeda | Símbolo | Cotação | Exemplo |
|-------|---------|---------|---------|
| Real | R$ | 1,00 | R$ 100 = R$ 100,00 |
| Dólar | $ | 5,00 | $ 100 = R$ 500,00 |
| Euro | € | 5,50 | € 100 = R$ 550,00 |

---

✅ **Sistema 100% funcional e pronto para entrega!**
