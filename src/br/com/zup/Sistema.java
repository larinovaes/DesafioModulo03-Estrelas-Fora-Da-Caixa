package br.com.zup;

import java.util.Scanner;

public class Sistema {

    public static Scanner dadosUsarios(String mensagem) {
        System.out.println(mensagem);
        return new Scanner(System.in);
    }

    public static Vendedor cadastrarVendedor() {
        String nome = dadosUsarios("Digite o nome do vendedor: ").nextLine();
        String cpf = dadosUsarios("Digite o CPF do vendedor: ").nextLine();
        String email = dadosUsarios("Digite o email do vendedor: ").nextLine();

        return ServicoVendedor.cadastrarVendedor(nome, cpf, email);
    }

    public static Cliente cadastrarCliente() {
        String nome = dadosUsarios("Digite o nome do cliente: ").nextLine();
        String cpf = dadosUsarios("Digite o CPF do cliente: ").nextLine();
        String email = dadosUsarios("Digite o email do cliente: ").nextLine();
        return ServicoCliente.cadastrarCliente(nome, cpf, email);
    }

    public static Venda CadastrarVendas() {
        Vendedor vendedor = cadastrarVendedor();
        Cliente cliente = cadastrarCliente();
        String dataDeRegistro = dadosUsarios("Digite a data que a compra foi efetuada: ").nextLine();
        double valorAserPago = dadosUsarios("Digite o valor a ser pago: ").nextDouble();

        return ServicoDeVenda.cadastrarVendas(cliente, vendedor, dataDeRegistro, valorAserPago);
    }

    public static void menu(){
        System.out.println("======================== REGISTRO DE VENDAS SANTA LUCIA ==========================");
        System.out.println("Digite [1] para cadastrar um vendedor: ");
        System.out.println("Digite [2] para cadastrar um cliente: ");
        System.out.println("Digite [3] para cadastrar uma venda: ");
        System.out.println("Digite [4] para ver vendas: ");
        System.out.println("Digite [5] para ver todos os vendedores cadastrados: ");
        System.out.println("Digite [6] para ver todos os clientes cadastrados: ");
        System.out.println("Digite [7] para sair do programa: ");
    }
}
