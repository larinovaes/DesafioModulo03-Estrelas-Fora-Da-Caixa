package br.com.zup;

import java.util.Scanner;

public class Sistema {

    public static Scanner dadosUsarios(String mensagem) {
        System.out.println(mensagem);
        return new Scanner(System.in);
    }

    public static Vendedor cadastrarVendedor() throws Exception {
        String nome = dadosUsarios("Digite o nome do vendedor: ").nextLine();
        String cpf = dadosUsarios("Digite o CPF do vendedor: ").nextLine();
        String email = dadosUsarios("Digite o email do vendedor: ").nextLine();
        ServicoVendedor.verificarCPF(cpf);
        ServicoVendedor.validarEmail(email);
        ServicoVendedor.verificarEmail(email);
        return ServicoVendedor.cadastrarVendedor(nome, cpf, email);
    }

    public static Cliente cadastrarCliente() throws Exception {
        String nome = dadosUsarios("Digite o nome do cliente: ").nextLine();
        String cpf = dadosUsarios("Digite o CPF do cliente: ").nextLine();
        String email = dadosUsarios("Digite o E-mail do cliente: ").nextLine();
        ServicoCliente.verificarCPF(cpf);
        ServicoCliente.validarEmail(email);
        ServicoCliente.verificarEmail(email);
        return ServicoCliente.cadastrarCliente(nome, cpf, email);
    }

    public static Venda cadastrarVendas() {
        String dataDeRegistro = dadosUsarios("Digite a data que a compra foi efetuada: ").nextLine();
        double valorAserPago = dadosUsarios("Digite o valor a ser pago: ").nextDouble();
        return ServicoDeVenda.cadastrarVendas(dataDeRegistro, valorAserPago);
    }

    public static void menu() {
        System.out.println("======================== REGISTRO DE VENDAS SANTA LUCIA ==========================");
        System.out.println("Digite [1] para cadastrar um vendedor: ");
        System.out.println("Digite [2] para cadastrar um cliente: ");
        System.out.println("Digite [3] para cadastrar uma venda: ");
        System.out.println("Digite [4] para ver vendas: ");
        System.out.println("Digite [5] para ver todos os vendedores cadastrados: ");
        System.out.println("Digite [6] para ver todos os clientes cadastrados: ");
        System.out.println("Digite [7] para sair do programa: ");
    }

    public static boolean executarSistem() throws Exception {

        boolean repeticao = true;

        while (repeticao) {
            menu();
            int opcoesDeMenu = dadosUsarios("Digite sua opção:").nextInt();

            if (opcoesDeMenu == 1) {
                Vendedor vendedor = cadastrarVendedor();
            } else if (opcoesDeMenu == 2) {
                Cliente cliente = cadastrarCliente();
            } else if (opcoesDeMenu == 3) {
                Venda venda = cadastrarVendas();
            } else if (opcoesDeMenu == 4) {
                ServicoDeVenda.exibirVendas();
            } else if (opcoesDeMenu == 5) {
                ServicoVendedor.exibirVendedores();
            } else if (opcoesDeMenu == 6) {
                ServicoCliente.exibirClientes();
            } else if (opcoesDeMenu == 7) {
                System.out.println("Você saiu do programa!");
                repeticao = false;
            } else {
                System.out.println("Digite um valor válido.");
            }
        }
        return repeticao;
    }
}
