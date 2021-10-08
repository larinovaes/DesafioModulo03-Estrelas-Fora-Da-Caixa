package br.com.zup;

import java.util.ArrayList;
import java.util.List;

public class ServicoVendedor {

    private static List<Vendedor> vendedores = new ArrayList<>();

    public ServicoVendedor() {

    }

    public static Vendedor cadastrarVendedor(String nome, String cpf, String email) {
        Vendedor vendedor = new Vendedor(nome, cpf, email);
        vendedores.add(vendedor);
        return vendedor;
    }

    public static List<Vendedor> exibirVendedores() {
        for (Vendedor vendedorReferencia : vendedores) {
            System.out.println(vendedorReferencia);
        }
        return vendedores;
    }

    public static void validarEmail(String email) throws Exception {
        if (!email.contains("@")) {
            throw new Exception("E-mail inválido. ");
        }
    }

    public static void verificarEmail(String email) throws Exception {
        for (Vendedor vendedorReferencia : vendedores) {
            if (vendedorReferencia.getEmail().equals(email)) {
                throw new Exception("Este e-mail já está cadastrado. Por favor faça o cadastro novamente! ");
            }
        }
    }

    public static void verificarCPF(String cpf) throws Exception {
        for (Vendedor cpfReferencia : vendedores) {
            if (cpfReferencia.getCpf().equals(cpf)) {
                throw new Exception("Este CPF já está cadastrado. Por favor faça o cadastro novamente! ");
            }
        }
    }
}
