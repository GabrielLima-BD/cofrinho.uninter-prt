package cofrinho;

import java.util.Scanner;

// Classe principal com o menu do sistema
public class Principal {
    
    public static void main(String[] args) {
        
        // Crio o Scanner pra ler o que o usuario digita
        Scanner scanner = new Scanner(System.in);
        
        // Crio o cofrinho onde vou guardar as moedas
        Cofrinho cofrinho = new Cofrinho();
        
        // Variavel pra controlar o loop do menu
        int opcao = 0;
        
        // Loop do menu
        while (opcao != 5) {
            
            // Mostro o menu
            System.out.println("\n========================================");
            System.out.println("      COFRINHO DE MOEDAS");
            System.out.println("========================================");
            System.out.println("1 - Adicionar moeda");
            System.out.println("2 - Remover moeda");
            System.out.println("3 - Listar moedas");
            System.out.println("4 - Calcular total em Real");
            System.out.println("5 - Sair");
            System.out.print("\nEscolha uma opcao: ");
            
            // Leio a opcao escolhida
            opcao = scanner.nextInt();
            
            // Processo a opcao
            switch (opcao) {
                
                case 1: // Adicionar moeda
                    adicionarMoeda(scanner, cofrinho);
                    break;
                    
                case 2: // Remover moeda
                    removerMoeda(scanner, cofrinho);
                    break;
                    
                case 3: // Listar moedas
                    cofrinho.listagemMoedas();
                    break;
                    
                case 4: // Calcular total
                    double total = cofrinho.totalConvertido();
                    System.out.println("\n** Total no cofrinho: R$ " + String.format("%.2f", total));
                    break;
                    
                case 5: // Sair
                    System.out.println("\n** Encerrando o sistema. Ate logo!");
                    break;
                    
                default:
                    System.out.println("\n** Opcao invalida! Tente novamente.");
            }
        }
        
        // Fecho o scanner
        scanner.close();
    }
    
    // Metodo pra adicionar uma moeda
    private static void adicionarMoeda(Scanner scanner, Cofrinho cofrinho) {
        System.out.println("\n--- Adicionar Moeda ---");
        System.out.println("1 - Real (BRL)");
        System.out.println("2 - Dolar (USD)");
        System.out.println("3 - Euro (EUR)");
        System.out.print("Escolha o tipo de moeda: ");
        
        int tipoMoeda = scanner.nextInt();
        
        System.out.print("Digite o valor: ");
        double valor = scanner.nextDouble();
        
        // Crio a moeda de acordo com o tipo escolhido
        Moeda moeda = null;
        
        switch (tipoMoeda) {
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
        
        // Adiciono a moeda no cofrinho
        cofrinho.adicionar(moeda);
    }
    
    // Metodo pra remover uma moeda
    private static void removerMoeda(Scanner scanner, Cofrinho cofrinho) {
        System.out.println("\n--- Remover Moeda ---");
        System.out.println("1 - Real (BRL)");
        System.out.println("2 - Dolar (USD)");
        System.out.println("3 - Euro (EUR)");
        System.out.print("Escolha o tipo de moeda: ");
        
        int tipoMoeda = scanner.nextInt();
        
        System.out.print("Digite o valor: ");
        double valor = scanner.nextDouble();
        
        // Crio a moeda pra poder buscar e remover
        Moeda moeda = null;
        
        switch (tipoMoeda) {
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
        
        // Removo a moeda do cofrinho
        cofrinho.remover(moeda);
    }
}
