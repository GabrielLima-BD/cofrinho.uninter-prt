# 🚀 COMO RODAR O PROJETO - GUIA SIMPLIFICADO

## ❌ Problema: Java não está instalado

Para rodar o projeto, você precisa instalar o Java JDK.

---

## ✅ SOLUÇÃO 1: Instalar Java JDK (RECOMENDADO)

### Passo 1: Baixar o Java
1. Acesse: https://www.oracle.com/java/technologies/downloads/
2. Baixe o **Java 17** ou superior para Windows
3. Escolha o instalador: `x64 Installer` (.exe)

### Passo 2: Instalar
1. Execute o instalador baixado
2. Clique em "Next" → "Next" → "Install"
3. Aguarde a instalação concluir
4. Clique em "Close"

### Passo 3: Verificar
Abra o PowerShell e digite:
```powershell
java -version
```

Deve aparecer algo como:
```
java version "17.0.x"
```

### Passo 4: Rodar o Projeto
```powershell
cd "c:\Users\gbr bzzr\Documents\Vs-Code\Faculdade\Cofrinho\src"
javac cofrinho/*.java
java cofrinho.Principal
```

---

## ✅ SOLUÇÃO 2: Usar o Eclipse (MAIS FÁCIL)

### O Eclipse já vem com Java embutido!

1. **Baixar Eclipse:**
   - Acesse: https://www.eclipse.org/downloads/
   - Baixe o "Eclipse IDE for Java Developers"
   - Execute o instalador

2. **Abrir o Projeto:**
   - Abra o Eclipse
   - File → Open Projects from File System
   - Selecione a pasta: `c:\Users\gbr bzzr\Documents\Vs-Code\Faculdade\Cofrinho`
   - Clique em Finish

3. **Rodar:**
   - Abra o arquivo `Principal.java`
   - Clique com botão direito
   - Run As → Java Application

4. **Pronto!** 🎉 O programa vai rodar no console do Eclipse

---

## ✅ SOLUÇÃO 3: Usar Extensão do VS Code (VOCÊ JÁ TEM O VS CODE)

### Passo 1: Instalar Extensão Java
1. No VS Code, clique no ícone de Extensões (ou Ctrl+Shift+X)
2. Procure por: **Extension Pack for Java**
3. Clique em **Install**
4. Aguarde instalar (vai baixar o Java automaticamente)

### Passo 2: Abrir o Arquivo Principal
1. No VS Code, abra o arquivo: `Principal.java`
2. Você verá um botão **"Run"** acima do método `main`
3. Clique em **Run**

### Passo 3: Usar o Programa
O programa vai rodar no terminal integrado do VS Code!

---

## 🎮 Como Usar o Sistema (após rodar)

Você verá este menu:

```
╔════════════════════════════════════╗
║      COFRINHO DE MOEDAS            ║
╚════════════════════════════════════╝
1 - Adicionar moeda
2 - Remover moeda
3 - Listar moedas
4 - Calcular total em Real
5 - Sair

Escolha uma opção:
```

### Teste Rápido:
1. Digite **1** e Enter (adicionar moeda)
2. Digite **1** e Enter (escolher Real)
3. Digite **100** e Enter (valor)
4. Digite **3** e Enter (listar moedas)
5. Você verá: `Real (BRL): R$ 100,00`
6. Digite **4** e Enter (calcular total)
7. Você verá: `💰 Total no cofrinho: R$ 100,00`
8. Digite **5** e Enter (sair)

---

## 🏆 RECOMENDAÇÃO: Use o Eclipse!

**Por quê?**
- ✅ Mais fácil de usar
- ✅ Já vem com Java
- ✅ É o que o professor espera
- ✅ Facilita exportar o .zip
- ✅ Melhor para aprender Java

---

## ⚡ RESUMO SUPER RÁPIDO

### Opção Mais Rápida no VS Code:
1. Ctrl+Shift+X (abrir extensões)
2. Procurar: "Extension Pack for Java"
3. Instalar
4. Abrir arquivo `Principal.java`
5. Clicar em "Run" acima do método main

### Opção Tradicional:
1. Baixar Eclipse: https://www.eclipse.org/downloads/
2. Instalar e abrir
3. File → Open Projects from File System
4. Selecionar pasta `Cofrinho`
5. Clicar em `Principal.java` → Run As → Java Application

---

## 📞 Dúvidas?

**Não conseguiu instalar o Java?**
→ Use o Eclipse (ele já tem Java)

**VS Code não roda?**
→ Instale a extensão "Extension Pack for Java"

**Quer o mais fácil?**
→ Use o Eclipse!

---

✨ **Escolha uma das 3 opções acima e seu projeto vai rodar!** ✨
