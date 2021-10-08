package br.com.zup;

import java.util.Scanner;

public class Sistema {

    public static Scanner dadosUsarios(String mensagem) {
        System.out.println(mensagem);
        return new Scanner(System.in);
    }

    public static Vendedor cadastrarVendedor(){
        String nome = dadosUsarios("Digite o nome do vendedor: ").nextLine();
        String cpf = dadosUsarios("Digite o CPF do vendedor: ").nextLine();
        String email = dadosUsarios("Digite o email do vendedor: ").nextLine();

        return ServicoVendedor.cadastrarVendedor(nome,cpf,email);
    }
    public static Cliente cadastrarCliente(){
        String nome = dadosUsarios("Digite o nome do cliente: ").nextLine();
        String cpf = dadosUsarios("Digite o CPF do cliente: ").nextLine();
        String email = dadosUsarios("Digite o email do cliente: ").nextLine();
        return ServicoCliente.cadastrarCliente(nome,cpf,email);
    }
}
