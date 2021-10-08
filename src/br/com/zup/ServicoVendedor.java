package br.com.zup;

import java.util.ArrayList;
import java.util.List;

public class ServicoVendedor {

    private static List<Venda> vendas = new ArrayList<>();
    private static List<Vendedor> vendedores = new ArrayList<>();

    public ServicoVendedor() {

    }

    public static Vendedor cadastrarVendedor(String nome, String cpf, String email) {
        Vendedor vendedor = new Vendedor(nome, cpf, email);
        vendedores.add(vendedor);
        return vendedor;
    }
    public static List<Vendedor> exibirVendedores(){
        for (Vendedor vendedorReferencia: vendedores) {
            System.out.println(vendedorReferencia);
        }
        return vendedores;
    }
}
