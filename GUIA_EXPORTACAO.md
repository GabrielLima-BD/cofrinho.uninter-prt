# 📦 Guia de Exportação do Projeto para Entrega

## 🎯 Passo a Passo - Eclipse

### 1️⃣ Abrir o Eclipse

- Inicie o Eclipse IDE
- Certifique-se de que o projeto `Cofrinho` está no workspace

---

### 2️⃣ Importar o Projeto (se ainda não estiver no Eclipse)

1. Clique em **File** → **Open Projects from File System...**
2. Clique em **Directory...**
3. Navegue até a pasta: `c:\Users\gbr bzzr\Documents\Vs-Code\Faculdade\Cofrinho`
4. Clique em **Selecionar pasta**
5. Clique em **Finish**

---

### 3️⃣ Verificar se o Projeto Compila

1. No **Package Explorer**, clique com botão direito no projeto `Cofrinho`
2. Selecione **Build Project**
3. Verifique se não há erros na aba **Problems**

---

### 4️⃣ Testar o Projeto

1. Abra o arquivo **Principal.java**
2. Clique com botão direito no arquivo
3. Selecione **Run As** → **Java Application**
4. Teste todas as funcionalidades:
   - ✅ Adicionar moedas
   - ✅ Remover moedas
   - ✅ Listar moedas
   - ✅ Calcular total

---

### 5️⃣ Exportar como .ZIP

1. Clique em **File** → **Export...**

2. Na janela que abrir:
   - Expanda **General**
   - Selecione **Archive File**
   - Clique em **Next**

3. Na próxima tela:
   - ✅ Marque o projeto **Cofrinho**
   - ✅ Certifique-se de que todos os arquivos estão marcados:
     - ✅ src/cofrinho/Moeda.java
     - ✅ src/cofrinho/Real.java
     - ✅ src/cofrinho/Dolar.java
     - ✅ src/cofrinho/Euro.java
     - ✅ src/cofrinho/Cofrinho.java
     - ✅ src/cofrinho/Principal.java
     - ✅ .classpath
     - ✅ .project

4. Em **To archive file:**
   - Clique em **Browse...**
   - Escolha o local para salvar
   - Digite o nome: `Cofrinho_SeuNome.zip`
   - Clique em **Salvar**

5. ✅ Marque a opção **"Create directory structure for files"**

6. Clique em **Finish**

---

### 6️⃣ Verificar o Arquivo .ZIP

1. Navegue até o local onde salvou o .zip
2. Extraia o arquivo em uma pasta temporária
3. Verifique se todos os arquivos estão presentes:

```
Cofrinho/
├── .classpath
├── .project
├── README.md
├── CONCEITOS_POO.md
└── src/
    └── cofrinho/
        ├── Moeda.java
        ├── Real.java
        ├── Dolar.java
        ├── Euro.java
        ├── Cofrinho.java
        └── Principal.java
```

---

### 7️⃣ Submeter no AVA

1. Acesse o AVA da disciplina
2. Vá até a aba **Trabalhos**
3. Localize a atividade **"Cofrinho de Moedas"**
4. Clique em **Adicionar Entrega**
5. Faça upload do arquivo .zip
6. Clique em **Enviar**

---

## ⚠️ IMPORTANTE - Antes de Entregar

### ✅ Checklist Final

- [ ] Todos os arquivos .java estão no .zip?
- [ ] O código está comentado?
- [ ] O código compila sem erros?
- [ ] Testei todas as funcionalidades?
- [ ] Os nomes das variáveis estão claros?
- [ ] O arquivo está nomeado corretamente?
- [ ] Não há código copiado de outros colegas?

---

## 🔧 Alternativa - Exportar Manualmente

Se o Eclipse não estiver disponível:

### Windows:

1. Abra a pasta do projeto
2. Selecione todos os arquivos e pastas
3. Clique com botão direito
4. **Enviar para** → **Pasta compactada**
5. Renomeie para `Cofrinho_SeuNome.zip`

### Via PowerShell:

```powershell
cd "c:\Users\gbr bzzr\Documents\Vs-Code\Faculdade"
Compress-Archive -Path "Cofrinho" -DestinationPath "Cofrinho_SeuNome.zip"
```

---

## 📝 Observações

- **Prazo:** Verifique a data limite no AVA
- **Tamanho:** O arquivo .zip deve ter aproximadamente 5-15 KB
- **Formato:** Somente .zip (não envie .rar ou .7z)
- **Nome:** Use um nome descritivo: `Cofrinho_SeuNomeCompleto.zip`

---

## 🆘 Problemas Comuns

### ❌ "Projeto não compila"
- Verifique se o JDK está instalado
- Clique com direito no projeto → **Properties** → **Java Build Path**
- Certifique-se de que há uma JRE configurada

### ❌ "Arquivo .zip muito grande"
- Não inclua a pasta `bin/` (arquivos compilados)
- Apenas inclua os arquivos `.java` e configurações

### ❌ "Não consigo executar"
- Clique com direito em `Principal.java`
- **Run As** → **Java Application**
- Se não aparecer esta opção, o arquivo não está compilando

---

✅ **Pronto! Seu projeto está pronto para entrega!**
