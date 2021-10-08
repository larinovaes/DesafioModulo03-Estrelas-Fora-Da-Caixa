package br.com.zup;

import java.util.ArrayList;
import java.util.List;

public class ServicoCliente {

    private static List<Cliente> clientes = new ArrayList<>();

    public ServicoCliente() {

    }

    public static Cliente cadastrarCliente(String nome, String cpf, String email) {
        Cliente cliente = new Cliente(nome, cpf, email);
        clientes.add(cliente);
        return cliente;
    }

    public static List<Cliente> exibirClientes() {
        for (Cliente clienteReferencia : clientes) {
            System.out.println(clienteReferencia);
        }
        return clientes;
    }
}
