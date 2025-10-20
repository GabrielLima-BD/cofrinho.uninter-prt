package cofrinho;

import java.util.Scanner;

// Programa principal: mostra o menu e conversa com o usuario pelo console
public class Principal {
    
    public static void main(String[] args) {
        
        // Leitor para capturar o que o usuario digita
        Scanner entrada = new Scanner(System.in);
        
        // Onde vamos guardar as moedas
        Cofrinho cofrinho = new Cofrinho();
        
        // Controla o loop do menu
        int opcao = 0;
        
        // Loop principal do programa (sai quando opcao = 5)
        while (opcao != 5) {
            
            // Menu simples
            System.out.println("\n========================================");
            System.out.println("      COFRINHO DE MOEDAS");
            System.out.println("========================================");
            System.out.println("1 - Adicionar moeda");
            System.out.println("2 - Remover moeda");
            System.out.println("3 - Listar moedas");
            System.out.println("4 - Calcular total em Real");
            System.out.println("5 - Sair");
            System.out.print("\nEscolha uma opcao: ");
            
            // Le a opcao do usuario (somente numero inteiro)
            opcao = entrada.nextInt();
            
            // Faz o que o usuario escolheu
            switch (opcao) {
                case 1: // Adicionar moeda
                    adicionarMoeda(entrada, cofrinho);
                    break;
                case 2: // Remover moeda
                    removerMoeda(entrada, cofrinho);
                    break;
                case 3: // Listar moedas
                    cofrinho.listagemMoedas();
                    break;
                case 4: // Calcular total em reais
                    double totalEmReais = cofrinho.totalConvertido();
                    System.out.println("\n** Total no cofrinho: R$ " + String.format("%.2f", totalEmReais));
                    break;
                case 5: // Sair
                    System.out.println("\n** Encerrando o sistema. Ate logo!");
                    break;
                default:
                    System.out.println("\n** Opcao invalida! Tente novamente.");
            }
        }
        
        // Fecha o leitor
        entrada.close();
    }
    
    // Adiciona uma nova moeda no cofrinho
    private static void adicionarMoeda(Scanner entrada, Cofrinho cofrinho) {
        System.out.println("\n--- Adicionar Moeda ---");
        System.out.println("1 - Real (BRL)");
        System.out.println("2 - Dolar (USD)");
        System.out.println("3 - Euro (EUR)");
        System.out.print("Escolha o tipo de moeda: ");
        
        int tipo = entrada.nextInt();
        
        System.out.print("Digite o valor: ");
        double valor = entrada.nextDouble();
        
        // Cria a moeda de acordo com o tipo selecionado
        Moeda moeda = null;
        switch (tipo) {
            case 1:
                moeda = new Real(valor);
                break;
            case 2:
                moeda = new Dolar(valor);
                break;
            case 3:
                moeda = new Euro(valor);
                break;
            default:
                System.out.println("** Tipo de moeda invalido!");
                return;
        }
        
        // Adiciona a moeda criada
        cofrinho.adicionar(moeda);
    }
    
    // Remove um valor de um tipo de moeda (ex.: tirar 5 USD)
    private static void removerMoeda(Scanner entrada, Cofrinho cofrinho) {
        System.out.println("\n--- Remover Moeda ---");
        System.out.println("1 - Real (BRL)");
        System.out.println("2 - Dolar (USD)");
        System.out.println("3 - Euro (EUR)");
        System.out.print("Escolha o tipo de moeda: ");
        
        int tipo = entrada.nextInt();
        
        System.out.print("Digite o valor: ");
        double valor = entrada.nextDouble();
        
        // Cria uma moeda "placeholder" apenas para informar o tipo e valor a remover
        Moeda moeda = null;
        switch (tipo) {
            case 1:
                moeda = new Real(valor);
                break;
            case 2:
                moeda = new Dolar(valor);
                break;
            case 3:
                moeda = new Euro(valor);
                break;
            default:
                System.out.println("** Tipo de moeda invalido!");
                return;
        }
        
        // Pede para o cofrinho remover o valor informado
        cofrinho.remover(moeda);
    }
}