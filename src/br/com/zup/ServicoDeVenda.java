package br.com.zup;

import java.util.ArrayList;
import java.util.List;

public class ServicoDeVenda {

    private static List<Venda> vendas = new ArrayList<>();


    public ServicoDeVenda() {

    }

    public static Venda cadastrarVendas(Cliente nomeDoCliente, Vendedor vendedor, String dataDeRegistro, double valorAserPago) {
        Venda venda = new Venda(nomeDoCliente, vendedor, dataDeRegistro, valorAserPago);
        vendas.add(venda);
        return venda;
    }

    public static List<Venda> exibirVendas() {
        for (Venda vendaReferencia : vendas) {
            System.out.println(vendaReferencia);
        }
        return vendas;
    }
}
