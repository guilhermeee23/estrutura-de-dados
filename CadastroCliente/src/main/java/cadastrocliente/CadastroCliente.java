/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package cadastrocliente;

import java.util.Scanner;

/**
 *
 * @author Guilherme Antunes
 */
public class CadastroCliente {

    private static ListaDuplamenteEncadeada lista = new ListaDuplamenteEncadeada();
    private static Scanner s = new Scanner(System.in);

    public static void main(String[] args) {
        int opcao;
        do {
            exibirMenu();
            opcao = s.nextInt();
            s.nextLine();
            switch (opcao) {
                case 1:
                    addCliente();
                    break;
                case 2:
                    removerCliente();
                    break;
                case 3:
                    alterarCliente();
                    break;
                case 4:
                    buscarCliente();
                    break;
                case 5:
                    exibirClientes();
                    break;
                case 0:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        } while (opcao != 0);
    }

    private static void exibirMenu() {
        System.out.println("\nMenu:");
        System.out.println("1. Adicionar Cliente");
        System.out.println("2. Remover Cliente");
        System.out.println("3. Alterar Cliente");
        System.out.println("4. Buscar Cliente");
        System.out.println("5. Exibir Todos os Clientes");
        System.out.println("0. Sair");
        System.out.print("Escolha uma opção: ");
    }

    private static void addCliente() {
        System.out.print("Código: ");
        int codigo = s.nextInt();
        s.nextLine();

        System.out.print("Nome: ");
        String nome = s.nextLine();

        System.out.print("Data de Nascimento: ");
        String dtNascimento = s.nextLine();

        System.out.print("Telefone: ");
        String fone = s.nextLine();

        Cliente cliente = new Cliente(codigo, nome, dtNascimento, fone);
        lista.adicionar(cliente);
        System.out.println("Cliente adicionado com sucesso!");
    }

    private static void removerCliente() {
        System.out.print("Código do Cliente a remover: ");
        int codigo = s.nextInt();
        s.nextLine();

        if (lista.remover(codigo)) {
            System.out.println("Cliente removido com sucesso!");
        } else {
            System.out.println("Cliente não encontrado!");
        }
    }

    private static void alterarCliente() {
        System.out.print("Código do Cliente a alterar: ");
        int codigo = s.nextInt();
        s.nextLine();

        Cliente cliente = lista.buscar(codigo);
        if (cliente == null) {
            System.out.println("Cliente não encontrado!");
            return;
        }

        System.out.print("Novo Nome: ");
        String nome = s.nextLine();
        cliente.setNome(nome);

        System.out.print("Nova Data de Nascimento: ");
        String dtNascimento = s.nextLine();
        cliente.setDtNascimento(dtNascimento);

        System.out.print("Novo Fone: ");
        String fone = s.nextLine();
        cliente.setFone(fone);

        System.out.println("Cliente alterado com sucesso!");
    }

    private static void buscarCliente() {
        System.out.print("Código do Cliente: ");
        int codigo = s.nextInt();
        s.nextLine();

        Cliente cliente = lista.buscar(codigo);
        if (cliente == null) {
            System.out.println("Cliente não encontrado!");
        } else {
            System.out.println(cliente);
        }
    }

    private static void exibirClientes() {
        System.out.println("Lista de todos os clientes:");
        lista.exibirTodos();
    }
}
