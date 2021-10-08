package br.com.zup;

import java.util.ArrayList;
import java.util.List;

public class ServicoDeVenda {

    private static List<Venda> vendas = new ArrayList<>();

    public ServicoDeVenda() {

    }

    public static Venda cadastrarVendas(Cliente cliente, Vendedor responsavel, String dataDeRegistro, double valorAserPago){
        Venda venda = new Venda(cliente,responsavel,dataDeRegistro,valorAserPago);
        vendas.add(venda);
        return venda;
    }
    public static List<Venda> exibirVendas(){
        for (Venda vendaReferencia: vendas) {
            System.out.println(vendaReferencia);
        }
        return vendas;
    }
}
